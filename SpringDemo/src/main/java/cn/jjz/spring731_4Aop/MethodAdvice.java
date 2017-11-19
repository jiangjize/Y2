package cn.jjz.spring731_4Aop;


import org.aopalliance.intercept.MethodInvocation;

import javax.xml.bind.SchemaOutputResolver;


/**
 * Created by lenovo on 2017/7/31.
 */
public class MethodAdvice implements org.aopalliance.intercept.MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("==========前=======");
        methodInvocation.proceed();
        System.out.println("++++++++++++后+++++++++++");
        return null;
    }
}
