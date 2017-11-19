package cn.jjz.springtest;


import cn.jjz.spring802_3.FanDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring802_3 {

    @Test
    public void d(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext802_3.xml");
        FanDao d=(FanDao) a.getBean("fan");
        d.A();
        d.B();
        d.c();

    }
}
