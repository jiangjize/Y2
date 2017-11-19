package cn.jjz.dao;

import cn.jjz.entity.User;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface UserDao {

    /*登陆*/
    public User Login(User user);
}
