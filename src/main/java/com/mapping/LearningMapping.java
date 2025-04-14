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



        tr.commit();
        sFac.close();
        session.close();
    }
}
