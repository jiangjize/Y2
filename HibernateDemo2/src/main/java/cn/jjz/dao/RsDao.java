package cn.jjz.dao;

import cn.jjz.pojo.Rs;
import cn.jjz.util.HibernateUtil;

import java.util.List;

/**
 * Created by lenovo on 2017/9/23.
 */
public class RsDao {
    public void save(Rs rs){
        HibernateUtil.getSession().save(rs);
    }
    public List queryRs(){
        //查询所有的rs表记录
  return HibernateUtil.getSession().createQuery(" from Rs").list();
                //查询姓名为sdf的信息
//        return HibernateUtil.getSession().createQuery(" from Rs as rs where rs.name='sdf' ").list();
              //查询指定的属性的信息
//     return HibernateUtil.getSession().createQuery("select rs.id from Rs as rs").list();
    }
}
