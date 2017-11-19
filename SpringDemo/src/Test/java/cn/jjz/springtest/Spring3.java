package cn.jjz.springtest;

import cn.jjz.service.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring3 {
    @Test
    public void a(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
       Student s=(Student) a.getBean("stu");
        System.out.println(s);
    }
}
