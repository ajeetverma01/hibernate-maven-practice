package Cascading;

import com.OneToMany.Answer;
import com.OneToMany.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
public class CascadingEx {
    //Cascading means performing operations of each related entity

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
        List<Answer> list =new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        q1.setAnswers(list);
        Transaction t = s.beginTransaction();
        s.persist(q1);
        t.commit();
        sFac.close();
        s.close();
    }
}
