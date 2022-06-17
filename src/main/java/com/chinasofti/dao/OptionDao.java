package com.chinasofti.dao;

import com.chinasofti.model.Option;
import com.chinasofti.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionDao extends JpaRepository<Option,Long> {

}
