import cn.jjz.pojo.Emp;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2017/10/6.
 */
public class PageListTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;
    @Test
    public void ch() {
        /*
        * 分页
        * */
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        String hql="from Emp";
        Query query=session.createQuery(hql);
        int index=1;
        int size=3;
        query.setFirstResult((index-1)*size);
        query.setMaxResults(size);
        List<Emp> list=query.list();
        for (Emp e:list){
            System.out.println(e.getEname());
        }
    }
}
