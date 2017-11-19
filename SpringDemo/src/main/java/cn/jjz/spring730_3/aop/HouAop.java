package cn.jjz.spring730_3.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/30.
 */
public class HouAop implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("我是后置增强");
    }
}
