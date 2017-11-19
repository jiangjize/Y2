package cn.jjz.action1022;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/22.
 */
public class TestServletApi {
    public String execute(){
        //0.获取 ActionContext对象 它是action的上下文对象，可以从中获取到当往action需要的一切信息
        ActionContext actionContext=ActionContext.getContext();

        //1.通过actionContext对象的getApplication（）方法来获取application对象的map对象
        Map<String,Object> applicationmap=actionContext.getApplication();
            //设置属性
        applicationmap.put("akey","我是applicationmapvalue！");
            //获取属性
        Object d=applicationmap.get("times");
        System.out.println("========"+d);

        //2.session
        Map<String,Object> sessionmap=actionContext.getSession();
        //设置属性
        sessionmap.put("skey","sessionvalue");
       //获取属性
        Object sname=sessionmap.get("sessionname");
        System.out.println("========"+sname);

        //3.request

        //4.获取请求参数对应的map，并获取指定的参数值





        return "success";
    }
}
