package cn.jjz.springtest;

import cn.jjz.spring731_2.DaDog;
import cn.jjz.spring731_2.DaDogImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring731_2 {
    @Test
    public void a(){
        final DaDog daDog=new DaDogImpl();
        DaDog da=(DaDog)  Proxy.newProxyInstance(daDog.getClass().getClassLoader(), daDog.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("-------方法增强------");
                Object a= method.invoke(daDog,args);
                return a;
            }
        });
        String  r=da.Getname();
        System.out.println(r);
    }
}
