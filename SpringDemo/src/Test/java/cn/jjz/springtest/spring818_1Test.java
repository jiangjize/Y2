package cn.jjz.springtest;

import cn.jjz.spring818_1.service.DemoAService;
import cn.jjz.spring818_1.service.impl.DemoAServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/8/18.
 */
public class spring818_1Test {
    @Test
    public void a(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext818_1.xml");
         DemoAServiceImpl d= (DemoAServiceImpl) a.getBean("demoAServiceImpl");
         d.A();
    }
}
