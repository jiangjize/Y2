package cn.jjz.action1023;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/23.
 */
public class UserAction extends ActionSupport{
    public String useradd(){
        System.out.println("进入了useradd");
        return  "useradd";
    }
    public String userdel(){
        System.out.println("进入了userdel");
        return  "userdel";
    }
}
