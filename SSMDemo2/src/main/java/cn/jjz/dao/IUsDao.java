package cn.jjz.dao;

import cn.jjz.entity.Us;

import java.util.List;

/**
 * Created by lenovo on 2017/10/16.
 */
public interface IUsDao {
    /*登陆*/
    public Us Login(Us us);
    /*查询所有用户*/
    public List queryAllUser();
}
