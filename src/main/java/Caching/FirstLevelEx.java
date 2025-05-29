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






        Transaction t = s.beginTransaction();
        t.commit();
        sFac.close();
        s.close();
    }
}
