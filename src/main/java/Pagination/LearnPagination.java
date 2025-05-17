package Pagination;

import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class LearnPagination {
    public static void main(String[] args) {
        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session s = sFac.openSession();
        Query<Student> q1 = s.createQuery("from Student", Student.class);

//        Implementing pagination
        q1.setFirstResult(0);
        q1.setMaxResults(3);
        List<Student> list = q1.list();
        s.close();
        sFac.close();

    }
}
