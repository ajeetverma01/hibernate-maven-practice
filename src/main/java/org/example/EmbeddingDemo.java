package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddingDemo {
    public static void main(String[] args) {
        Configuration cfg =new Configuration().configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session session = sFac.openSession();
        Transaction tr = session.beginTransaction();

        Student s1= new Student(11,"Ajeet Verma", "village");

//        Since certificate class has two variables, we have to create the obj of it so that we can pass it
//        as an obj:
        Certificate certificate = new Certificate();
        certificate.setCourse("BCA");
        certificate.setDuration("3 years");
        s1.setC1(certificate);

        session.persist(s1);
        tr.commit();


        sFac.close();
        session.close();
    }
}