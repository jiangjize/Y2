import cn.jjz.pojo.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/15.
 */
public class AccTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;
    @Test
    public void aVoid() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Account account=new Account();
        account.setAccount_number("12345611");
        account.setBalance(321321.44);
        account.setStatus(2);
        account.setPassword("1231321");
        session.save(account);
        tx.commit();
    }
}
