package cn.jjz.action1021;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/21.
 */
public class Struts2Action extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("方式三：继承ActionSupport");
        return super.execute(); // 返回SUCCESS
    }
}
