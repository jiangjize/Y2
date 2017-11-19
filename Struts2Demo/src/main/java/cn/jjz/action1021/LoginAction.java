package cn.jjz.action1021;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/21.
 */
public class LoginAction extends ActionSupport {

    private String username;
    private  String password;
    @Override
    public String execute() throws Exception {
        if("1234".equals(getUsername())&&"1234".equals(getPassword()))
         return  super.execute();
        else
            return "err";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
