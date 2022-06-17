package com.chinasofti.controller;

import com.alibaba.fastjson.JSON;
import com.chinasofti.model.Question;
import com.chinasofti.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")    //访问类方法
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/queryList")  //类似通过网址访问
    public String queryList(){
        List<Question> questionList=questionService.queryList();

        return JSON.toJSONString(questionList);  //将String类型转变成json类型
    }

}
