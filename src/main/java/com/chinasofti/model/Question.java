package com.chinasofti.model;

import javax.persistence.*;

@Entity
@Table(name="t_question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //设置主键自增
    @Column(name="q_id")    //绑定q_id列
    private Long id;

    @Column(name="q_num")
    private Integer num;


    @Column(name="q_stem")
    private String stem;


    public String getStem() {
        return stem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
