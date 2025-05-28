package Cascading;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CascadingEx {
    public static void main(String[] args) {
        SessionFactory sFac = new Configuration().configure().buildSessionFactory();

    }
}
