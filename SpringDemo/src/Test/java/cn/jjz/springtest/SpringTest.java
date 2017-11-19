package cn.jjz.springtest;

import cn.jjz.service.DemoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/22.
 */
public class SpringTest {
@Test
    public void a(){

     ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
     DemoService demoService= (DemoService) context.getBean("demoService");
     demoService.We();
 System.out.println(demoService);
     DemoService zhang=(DemoService)context.getBean("zhang");
     zhang.We();
 System.out.println(zhang);

}


}
