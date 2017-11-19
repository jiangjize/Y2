package cn.jjz.springdemo.dao;

import cn.jjz.springdemo.entity.User;

/**
 * Created by Happy on 2017-07-24.
 */
public class UserDAOImpl implements IUserDAO {
    public void save(User user) {
        System.out.println("save success!");
    }
}
