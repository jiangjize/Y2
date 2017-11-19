package cn.jjz.dao;

import cn.jjz.pojo.Emp;
import cn.jjz.util.BaseUtil;
import cn.jjz.util.HibernateUtil;

import java.util.List;

/**
 * Created by lenovo on 2017/10/6.
 */
public class EmpDao extends BaseUtil {


    public Emp Load(int empno){
    return getSession().load(Emp.class,empno);
}
    public Emp Get(int empno){
        return getSession().get(Emp.class,empno);
    }
}
