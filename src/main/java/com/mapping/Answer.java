package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
    @Id
    int ansId;
    String ans;
    public int getAnsId() {
        return ansId;
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
