package cn.jjz.util;

import org.hibernate.Session;

/**
 * Created by lenovo on 2017/10/7.
 */
public class BaseUtil {
    public Session getSession(){
        return HibernateUtil.getSession();
    }

}
