package com.chinasofti.service.impl;

import com.chinasofti.dao.QuestionDao;
import com.chinasofti.model.Question;
import com.chinasofti.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public List<Question> queryList(){
        return questionDao.findAll();
    }
}
