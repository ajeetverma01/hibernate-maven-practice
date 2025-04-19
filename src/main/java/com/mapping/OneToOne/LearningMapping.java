package com.mapping.OneToOne;


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

        Question q1 = (Question)session.get(Question.class, 1);
        System.out.println("Question id: " + q1.getQuesId());
        System.out.println("Question: "+ q1.getQues());
        System.out.println("Answer id: "+q1.getAns().getAnsId());
        System.out.println("Answer: " + q1.getAns().getAns());


        sFac.close();
        session.close();
    }
}
