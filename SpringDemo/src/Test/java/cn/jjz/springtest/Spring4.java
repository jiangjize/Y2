package cn.jjz.springtest;

import cn.jjz.printer.dayin.Daying;
import cn.jjz.service.DemoB;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring4 {
    @Test
    public void a(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Daying d=(Daying) context.getBean("p");
         d.Print();
    }
}
