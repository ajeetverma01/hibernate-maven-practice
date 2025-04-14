package com.mapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LearningMapping {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session session = sFac.openSession();
        Transaction tr = session.beginTransaction();

        Question question1 = new Question();
        question1.setQuesId(1);
        question1.setQues("What is java");

        Answer answer = new Answer();
        answer.setAnsId(1);
        answer.setAns("programming language");

        question1.setAns(answer);

        session.persist(question1);
        session.persist(answer);

        tr.commit();
        sFac.close();
        session.close();
    }
}
