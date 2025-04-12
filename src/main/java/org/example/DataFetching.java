package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataFetching {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session session = sFac.openSession();
        Student s1  = (Student)session.get( Student.class,1);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
    }
}
