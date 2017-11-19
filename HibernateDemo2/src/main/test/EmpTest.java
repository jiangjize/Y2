import cn.jjz.pojo.Emp;
import cn.jjz.pojo.manytomany.Employee;
import cn.jjz.pojo.manytomany.Project;
import cn.jjz.pojo.manytoone.Emps;
import cn.jjz.pojo.onetomany.Dept;
import cn.jjz.pojo.viewmodel.EmpCondition;
import cn.jjz.service.EmpService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/9/26.
 */
public class EmpTest {

    Configuration cfg = null;
    SessionFactory sf = null;
    Session session = null;
    Transaction tx = null;

    @Test
    public void a() {
        //*
        // ** 添加
        //*
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Emp stu = new Emp();
        stu.setEname("jatl");
        stu.setJob("clerk");
        stu.setSal(1600);
        stu.setHiredate(new Date());
        stu.setMgr(7911);
        stu.setDeptno(20);
        session.save(stu);
        tx.commit();
        if (session != null && session.isOpen()) {
            session.close();
            sf.close();
        }
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
        Emp r = new Emp();
        List<Emp> l = session.createQuery("from Emp").list();
        for (Emp d : l) {
            System.out.println(d.getEname() + ""+d.getSal());
        }
        session.close();
        sf.close();

    }


    /*
    * 动态查询
    * */
    @Test
    public void muiltquery() throws ParseException {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        EmpCondition condition = new EmpCondition();
        String hql = " from Emp where 1=1";
        condition.setSal(2000);
        condition.setJob("clerk");
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date ah = s.parse("2017-04-01");
        Date bh = s.parse("2017-09-30");
        condition.setAhiredate(ah);
        condition.setBhiredate(bh);
        StringBuffer sb = new StringBuffer(hql);
        if (condition.getJob() != null) {
            sb.append(" and job=:job");
        }
        if (condition.getSal() != 0) {
            sb.append(" and sal>:sal");
        }
        if (condition.getAhiredate() != null) {
            sb.append(" and hiredate>=:ahiredate");
        }
        if (condition.getBhiredate() != null) {
            sb.append(" and hiredate<=:bhiredate");
        }
        Query q = session.createQuery(sb.toString());
        q.setProperties(condition);
        List<Emp> l = q.list();
        for (Emp e : l) {
            System.out.println(e.getEname());
        }
    }

    @Test
    public void Page() {
        /*
        * 分页
        * */
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        String hql = "from Emp";
        Query query = session.createQuery(hql);
        int index = 1;
        int size = 3;
        query.setFirstResult((index - 1) * size);
        query.setMaxResults(size);
        List<Emp> list = query.list();
        for (Emp e : list) {
            System.out.println(e.getEname());
        }
    }

    @Test
    public void ch2() {
        /*
        * 多对一关联  2017年10月6日13:44:172
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        List<Emps> l = session.createQuery("from Emps").list();
        for (Emps d : l) {
            System.out.println(d.getEname() + ",部门： " + d.getDept().getDeptname());
        }
      /*  Emps e = session.get(Emps.class,2);
        System.out.println(e.getDept().getDeptname());*/
        session.close();
        sf.close();

    }

    @Test
    public void ch3() {
        /*
        * 一对多关联  2017年10月6日14:21:59
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        List<Dept> l = session.createQuery("from Dept").list();
        for (Dept d : l) {
            System.out.println("部门：");
            System.out.println(d.getDeptname());
            System.out.println("======================");
            System.out.println("人员：");
            for (cn.jjz.pojo.onetomany.Emps emps : d.getEmps()) {
                System.out.println(emps.getEname());
            }
        }
        session.close();
        sf.close();

    }

    @Test
    public void ch4() {
        /*
        * 多对多关联 检索所有程序员参与的所有工程名称  2017年10月6日15:21:59
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Employee employee = new Employee();
        List<Employee> list = session.createQuery("from Employee").list();
        for (Employee e : list) {
            System.out.println(e.getEmpname());
            System.out.println("参与项目：");
            for (Project pro : e.getProjects()) {
                System.out.println(pro.getProname());
            }
        }

        session.close();
        sf.close();

    }


    @Test
    public void addTest() {
        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        //雇员对象
        Employee emp1 = new Employee();
        emp1.setEmpname("张三2");
        //雇员对象
        Employee emp2 = new Employee();
        emp2.setEmpname("李四2");
        //项目对象
        Project pro1 = new Project();
        pro1.setProname("项目4");
        //项目一方，主的一方。
        pro1.getEmployees().add(emp1);
        pro1.getEmployees().add(emp2);

        emp1.getProjects().add(pro1);
        emp2.getProjects().add(pro1);


        session.save(pro1);
        session.save(emp1);
        session.save(emp2);
        tx.commit();
    }

    @Test
    public void testClassLazy_Load() {
        /*
        * 延迟加载-------类级别_load方法测试
        * 听配置文件的  说延迟就延迟
        * */
        EmpService es = new EmpService();
        Emp e = es.Load(25);

    }

    @Test
    public void testClassLazy_Get() {
        /*
        * Get 方法延迟加载不起作用
        * 自己听自己的
        * */
        Emp e = new EmpService().Get(20);

    }

    @Test
    public void one() {
        /*
        * 查询
        * */

        cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
        session = sf.openSession();
        tx = session.beginTransaction();
        Emp r = new Emp();
        Emp l = session.get(Emp.class, 25);
        System.out.println("==============");
        System.out.println(l.getEmpno());
        System.out.println(l.getEname());

        session.close();
        sf.close();

    }
}
