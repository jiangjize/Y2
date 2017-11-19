package cn.jjz.springdemo.service;

import cn.jjz.springdemo.dao.IUserDAO;
import cn.jjz.springdemo.entity.User;

/**
 * Created by Happy on 2017-07-24.
 */
public class UserServiceImpl implements IUserService {
    private IUserDAO dao;
    //主业务
    public void save2(User user) {
        dao.save(user);
    }

    public IUserDAO getDao() {
        return dao;
    }

    public void setDao(IUserDAO dao) {
        this.dao = dao;
    }
}
