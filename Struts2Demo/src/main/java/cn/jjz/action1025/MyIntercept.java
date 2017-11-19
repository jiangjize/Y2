package cn.jjz.action1025;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/25.
 */
public class MyIntercept extends AbstractInterceptor {
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        String r = null;
        Map<String,Object> map= ActionContext.getContext().getSession();
        //获取session中保存的name
        String name= (String) map.get("name");
        System.out.println("session中的值"+name);
        //获取action名称
        String actionname=actionInvocation.getProxy().getActionName();
        System.out.println("action:"+actionname);
        if(actionname.equals("loging")){
            //放行
          r=actionInvocation.invoke();
        }else  if(name!=null){
            r=actionInvocation.invoke();
            System.out.println("请求的action:"+actionInvocation.getProxy().getActionName());
        }else {
            System.out.println("返回input");
            r="input";
        }
        return r;
    }
}
