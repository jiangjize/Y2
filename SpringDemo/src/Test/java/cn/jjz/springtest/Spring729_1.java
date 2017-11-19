package cn.jjz.springtest;

import cn.jjz.spring729_1.entity.Student;
import cn.jjz.spring729_1.service.StuService;
import cn.jjz.spring729_1.service.StuServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/29.
 */
public class Spring729_1 {
    @Test
            public void a(){

    ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext729_1.xml");
      StuService s=  (StuService)  a.getBean("stuservice");
        Student s1=new Student();

      s.SavaStu(s1);
    }

}
