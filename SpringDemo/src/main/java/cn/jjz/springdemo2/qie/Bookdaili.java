package cn.jjz.springdemo2.qie;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置增强 Me
 * Created by lenovo on 2017/7/24.
 */
public class Bookdaili implements MethodBeforeAdvice{
    //交叉业务
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("我会被先输出");
    }
}
