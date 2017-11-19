package cn.jjz.action1023;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/23.
 */
public class ManyAction extends ActionSupport {
    public String input(){
        System.out.println("进入了input");
        return  "input";
    }
    public String delete(){
        System.out.println("进入了delete");
        return  "delete";
    }
}
