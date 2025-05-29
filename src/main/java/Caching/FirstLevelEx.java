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


        Student stu1 = s.get(Student.class, 1);
        System.out.println(stu1);
        Student stu2 = s.get(Student.class, 1);
        System.out.println(stu2);
        Student stu3 = s.get(Student.class, 1);
        System.out.println(stu3);



        Transaction t = s.beginTransaction();
        t.commit();
        sFac.close();
        s.close();
    }
}
