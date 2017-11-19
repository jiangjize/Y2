package cn.jjz.spring731_4Aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/31.
 */
public class AfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("=========houzhi==========,返回值："+o);
    }
}
