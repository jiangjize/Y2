package cn.tms.service.impl;

import cn.tms.dao.IUserInfoDAO;
import cn.tms.entity.UserInfo;
import cn.tms.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 2017-9-27 09:42:36
 */
@Service("useService")
public class UserInfoServiceImpl implements IUserInfoService {
    //植入dao对象
    @Resource(name = "IUserInfoDAO")
    IUserInfoDAO userInfoDAO;
    public UserInfo isLogin(UserInfo info) {
        return userInfoDAO.isLogin(info);
    }
}
