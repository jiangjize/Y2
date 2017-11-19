package cn.jjz.action1024;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by lenovo on 2017/10/24.
 */
public class MyIntercept extends AbstractInterceptor {
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        long q=System.currentTimeMillis();
        System.out.println("当前时间："+q);
        String result=actionInvocation.invoke();
       /* if (true)
            return "success";*/
        long h=System.currentTimeMillis();
        System.out.println("耗时："+(h-q));
        return result;
    }
}
