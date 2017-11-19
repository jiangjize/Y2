package cn.jjz.de3;



import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/6.
 */
public class RmiClient {
    public static void main(String[] args) {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("client.xml");
        AccountService accountService=(AccountService)applicationContext.getBean("rfb");
        Scanner i=new Scanner(System.in);
        System.out.println("输入些东东：");
        String s=i.next();
        System.out.println("再输入一些：");
        int n=i.nextInt();
        String result =accountService.shoopingPayment(s,(byte) n);
        System.out.println(result);
    }
}
