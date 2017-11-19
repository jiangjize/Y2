package cn.jjz.service;

import cn.jjz.dao.RsDao;
import cn.jjz.pojo.Rs;
import cn.jjz.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;

import java.util.List;

/**
 * Created by lenovo on 2017/9/23.
 */
public class RsService {
    public void addRsInfo(Rs rs){
            Transaction tx=null;
        try {
        tx= HibernateUtil.getSession().beginTransaction();
        new RsDao().save(rs);
        tx.commit();
    }catch (HibernateException e){
            e.printStackTrace();
            if(tx!=null)
                tx.rollback();
        }
    }
    public List<Rs> queryrs(){
        Transaction tx=null;
        List<Rs> list=null;
        RsDao s=new RsDao();
        try {
            tx=HibernateUtil.getSession().beginTransaction();
             list=s.queryRs();
            tx.commit();
        }catch (TransactionException e){
            e.printStackTrace();

        }
    return list;
    }
}
