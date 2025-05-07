package HQL;

import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class LearnHQL {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session session = sFac.openSession();

        String query1 = "from Student"; // Student is the name of the entity
        Query q1 = session.createQuery(query1);
        List<Student> l1 = q1.list();

        for (Student s1 : l1
             ) {
            System.out.println("Name of student is : " + s1.getName());
        }



        sFac.close();
        session.close();
    }
}
