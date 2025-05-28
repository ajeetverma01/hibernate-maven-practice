package Cascading;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CascadingEx {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sFac = cfg.buildSessionFactory();

    }
}
