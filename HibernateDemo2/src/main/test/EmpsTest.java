import cn.jjz.pojo.onetomany.Dept;
import cn.jjz.pojo.onetomany.Emps;
import cn.jjz.service.EmpsService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/8.
 */
public class EmpsTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;
    @Test
    /*
    * 一对多 多对多的关联查询策略
    * */
    public void OnetoManyLazyTest(){
        Emps e=new EmpsService().Get(2);

    }



    @Test
    public void addEmps() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Emps emps=new Emps();
        emps.setEname("小亮");
        Dept dept=new Dept();
        dept.setDeptno(1);
        emps.setDept(dept);
        session.save(emps);
        tx.commit();
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

}
