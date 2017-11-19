package cn.jjz.springtest;

import cn.jjz.spring730_2.Dog;
import cn.jjz.spring730_3.entity.Student;
import cn.jjz.spring730_3.service.StuService;
import cn.jjz.spring730_3.service.StuServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/30.
 */
public class Spring730_3 {
    @Test
    public void a(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext730_3.xml");
        StuService d=(StuService) a.getBean("stuservice");
        Student s=new Student();
        d.SavaStu(s);
    }
}
