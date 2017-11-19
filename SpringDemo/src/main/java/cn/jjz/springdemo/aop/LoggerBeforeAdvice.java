package cn.jjz.springdemo.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Happy on 2017-07-24.
 * 前置增强 MethodBeforeAdvice
 */
public class LoggerBeforeAdvice implements MethodBeforeAdvice {
   //交叉业务//通知
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("=======write log==============");
    }
}
