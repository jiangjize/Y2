package cn.jjz.springtest;

import cn.jjz.service.DemoService;
import cn.jjz.spring726_1.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/22.
 */
public class Spring726_1Test {
@Test
    public void a(){
    //设值注入
     ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext726_1.xml");
     Stu s= (Stu) context.getBean("stu");
    System.out.println(s);

   //构造注入
    ApplicationContext context2=new ClassPathXmlApplicationContext("applicationContext726_1.xml");
    Stu s2= (Stu) context2.getBean("stu2");
    System.out.println(s2);


    //p命名空间注入
    ApplicationContext context3=new ClassPathXmlApplicationContext("applicationContext726_1.xml");
    Stu s3= (Stu) context3.getBean("stu3");
    System.out.println(s3);

}


}
