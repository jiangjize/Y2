package cn.jjz.spring730_3.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/29.
 */
public class AdvisAop implements MethodBeforeAdvice {



    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("我是前置增强");
    }
}
