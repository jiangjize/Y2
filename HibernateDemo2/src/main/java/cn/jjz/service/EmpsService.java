package cn.jjz.service;

import cn.jjz.dao.EmpsDao;
import cn.jjz.pojo.onetomany.Emps;
import org.hibernate.Transaction;

/**
 * Created by lenovo on 2017/10/8.
 */
public class EmpsService {
EmpsDao dao=new EmpsDao();
 public Emps Get(int empno){
     Transaction ts=null;
     Emps emps=null;
     try {
         ts=dao.getSession().beginTransaction();
         emps=  dao.Get(empno);
         System.out.println("+++++++");
         System.out.println(emps.getDept().getDeptname());
         System.out.println(emps.getEname());
         ts.commit();
     } catch (Exception e) {
         e.printStackTrace();
         if(ts!=null)
             ts.rollback();
     }

     return emps;
 }
}
