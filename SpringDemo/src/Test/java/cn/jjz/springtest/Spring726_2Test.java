package cn.jjz.springtest;


import cn.jjz.spring726_2.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/22.
 */
public class Spring726_2Test {
@Test
    public void a(){
  //注解注入
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext726_2.xml");
    Stu s=(cn.jjz.spring726_2.Stu) context.getBean("stu");
    System.out.println(s.getN()+s.getCar());




}


}
