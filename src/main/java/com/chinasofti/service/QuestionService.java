package com.chinasofti.service;

import com.chinasofti.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionService{

    public abstract List<Question> queryList();
}
