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

        Student s= new Student(2, "John", "uk");

        Session session = sFac.openSession();
        Transaction tr =session.beginTransaction();
//        session.save(s);  //The save() method is deprecated.
        session.persist(s); //can be used for saving.
        tr.commit();

        sFac.close();
        session.close();
    }
}
