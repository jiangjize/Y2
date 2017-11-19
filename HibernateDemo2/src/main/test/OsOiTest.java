import cn.jjz.pojo.zhujieonetomany.Oi;
import cn.jjz.pojo.zhujieonetomany.Os;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

/**
 * Created by lenovo on 2017/10/14.
 */
public class OsOiTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;

    @Test
    public void Add() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Os d = new Os();  //yi
        d.setTitle("java难学吗？");
        d.setCreateDate("2017-10-21");
        d.setTotalVotes(7);
        d.setViewTimes(7);
        Oi e = new Oi(); //duo
        e.setOptContent("难");
        e.setVote(3);
        d.getOis().add(e);
        Oi e2 = new Oi(); //duo
        e2.setOptContent("特别难");
        e2.setVote(1);
        d.getOis().add(e2);
        Oi e3 = new Oi(); //duo
        e3.setOptContent("简单");
        e3.setVote(3);
        d.getOis().add(e3);
        e.setOs(d);
        session.save(d);
        tx.commit();
    }

    @Test
    public void Select() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Os d = new Os();  //yi
        Os j = session.get(Os.class, 129);
        System.out.println(j.getTitle() + " " + j.getOis().iterator().next().getOptContent());
        tx.commit();

    }
}
