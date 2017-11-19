package cn.jjz.dao;

import cn.jjz.pojo.onetomany.Dept;
import cn.jjz.util.*;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/10/8.
 */
public class DeptDao  extends BaseUtil{
    public Dept Get(int id){
       return getSession().get(Dept.class,id);
    }
    public Object Load(Class c, Serializable id){
        return HibernateUtil.getSession().load(c,id);
    }
}
