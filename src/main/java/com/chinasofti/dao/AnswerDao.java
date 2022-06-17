package com.chinasofti.dao;

import com.chinasofti.model.AnswerStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerDao extends JpaRepository<AnswerStatistics,Long> {

}
