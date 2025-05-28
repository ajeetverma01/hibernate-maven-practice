package Cascading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CascadingEx {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sFac = cfg.buildSessionFactory();
        Session s = sFac.openSession();

        Question q1 = new Question();
        q1.setQuesId(5);
        q1.setQues("What is cascading");

        Answer a1 = new Answer(1111, "imp concept");
        Answer a2 = new Answer(2222, "2 concept");
        Answer a3 = new Answer(2333, "3 concept");

    }
}
