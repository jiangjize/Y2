package cn.jjz.springtest;

import cn.jjz.springdemo2.entity.Book;
import cn.jjz.springdemo2.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/24.
 */
public class SpringDome2Test {
    @Test
    public void a(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
        BookService b=(BookService) context.getBean("bookservice");
        Book d=new Book();
        d.setBookname("hehe");
        b.Add2(d);
    }
}
