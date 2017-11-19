package cn.jjz.springtest;


import cn.jjz.spring802_1.FanDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring802_1 {

    @Test
    public void d(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext802_1.xml");
        FanDao d=(FanDao) a.getBean("fan");
        d.A();
        d.B();
        d.c();

    }
}
