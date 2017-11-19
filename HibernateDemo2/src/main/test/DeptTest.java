import cn.jjz.dao.DeptDao;
import cn.jjz.pojo.onetomany.Dept;
import cn.jjz.pojo.onetomany.Emps;
import cn.jjz.service.DeptService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2017/10/8.
 */
public class DeptTest {
    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;

    @Test
    public void onetomanyLazyTest() {
        Dept d = new DeptService().Get(1);
    }

    @Test
    public void onetomanyLazyLoadTest() {
        Dept d = (Dept) new DeptService().Load(Dept.class, 1);
        System.out.println(d.getDeptname());

    }

    @Test
    public void selectDeptGet() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Dept dept = new Dept();
        dept = session.get(Dept.class, 3);
        System.out.println(dept.getDeptname());
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    @Test
    public void selectDeptLoad() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Dept dept = new Dept();
        dept = session.load(Dept.class, 2);
        System.out.println(dept.getDeptname());
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    @Test
    public void addDeptSave() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Dept dept = new Dept();
        dept.setDeptname("小卖部");
        session.save(dept);
        tx.commit();
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    @Test
    public void updateDept_update() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Dept dept = new Dept();
        dept.setDeptname("小卖部2"); //改变的值
        dept.setDeptno(144); //根据id  来修改需要修改的列，部门表只有deptname
        session.update(dept);
        tx.commit();
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    @Test
    public void deleteDept_delete() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Dept dept = new Dept();
        dept.setDeptno(144); //根据id  来删除数据
        session.delete(dept);
        tx.commit();
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    /*
    * 使用HQL语句查询
    * */
    @Test
    public void HQLSelectDept() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("from Dept");
        List<Dept> list = query.list();
        for (Dept d : list) {
            System.out.println("部门名称： " + d.getDeptname());
        }
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    /*
    * 使用select子句
    * */
    @Test
    public void HQLSelectDept2() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("select d.deptname from Dept d");
        List<String> list = query.list();
        for (String d : list) {
            System.out.println("部门名称： " + d);
        }
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }
    /*
     * 使用HQL语句查询  where子句的使用
     * */
    @Test
    public void HQLSelectDept3() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("from Dept where deptno=1");
        List<Dept> list = query.list();
        for (Dept d : list) {
            System.out.println("部门名称： " + d.getDeptname());
        }
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    /*
    * 使用HQL语句查询  order by子句的使用
    * */
    @Test
    public void HQLSelectDept4() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("from Dept order by deptno desc");   //asc 升序排列  desc 降序排列
        List<Dept> list = query.list();
        for (Dept d : list) {
            System.out.println("部门名称： " + d.getDeptname());
        }
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    /*
      * 使用HQL语句查询  绑定参数
      * */
    @Test
    public void HQLSelectDept5() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        //Query query = session.createQuery("from Dept where deptno=?");   //占位符绑定
        Query query = session.createQuery("from Dept where deptno=:deptno");   //参数名称绑定
        //query.setParameter(0,1);  //占位符从0开始，1代表？的值
        query.setParameter("deptno",1);
        List<Dept> list = query.list();
        for (Dept d : list) {
            System.out.println("部门名称： " + d.getDeptname());
        }
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }

    /*
      * 使用HQL语句查询  分页
      * */
    @Test
    public void HQLSelectDept6() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("from Dept ");
        int index = 1;
        int size = 2;
        query.setFirstResult((index - 1) * size);
        query.setMaxResults(size);
        List<Dept> list = query.list();
        for (Dept d : list) {
            System.out.println("部门名称： " + d.getDeptname());
        }
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
    }









    /*
    * 连接查询测试
    * inner join(内连接)
    *
    *    select
        distinct dept0_.deptno as deptno1_2_,
        dept0_.deptname as deptname2_2_
    from
        Dept dept0_
    inner join
        Emps emps1_
            on dept0_.deptno=emps1_.deptno
                   运营部
                   ===========================

    select
        emps0_.deptno as deptno3_5_0_,
        emps0_.empid as empid1_5_0_,
        emps0_.empid as empid1_5_1_,
        emps0_.ename as ename2_5_1_,
        emps0_.deptno as deptno3_5_1_
    from
        Emps emps0_
    where
        emps0_.deptno=?

                   呵呵
                   张三

                   开发部
                  =========================
Hibernate:
    select
        emps0_.deptno as deptno3_5_0_,
        emps0_.empid as empid1_5_0_,
        emps0_.empid as empid1_5_1_,
        emps0_.ename as ename2_5_1_,
        emps0_.deptno as deptno3_5_1_
    from
        Emps emps0_
    where
        emps0_.deptno=?

                    李四
                    哈哈


    *  inner join fetch（迫切内连接）
    *
    *     select
        distinct dept0_.deptno as deptno1_2_0_,
        emps1_.empid as empid1_5_1_,
        dept0_.deptname as deptname2_2_0_,
        emps1_.ename as ename2_5_1_,
        emps1_.deptno as deptno3_5_1_,
        emps1_.deptno as deptno3_5_0__,
        emps1_.empid as empid1_5_0__
    from
        Dept dept0_
    inner join
        Emps emps1_
            on dept0_.deptno=emps1_.deptno

          测试数据：

         开发部
         =========================
         李四
         哈哈

         运营部
         =========================
         呵呵
         张三
    *
    * */
    @Test
    public void selectdept() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Dept dept = new Dept();
        List<Dept> list = session.createQuery("select distinct d from cn.jjz.pojo.onetomany.Dept d inner join fetch d.emps").list();
        // List<Dept> list = session.createQuery("select distinct d from cn.jjz.pojo.onetomany.Dept d inner join  d.emps").list();
        for (Dept d : list) {
            System.out.println(d.getDeptname());
            System.out.println("======");
            for (Emps emps : d.getEmps()) {
                System.out.println(emps.getEname());
            }
        }
    }

    @Test
    public void selectdept2() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Dept dept = new Dept();
        Query query = session.createQuery("select distinct d,e from cn.jjz.pojo.onetomany.Dept d,Emps e where d.deptno=e.deptno");
        List<Object[]> list = query.list();
        for (Object[] d : list) {
            System.out.println(d[0]);
        }
    }
}
