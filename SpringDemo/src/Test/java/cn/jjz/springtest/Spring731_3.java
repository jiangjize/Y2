package cn.jjz.springtest;

import cn.jjz.spring731_3.Demo;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring731_3 {
    @Test
    public void a() {
        Enhancer en = new Enhancer();
        final Demo demo = new Demo();
        //1:setsuperclass
           en.setSuperclass(demo.getClass());
        //2:sercallback
           en.setCallback(new MethodInterceptor() {
               public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                   System.out.println("-------zq-------");
                   methodProxy.invoke(demo,objects);
                   return null;
               }
           });
        //3:
        Demo dd=(Demo)en.create();
        dd.Fan();
    }
}