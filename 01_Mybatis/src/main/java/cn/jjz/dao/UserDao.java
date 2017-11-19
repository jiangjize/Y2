package cn.jjz.dao;

import cn.jjz.entity.User;

import java.util.List;

/**
 * Created by lenovo on 2017/6/30.
 */
public interface UserDao {

    //查询所有的图书
    public List<User> All();

    //按ID查询图书
    public User Byid(int id);
    public User ByidresultMap(int  id); //resultmap
    //添加
    public int Add(String name);


    //修改
    //删除
    //模糊
}
