package cn.jjz.dao;


import cn.jjz.pojo.onetomany.Emps;
import cn.jjz.util.BaseUtil;

/**
 * Created by lenovo on 2017/10/8.
 */
public class EmpsDao extends BaseUtil {
    public Emps Get(int empno){
        return getSession().get(Emps.class,empno);
    }
}
