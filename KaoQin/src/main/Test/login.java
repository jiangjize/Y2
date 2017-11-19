import cn.jjz.dao.LoginDao;
import cn.jjz.entity.Login;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by lenovo on 2017/8/11.
 */
public class login {
    @Test
    public void a(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
       LoginDao dao=(LoginDao) applicationContext.getBean("logdao");
        Login login=new Login();
        login.setLogincode("1");
        login.setLoginpassword("1");
      int i=  dao.Login(login);
        if(i>0){
        System.out.println("1");
       }


    }
}
