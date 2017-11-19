import cn.jjz.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

/**
 * Created by lenovo on 2017/9/17.
 */
public class StudentTest {
    @Test
    public void Add(){
        Configuration cfg = null;
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        cfg=new Configuration().configure();
        ServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
        sf=cfg.buildSessionFactory(registry);
        session=sf.openSession();
        tx=session.beginTransaction();
        Student stu=new Student();
        stu.setName("jjz");
        stu.setAge(23);
        session.save(stu);

        if (session!=null&&session.isOpen()){
            session.close();
            sf.close();
        }
    }
}
