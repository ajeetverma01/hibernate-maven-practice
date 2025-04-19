package com.mapping.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sFac = cfg.buildSessionFactory();

        Employee e1 = new Employee(1,"e1");
        Employee e2 = new Employee(2,"e2");

        Assignment a1 = new Assignment(11,"a1");
        Assignment a2 = new Assignment(22,"a2");
        List<Assignment>assignments=new ArrayList<Assignment>();
        List<Employee> employees = new ArrayList<Employee>();

        assignments.add(a2);
        assignments.add(a1);
        employees.add(e1);
        employees.add(e2);

        e1.setAssignments(assignments);
        a2.setEmployees(employees);

        Session session = sFac.openSession();
        Transaction tx = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(a1);
        session.save(a2);

        tx.commit();
        session.close();
        sFac.close();
    }
}
