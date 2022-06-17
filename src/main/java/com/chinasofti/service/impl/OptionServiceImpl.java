package com.chinasofti.service.impl;

import com.chinasofti.dao.OptionDao;
import com.chinasofti.model.Option;
import com.chinasofti.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    private OptionDao optionDao;

    public List<Option> queryList(){
//        System.out.println(id);  soup
//        optionDao.findById((long) id);
        return optionDao.findAll();
    }

//    public static void main(String[] args) {  psvm
//
//    }
}
