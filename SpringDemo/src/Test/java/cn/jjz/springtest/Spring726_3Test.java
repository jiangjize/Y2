package cn.jjz.springtest;

import cn.jjz.spring726_1.Stu;
import cn.jjz.spring726_3.Gather;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/22.
 */
public class Spring726_3Test {
@Test
    public void a(){
    //list注入
    ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext726_3.xml");
    Gather gather=(Gather)a.getBean("list");
    System.out.println(gather.getList());
    //set注入
    ApplicationContext a2=new ClassPathXmlApplicationContext("applicationContext726_3.xml");
    Gather gather2=(Gather)a2.getBean("set");
    System.out.println(gather2.getSet());
    //array注入
    ApplicationContext a3=new ClassPathXmlApplicationContext("applicationContext726_3.xml");
    Gather gather3=(Gather)a3.getBean("array");
    System.out.println(gather3);
    //property注入
    ApplicationContext a4=new ClassPathXmlApplicationContext("applicationContext726_3.xml");
    Gather gather4=(Gather)a4.getBean("property");
    System.out.println(gather4.getProperties());
    //map注入
    ApplicationContext a5=new ClassPathXmlApplicationContext("applicationContext726_3.xml");
    Gather gather5=(Gather)a5.getBean("map");
    System.out.println(gather5.getMap());
}


}
