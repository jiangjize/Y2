package cn.jjz.springdemo.service;

import cn.jjz.springdemo.entity.User;

/**
 * Created by Happy on 2017-07-24.
 */
public interface IUserService {
    //BLL  隔离作用
    public void save2(User user);
}
