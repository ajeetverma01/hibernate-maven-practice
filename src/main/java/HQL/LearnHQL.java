package HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LearnHQL {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session session = sFac.openSession();





        sFac.close();
        session.close();
    }
}
