package cn.jjz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by 123 on 2017/09/23.
 */

public class HibernateUtil {
    static Configuration cfg = null;
    static SessionFactory factory;
    static ThreadLocal local;    //线程变量，储存当前变量绑定的对象，操作方式：get和set
    static Session session = null;

    static {
        cfg = new Configuration().configure();
        factory = cfg.buildSessionFactory();
        local = new ThreadLocal();
    }

    public static Session getSession() {
        session = (Session) local.get();
        if (session == null) {   //能不能获取到session
            session = factory.openSession();
            local.set(session);
        }
        return session;
    }

    public static void close() {
        if (local.get() != null) {
            local.set(null);
            session.close();
            System.out.println("session 关闭成功");
        }

    }
}
