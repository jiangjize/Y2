package cn.jjz.spring802_1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/31.
 */
public class AopAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("=============前置增强++++++++=");
    }
}
