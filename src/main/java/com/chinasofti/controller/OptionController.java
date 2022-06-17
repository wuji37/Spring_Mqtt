package com.chinasofti.controller;

import com.alibaba.fastjson.JSON;
import com.chinasofti.model.Option;
import com.chinasofti.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/option")
public class OptionController {


    @Autowired
    private OptionService optionService;

    @RequestMapping("/queryListByQuestionId")
    public String queryListByQuestionId(){

        List<Option> optionList=optionService.queryList();

        return JSON.toJSONString(optionList);
    }

    @RequestMapping("/qId")
    public String qId(int id){

        List<Option> list=new ArrayList<>();

        List<Option> optionList=optionService.queryList();
        for (Option option : optionList) {
            if(option.getqId()==id){
                System.out.println(option);
                list.add(option);
            }
        }

        return JSON.toJSONString(list);
    }
}
