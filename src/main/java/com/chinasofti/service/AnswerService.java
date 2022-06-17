package com.chinasofti.service;

import com.chinasofti.model.AnswerStatistics;

import java.util.List;

public interface AnswerService {

    public abstract List<AnswerStatistics> save(Long questionId, int answerSum, int correctSum);
}
