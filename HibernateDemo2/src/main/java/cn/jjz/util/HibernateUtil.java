package cn.jjz.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by lenovo on 2017/9/23.
 */
public class HibernateUtil {
    private  static Configuration configuration;
    private final static SessionFactory sf;
    private  static ThreadLocal<Session> threadLocal;
    static {
        configuration=new Configuration().configure();
        sf=configuration.buildSessionFactory();
        threadLocal=new ThreadLocal<Session>();
    }
    private  HibernateUtil(){}
    public static Session getSession(){
        Session session=threadLocal.get();
        if(session==null){
            session=sf.openSession();
            threadLocal.set(session);
        }
        return session;
    }
    public static void closeSesson() {
        Session session = threadLocal.get();
        if (session != null) {
            session.close();
            threadLocal.set(null);
        }
    }
}
