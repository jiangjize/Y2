package cn.tms.service;

import cn.tms.entity.UserInfo;

/**
 * Created by Happy on 2017-09-27.
 */
public interface IUserInfoService {
    //登录的方法
    public UserInfo isLogin(UserInfo info);

}
