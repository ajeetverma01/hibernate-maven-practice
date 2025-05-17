package Pagination;

import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class LearnPagination {
    public static void main(String[] args) {
        SessionFactory sFac = new Configuration().configure().buildSessionFactory();
        Session s = sFac.openSession();
    }
}
