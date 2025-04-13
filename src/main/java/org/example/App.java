package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Starting the project" );

//        We can create another class for providing sessions only (Will be creating at the time of projects)
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sFac= cfg.buildSessionFactory();

        Student s= new Student(2, "John", "uk");

        Session session = sFac.openSession();
        Transaction tr =session.beginTransaction();


        FileInputStream fis = new FileInputStream("src/main/java/a.png");
        byte[] img = new byte[fis.available()];
        fis.read(img);
        InsertingImage i1=new InsertingImage(1,"Ajeet", img);
        session.persist(i1); //can be used for saving.

//        session.save(s);  //The save() method is deprecated.
        session.persist(s); //can be used for saving.
        tr.commit();

        sFac.close();
        session.close();
    }
}
