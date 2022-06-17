package com.chinasofti.controller;

import com.alibaba.fastjson.JSON;
import com.chinasofti.model.AnswerStatistics;
import com.chinasofti.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.lang.Long;

@RestController
@RequestMapping("/answerStatistics")

public class AnswerStatisticsController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping("/save")
    public String save(Long questionId, int answerSum, int correctSum){
        List<AnswerStatistics> list=answerService.save(questionId,answerSum,correctSum);

        return JSON.toJSONString(list);
    }
}
