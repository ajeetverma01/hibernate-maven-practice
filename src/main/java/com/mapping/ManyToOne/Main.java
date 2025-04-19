package com.mapping.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure().addAnnotatedClass(Test1.class).addAnnotatedClass(Test2.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        // Create parent object
        Test2 parent1 = new Test2(1, "Department A");
        Test2 parent2 = new Test2(2, "Department B");

        // Create child objects
        Test1 child1 = new Test1(101, "Employee 1", parent1);
        Test1 child2 = new Test1(102, "Employee 2", parent1);
        Test1 child3 = new Test1(103, "Employee 3", parent2);

        // Save parent first
        session.save(parent1);
        session.save(parent2);

        // Then save children
        session.save(child1);
        session.save(child2);
        session.save(child3);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("Data saved successfully!");
    }
}
