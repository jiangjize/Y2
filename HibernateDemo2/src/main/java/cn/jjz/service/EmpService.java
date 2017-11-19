package cn.jjz.service;

import cn.jjz.dao.EmpDao;
import cn.jjz.dao.RsDao;
import cn.jjz.pojo.Emp;
import cn.jjz.pojo.Rs;
import cn.jjz.util.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;

import java.util.List;

/**
 * Created by lenovo on 2017/10/6.
 */
public class EmpService {
    private EmpDao dao = new EmpDao();
    public Emp Get(int empno){
        Transaction ts=null;
        Emp emp=null;
        try {
            ts=dao.getSession().beginTransaction();
            emp=dao.Get(empno);
            System.out.println("++++++++++++++++");
            System.out.println(emp.getEmpno());
            System.out.println(emp.getEname());
            ts.commit();
        }catch (Exception e){
            e.printStackTrace();
            if(ts!=null)
                ts.rollback();
        }
        return emp;
    }
    public Emp Load(int empno) {
        Transaction ts = null;
        Emp emp = null;
        try {
            ts = dao.getSession().beginTransaction();
            emp = dao.Load(empno);
            System.out.println("++++++++++++++++");
            System.out.println(emp.getEmpno());
            System.out.println(emp.getEname());
            ts.commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (ts != null)
                ts.rollback();

        }
        return emp;
    }

}
