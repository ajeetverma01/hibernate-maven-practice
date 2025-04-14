package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    int ansId;
    String ans;

    @OneToOne(mappedBy = "ans")
    Question question;
    public int getAnsId() {
        return ansId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer() {
        super();
    }


    public Answer(int ansId, String ans) {
        super();
        this.ansId = ansId;
        this.ans = ans;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }
    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

}
