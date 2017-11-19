package cn.jjz.springtest;

import cn.jjz.service.DemoB;
import cn.jjz.springdemo.entity.User;
import cn.jjz.springdemo.service.IUserService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring2Test {
    @Test
    public void a(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DemoB d=(DemoB) context.getBean("demob");
        d.writ();
        DemoB d2=(DemoB) context.getBean("b");
        d.Print();
    }



    @Test
    public void b(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextspring01aop.xml");
        IUserService service=(IUserService)context.getBean("userService");
        User u=new User();
        u.setUsername("11");
           service.save2(u);
    }
}
