import cn.jjz.demo2.dao.BookDao;
import cn.jjz.demo2.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lenovo on 2017/8/1.
 */
public class BookTest2 {
    //查询所有的书
    @Test
    public void a() throws Exception {
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext2.xml");
       BookDao d=(BookDao) a.getBean("book");
      List<Book> dd= d.bookList();
        for (Book b:dd
             ) {
            System.out.println(b.getBookname());
        }
    }
}
