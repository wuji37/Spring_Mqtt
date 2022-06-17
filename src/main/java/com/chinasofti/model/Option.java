package com.chinasofti.model;

import javax.persistence.*;

@Entity
@Table(name="t_option")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="o_id")
    private Integer id;

    @Column(name="o_answer")
    private Boolean answer;

    @Column(name="o_num")
    private String num;

    @Column(name="o_content")
    private String content;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    @Column(name="o_q_id")
    private Integer qId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
