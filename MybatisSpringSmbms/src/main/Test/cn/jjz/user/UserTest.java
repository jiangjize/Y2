package cn.jjz.user;

import cn.jjz.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/8/6.
 */
public class UserTest {
    @Test
    public void a() throws Exception {
        ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserDao dao=(UserDao) a.getBean("dao");
         int i= dao.Login("lifei","123456");
         if(i>0){
             System.out.println("yes");
         }else {
             System.out.println("no");
         }



    }

}
