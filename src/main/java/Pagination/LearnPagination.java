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

    }
}
