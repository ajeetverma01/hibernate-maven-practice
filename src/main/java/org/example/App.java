package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Starting the project" );

//        We can create another class for providing sessions only (Will be creating at the time of projects)
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sFac= cfg.buildSessionFactory();
        Session session = sFac.openSession();
        Transaction tr =session.beginTransaction();


        Student s= new Student(21, "Rah", "uk");
        Student s2= new Student(63, "Sah", "gonda");
        Certificate c1 = new Certificate("BCA","3 year");
        s.setC1(c1);
        s2.setC1(c1);
//        session.save(s);  //The save() method is deprecated.
        session.persist(s); //can be used for saving.
        session.persist(s2);
//        FileInputStream fis = new FileInputStream("src/main/java/a.png");
//        byte[] img = new byte[fis.available()];
//        fis.read(img);
//        InsertingImage i1=new InsertingImage(1,"Ajeet", img);
//        session.persist(i1);
//
//        LearningAnnotations l1 = new LearningAnnotations(1,"gonda","city", true,new Date(), 1.5, img);
//        session.save(l1);




        tr.commit();
        sFac.close();
        session.close();
    }
}
