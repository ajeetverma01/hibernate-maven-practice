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


        Student s= new Student(2, "John", "uk");
//        session.save(s);  //The save() method is deprecated.
        session.persist(s); //can be used for saving.

        FileInputStream fis = new FileInputStream("src/main/java/a.png");
        byte[] img = new byte[fis.available()];
        fis.read(img);
        InsertingImage i1=new InsertingImage(1,"Ajeet", img);
        session.persist(i1);

        LearningAnnotations l1 = new LearningAnnotations(1,"gonda","city", true,new Date(), 1.5, img);
        session.save(l1);




        tr.commit();
        sFac.close();
        session.close();
    }
}
