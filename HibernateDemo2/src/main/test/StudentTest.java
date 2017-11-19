import cn.jjz.pojo.zhujie.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/11.
 */
public class StudentTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;

    @Test
    public void c() {
        /*
        * 注解添加学生表
        * */
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Student s = new Student();
        s.setSname("李四");
        session.save(s);
        tx.commit();
    }
}
