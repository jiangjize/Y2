package cn.jjz.controller;

import cn.jjz.entity.User;
import cn.jjz.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/8/21.
 */
@Controller
public class UserController {
@Resource(name = "UserServiceImpl")
    UserService userService;
    @RequestMapping("/Login")
    public String login(User user){
        User u=userService.Login(user);
        if(u!=null&&u.getUserName()!=null){
            return "welcome";
        }else {

            return "login";
        }
    }
}
