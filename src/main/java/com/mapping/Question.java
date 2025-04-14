package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
    @Id
    int quesId;
    String ques;
    @OneToOne
    @JoinColumn(name = "ans_id")
    Answer ans;

    public Answer getAns() {
        return ans;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }


    public Question(int quesId, String ques) {
        super();
        this.quesId = quesId;
        this.ques = ques;
    }

    public Question() {
        super();
    }

    public int getQuesId() {
        return quesId;
    }

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }
}
