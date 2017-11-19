package cn.jjz.action1023;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/23.
 */
public class DmiAction extends ActionSupport {
    public String list(){
        System.out.println("进入了list");
        return  SUCCESS;
    }
    public String del(){
        System.out.println("进入了del");
        return  SUCCESS;
    }
}
