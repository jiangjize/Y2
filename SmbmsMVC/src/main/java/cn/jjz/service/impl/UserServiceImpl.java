package cn.jjz.service.impl;

import cn.jjz.dao.UserDao;
import cn.jjz.entity.User;
import cn.jjz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/8/21.
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource(name = "UserDao")
    UserDao userDao;

    public User Login(User user) {
        return userDao.Login(user);
    }
}
