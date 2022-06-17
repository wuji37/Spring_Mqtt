package com.chinasofti.dao;

import com.chinasofti.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao  extends JpaRepository<Question,Long> {

}
