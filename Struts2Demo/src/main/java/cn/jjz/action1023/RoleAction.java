package cn.jjz.action1023;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/23.
 */
public class RoleAction extends ActionSupport {
    public String rolelist(){
        System.out.println("进入了rolelist");
        return  "rolelist";
    }
    public String roledel(){
        System.out.println("进入了roledel");
        return  "roledel";
    }
}
