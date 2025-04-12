package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataFetching {

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure(); // If hibernate.cfg.xml file is not at the resources
        // folder then provide full path
//        cfg.configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session session = sFac.openSession();

//        Fetching data using get() method (working)
        Student s1  = (Student)session.get( Student.class,1);
        System.out.println("USing get()");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());


//  Fetching data using load() method (working)
        Student s2  = (Student)session.load(Student.class,2);
        System.out.println("Using load()");
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s2.getAddress());
    }
}
