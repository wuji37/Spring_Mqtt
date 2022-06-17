package com.chinasofti.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="t_answer_statistics")
public class AnswerStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="a_id")
    private Long id;

    @Column(name="answerer_date")
    private Date answerDate;

    @Column(name = "answer_sum")
    private int answerSum;

    @Column(name = "correct_sum")
    private int correctSum;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name="q_id")
    private Long questionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    public int getAnswerSum() {
        return answerSum;
    }

    public void setAnswerSum(int answerSum) {
        this.answerSum = answerSum;
    }

    public int getCorrectSum() {
        return correctSum;
    }

    public void setCorrectSum(int correctSum) {
        this.correctSum = correctSum;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}
