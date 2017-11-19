package cn.jjz.service;

import cn.jjz.dao.DeptDao;
import cn.jjz.pojo.onetomany.Dept;
import cn.jjz.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/10/8.
 */
public class DeptService {
   DeptDao deptDao=new DeptDao();
    public Dept Get(int id){
        Transaction ts=null;
        Dept dept=null;
        try {
            ts=deptDao.getSession().beginTransaction();
            dept=deptDao.Get(id);
            System.out.println("======================================");
            System.out.println(dept.getDeptname());
            System.out.println("该部门下员工人数："+dept.getEmps().size());
           /* System.out.println(dept.getEmps().iterator());*/
            ts.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(ts!=null)
                ts.rollback();
        }
            return dept;
    }
    public Object Load(Class c, Serializable id){
        Transaction ts=null;
        Object o=null;
        try {
            ts=deptDao.getSession().beginTransaction();
            o= deptDao.Load(c,id);
            ts.commit();
           /* if(!Hibernate.isInitialized(o)){
                Hibernate.initialize(o);}*/
            HibernateUtil.closeSesson();
        } catch (Exception e) {
            e.printStackTrace();
            if(ts!=null)
                ts.rollback();
        }
   /*     Object o=deptDao.Load(c,id);*/
            return o;
    }
}
