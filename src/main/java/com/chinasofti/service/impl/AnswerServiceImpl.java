package com.chinasofti.service.impl;

import com.chinasofti.dao.AnswerDao;
import com.chinasofti.model.AnswerStatistics;
import com.chinasofti.service.AnswerService;
import com.sun.glass.ui.Clipboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    public List<AnswerStatistics> save(Long questionId, int answerSum, int correctSum) {

        AnswerStatistics answer=new AnswerStatistics();
        List<AnswerStatistics> list=new ArrayList<>();
        answer.setQuestionId(questionId);
        answer.setAnswerSum(answerSum);
        answer.setCorrectSum(correctSum);

        list=answerDao.findAll();
        list.add(answer);

        for (AnswerStatistics answerStatistics : list) {
            System.out.println(answerStatistics.getAnswerSum());
        }

        answerDao.saveAllAndFlush(list);

        return answerDao.findAll();
    }
}