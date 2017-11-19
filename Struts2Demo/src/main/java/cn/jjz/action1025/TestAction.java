package cn.jjz.action1025;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/25.
 */
public class TestAction extends ActionSupport {
    public String a(){
        System.out.println("调用了a方法，并跳入了jsp页面");
        return SUCCESS;
    }
    public String b(){
        System.out.println("调用了b方法，并跳入了jsp页面");
        return SUCCESS;
    }


}
