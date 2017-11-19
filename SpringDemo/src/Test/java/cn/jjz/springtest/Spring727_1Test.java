package cn.jjz.springtest;

import cn.jjz.spring727_01.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/27.
 */
public class Spring727_1Test {
    @Test
    public void a(){
    ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext727_1.xml");
        Stu s=(Stu)ap.getBean("stu");
        System.out.println(s);
    }

}
