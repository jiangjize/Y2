package cn.jjz.de3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/8/6.
 */
public class RmiServer {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("servlet.xml");
        Object lock = new Object();
        synchronized(lock){
             lock.wait();
        }
    }
}
