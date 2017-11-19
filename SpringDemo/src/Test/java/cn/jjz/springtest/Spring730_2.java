package cn.jjz.springtest;

import cn.jjz.spring730_2.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/30.
 */
public class Spring730_2 {
    @Test
    public void a(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext730_2.xml");
        Dog d=(Dog) a.getBean("dog");
        System.out.println(d);
    }
}
