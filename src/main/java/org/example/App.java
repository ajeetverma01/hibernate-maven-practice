package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Starting the project" );

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sFac= cfg.buildSessionFactory();

        Student s= new Student(1, "Ajeet", "gonda");

        Session session = sFac.openSession();
        Transaction tr =session.beginTransaction();
        session.save(s);
        tr.commit();

        sFac.close();
        session.close();
    }
}
