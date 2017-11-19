package cn.jjz.entity;

/**
 * Created by lenovo on 2017/8/11.
 */
public class Login {
    private int loginid;
    private String logincode;
    private  String loginpassword;

    public int getLoginid() {
        return loginid;
    }

    public void setLoginid(int loginid) {
        this.loginid = loginid;
    }

    public String getLogincode() {
        return logincode;
    }

    public void setLogincode(String logincode) {
        this.logincode = logincode;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }
}
