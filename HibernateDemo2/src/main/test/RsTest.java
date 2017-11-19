import cn.jjz.pojo.Rs;
import cn.jjz.service.RsService;
import cn.jjz.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import java.util.List;
import java.util.Queue;


/**
 * Created by lenovo on 2017/9/22.
 */
public class RsTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;

    @Test
    public void c() {
        /*
        * 查询
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Rs r = new Rs();
        session.load(Rs.class, 2);
        System.out.println(r.getName());
        session.close();
        sf.close();
    }
    @Test
    public void ch() {
        /*
        * 查询
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Rs r = new Rs();
        List<Rs> l= session.createQuery("from Rs").list();
       for (Rs d:l){
           System.out.println(d.getName());
       }
        session.close();
        sf.close();
    }
    @Test
    public void ch2() {
        /*
        * 带参数查询    参数位置绑定
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Rs r = new Rs();
      Query q=session.createQuery("from Rs where name=?");
      q.setParameter(0,"xcx");
      List<Rs>l=q.list();
        for (Rs d:l){
            System.out.println(d.getName()+" "+d.getId()+" "+d.getAge());
        }
        session.close();
        sf.close();
    }

    @Test
    public void ch3() {
        /*
        * 带参数查询    参数名称绑定
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Rs r = new Rs();
        Query q=session.createQuery("from Rs where name=:n");
        q.setParameter("n","xcx");
        List<Rs>l=q.list();
        for (Rs d:l){
            System.out.println(d.getName()+" "+d.getId()+" "+d.getAge());
        }
        session.close();
        sf.close();
    }

    @Test
    public void b(){
     /*
     * 删除
     * */
        cfg=new Configuration().configure();
        sf= cfg.buildSessionFactory();
        session=sf.openSession();
        tx=session.beginTransaction();
        Rs r=new Rs();
        r.setId("1");
        session.delete(r);
        tx.commit();
        session.close();
        sf.close();
    }
    @Test
    public void add(){
        Configuration cf=new Configuration().configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Rs stu=new Rs();
        stu.setName("海四达2");
        stu.setAge(23);
        s.save(stu);
        s.close();
        sf.close();
    }
    @Test
    public void add2(){
        Rs stu=new Rs();
        stu.setName("海四达22");
        stu.setAge(23);
        new RsService().addRsInfo(stu);

    }
    @Test
    public void  query(){
        RsService s=new RsService();
       List<Rs> l= s.queryrs();
        for (Rs r:l){
            System.out.println(r.getName()+" "+r.getAge()+" "+r.getId());
        }
    }
    @Test
    public void  query2(){
        RsService s=new RsService();
        List<Rs> l= s.queryrs();
        for (Rs r:l){
            System.out.println(r.getName()+" "+r.getAge()+" "+r.getId());
        }
    }
    @Test
    public void a(){
          //*
         // ** 添加
          //*
        cfg=new Configuration().configure();
        sf=cfg.buildSessionFactory();
        session=sf.openSession();
        tx=session.beginTransaction();
        Rs stu=new Rs();
        stu.setName("海四达");
        stu.setAge(23);
        session.save(stu);
        tx.commit();
        if (session!=null&&session.isOpen()){
            session.close();
            sf.close();
        }

}
    @Test
    public void update(){
        //*
        // ** 修改方法对比
        //*
        cfg=new Configuration().configure();
        sf=cfg.buildSessionFactory();
        session=sf.openSession();
        tx=session.beginTransaction();
        Rs stu=new Rs();
        stu.setName("海22");
        stu.setAge(22);
        stu.setId("40288fbc5eb6a263015eb6a269a50000");
        session.saveOrUpdate(stu);
        tx.commit();
        if (session!=null&&session.isOpen()){
            session.close();
            sf.close();
        }

    }
}
