package cn.jjz.springtest;


import cn.jjz.spring802_3.FanDao;
import cn.jjz.spring802_4.entity.Book;
import cn.jjz.spring802_4.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring802_4 {

    @Test
    public void d(){
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext802_4.xml");
        BookServiceImpl d=(BookServiceImpl) a.getBean("bookService");
        List<Book> list= d.bookList();
        for (Book b:list
             ) {
            System.out.println(b.getBookname());
        }

    }
}
