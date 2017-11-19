package cn.jjz.dao;

import cn.jjz.pojo.Rs;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/29.
 */
@Repository("RsDao")
public class RsDaoImpl implements  RsDao {
    @Resource
    private SessionFactory sessionFactory;
    public void add(Rs rs) {
        sessionFactory.getCurrentSession().save(rs);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
