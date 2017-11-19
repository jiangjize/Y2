import cn.jjz.pojo.zhujiemanytomany.Game;
import cn.jjz.pojo.zhujiemanytomany.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/11.
 */
public class GameTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;
    @Test
    public void manytomanyTest(){
        /*
        * 多对多注解
        * */
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Game g=new Game();
        Player p=new Player();
        g.setGname("CF");
        p.setPname("蒋XX");
        Game g2=new Game();
        Player p2=new Player();
        g2.setGname("QF");
        p2.setPname("亮XX");
        g.getPlayer().add(p);
        g.getPlayer().add(p2);
        g2.getPlayer().add(p);
        g2.getPlayer().add(p2);
        session.save(g);
        session.save(g2);
        tx.commit();
    }
}
