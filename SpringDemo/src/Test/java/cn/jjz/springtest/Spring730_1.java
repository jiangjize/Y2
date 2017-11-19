package cn.jjz.springtest;

import cn.jjz.spring730_1.entity.Dog;
import cn.jjz.spring730_1.service.DogService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring730_1 {
    @Test
    public void a(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext730_1.xml");
       DogService s=(DogService) a.getBean("dog");
        System.out.println(s.getName()+s.getCar().getCole());
    }
}
