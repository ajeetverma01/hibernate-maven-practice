package Caching;

import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevelEx {
    public static void main(String[] args) {
        SessionFactory sFac = new Configuration().configure().buildSessionFactory();
        Session s = sFac.openSession();

//        By default enabled
        Student stu = s.get(Student.class, 1);
        System.out.println(stu);






        Transaction t = s.beginTransaction();
        t.commit();
        sFac.close();
        s.close();
    }
}
