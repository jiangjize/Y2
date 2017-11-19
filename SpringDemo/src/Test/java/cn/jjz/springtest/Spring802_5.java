package cn.jjz.springtest;



import cn.jjz.spring802_5.FanDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring802_5 {

    @Test
    public void d(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext802_5.xml");
      FanDao dao=(FanDao) a.getBean("fan");
      dao.A();
      dao.B();
      dao.C();
    }
}
