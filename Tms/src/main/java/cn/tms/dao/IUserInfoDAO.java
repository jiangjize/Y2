package cn.tms.dao;

import cn.tms.entity.UserInfo;

/**
 * Created by Happy on 2017-08-21.
 */
public interface IUserInfoDAO {
    //登录的方法
    public UserInfo isLogin(UserInfo info);
}
