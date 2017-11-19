package cn.jjz.dao.impl;


import cn.jjz.dao.BookCategoryDao;
import cn.jjz.dao.CategoryDao;
import cn.jjz.entity.Book;
import cn.jjz.entity.BookCategory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by lenovo on 2017/7/10.
 */
public class BookCategoryDaoImpl implements BookCategoryDao {
    String path = "mybatis-config.xml";
    InputStream is= Resources.getResourceAsStream(path);
    SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
    SqlSession session=sf.openSession();
   BookCategoryDao dao=session.getMapper(BookCategoryDao.class);
    CategoryDao dao1=session.getMapper(CategoryDao.class);

    public BookCategoryDaoImpl() throws IOException {
    }

    @Test
    public void a() throws Exception {
      BookCategory bookCategory= SelectCategoryName(2);
        System.out.println("类型："+bookCategory.getCatename());
        for (Book book:bookCategory.getBooks()) {
            System.out.println("书名："+book.getBookname());
        }
    }
    public BookCategory SelectCategoryName(int id) throws Exception {
       BookCategory book=dao.SelectCategoryName(id);
        return book;
    }

    @Test
    public void b() throws Exception {
        List<BookCategory> list=AllSelect();
        for (BookCategory b:list
             ) {
            System.out.println("类型名称:"+b.getCatename());
        }
    }
    public List<BookCategory> AllSelect() throws Exception {
      List<BookCategory> list=dao.AllSelect();
        return list;
    }
     @Test
     public void select() throws Exception {
         SelectCategory(2);
     }
    public BookCategory SelectCategory(int id) throws Exception {
      BookCategory list=dao.SelectCategory(id);
        return list;
    }
    @Test
    public void all() throws Exception {
        dao1.All(0);
    }

}
