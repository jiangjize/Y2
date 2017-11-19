package sy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserMapper;
import sy.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserByUserName(String username) {

        System.err.println("find by name !");
        return userMapper.selectByUserName(username);
    }

    public User getUserByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }



}