package cn.jjz.action1021;

import cn.jjz.action1021.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by lenovo on 2017/10/22.
 */
public class UserLogin implements Action,ModelDriven<User> {
    private User user=new User();
    public String execute() throws Exception {
        if("123".equals(user.getName())&&"123".equals(user.getPwd()))
        return "success";
        else
            return "err";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getModel() {
        return user;
    }
}
