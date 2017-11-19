import cn.jjz.pojo.zhujie.Student;
import cn.jjz.pojo.zhujieonetoone.Card;
import cn.jjz.pojo.zhujieonetoone.Humen;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/11.
 */
public class HumenTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;
    @Test
    public void c() {
        /*
        * 一对一注解  添加操作
        * */
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Humen humen=new Humen();
        Card card=new Card();
        humen.setHname("蒋济泽");
        card.setCname("身份证");
        card.setHumen(humen);
        humen.setCard(card);
        session.save(humen);
        session.save(card);
        tx.commit();
    }
}
