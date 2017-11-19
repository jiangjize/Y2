import cn.jjz.dao.BookDao;
import cn.jjz.entity.Book;
import cn.jjz.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by lenovo on 2017/8/20.
 */
public class BookTest {
    @Test
    public void a(){
        SqlSession session= MyBatisUtil.getSqlSession();
       BookDao dao= session.getMapper(BookDao.class);
      List<Book> list= dao.getBook();
        for (Book b:list
             ) {
            System.out.println(b.getBookname());
        }
    }
    @Test
    public void b(){
        SqlSession session= MyBatisUtil.getSqlSession();
        BookDao dao= session.getMapper(BookDao.class);
        List<Book> list= dao.byName("1");
        for (Book b:list
                ) {
            System.out.println(b.getBookname());
        }
    }
    @Test
    public void c(){
        SqlSession session= MyBatisUtil.getSqlSession();
        BookDao dao= session.getMapper(BookDao.class);
        List<Book> list= dao.byName2("6");
        for (Book b:list
                ) {
            System.out.println(b.getBookname());
        }
    }
}
