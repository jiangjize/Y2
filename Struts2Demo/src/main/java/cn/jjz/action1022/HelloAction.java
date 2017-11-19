package cn.jjz.action1022;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class HelloAction  implements Action,SessionAware,ModelDriven<User> {
  private Map<String,Object> map;
  private User user= new User();
    public String execute() throws Exception {
        if("123".equals(user.getName())&&"123".equals(user.getPwd())){
            map.put("name",user.getName());
            return "success";
        }
        else{
            return "err";
        }
    }

    public void setSession(Map<String, Object> map) {
        this.map=map;
    }

    public User getModel() {
        return user;
    }
}
