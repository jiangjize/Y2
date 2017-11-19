package cn.jjz.springtest;

import cn.jjz.spring730_2.Dog;
import cn.jjz.spring731_4Aop.FanDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring731_4Aop {
    @Test
    public void a(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext731_4_1Aop.xml");
        FanDao d=(FanDao) a.getBean("proxy");
        d.A();
        d.B();
        d.c();
    }
    @Test
    public void b(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext731_4Aop.xml");
        FanDao d=(FanDao) a.getBean("proxy");
        d.A();
        d.B();
    }
    @Test
    public void c(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext731_4_2Aop.xml");
        FanDao d=(FanDao) a.getBean("proxy");
        d.A();
        d.B();
        d.c();
    }
    @Test
    public void e(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext731_4_4Aop.xml");
        FanDao d=(FanDao) a.getBean("proxy");
        d.c();
        d.A();
        d.B();

    }
    @Test
    public void d(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext731_4_3Aop.xml");
        FanDao d=(FanDao) a.getBean("proxy");
        d.A();
        d.B();
        d.c();

    }
}
