/*

import cn.jjz.pojo.Options;
import cn.jjz.pojo.Subjects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

*/
/**
 * Created by lenovo on 2017/10/14.
 *//*

public class test1 {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;
    @Test
    public void a(){

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Subjects s=new Subjects();
        s.setTitle("学java难吗？");
        s.setTotalVotes(12);
        s.setViewTimes(12);
        s.setCreateDate(new Date());
        session.save(s);
        tx.commit();
    }
    @Test
    public void a2(){

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Options s=new Options();
        s.setOptContent("难");
        s.setSid(113);
        s.setVote(2);
        session.save(s);
        tx.commit();
    }
}
*/
