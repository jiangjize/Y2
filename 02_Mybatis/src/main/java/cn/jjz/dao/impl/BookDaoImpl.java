package cn.jjz.dao.impl;

import cn.jjz.dao.BookDao;
import cn.jjz.entity.Book;
import cn.jjz.entity.BookCategory;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/1.
 */
public class BookDaoImpl implements BookDao {
    String path = "mybatis-config.xml";
    InputStream is=Resources.getResourceAsStream(path);
    SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
    SqlSession session=sf.openSession();
    BookDao dao=session.getMapper(BookDao.class);

    public BookDaoImpl() throws IOException {
    }

    //查询所有图书信息单测
    @Test
    public  void aVoid() throws Exception {
       List<Book> list= bookList();
        for (Book b:list
             ) {
            System.out.println(b.getBookname());
        }
    }
    public List<Book> bookList() throws Exception {
        InputStream is = Resources.getResourceAsStream(path);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sf.openSession();
        List<Book> list = session.selectList("bookList");
        session.close();
        return list;

    }
    /**
     * 按图书ID查询图书信息
     * */
     @Test
     public void byid() throws IOException {
         try {
             Book book=byIdSelect(3);
             System.out.println(book.getBookname());
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
    public Book byIdSelect(int id) throws IOException {
        InputStream is=Resources.getResourceAsStream(path);
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=sf.openSession();
        BookDao dao=session.getMapper(BookDao.class);
        Book bok=dao.byIdSelect(3);
        session.close();
        return bok;
    }
    /**
     * 添加
     * */
   @Test
   public void a() throws IOException {
       Book b=new Book();
       b.setBookauthor("王哲");
       b.setBookname("天穹");
        Add(b);
   }
    public int Add(Book book) throws IOException {
       InputStream is=Resources.getResourceAsStream(path);
       SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
       SqlSession session=sf.openSession();
       BookDao dao=session.getMapper(BookDao.class);
       int i=dao.Add(book);
       if(i>0){
           System.out.println("yes");
           session.commit();
       }else{
           System.out.println("no");
       }
        session.close();
        return i;
    }

    /**
     * 删除
     * */
 @Test
 public void del() throws IOException {
        Del(42);
 }
    public int Del(int id) throws IOException {
      InputStream is=Resources.getResourceAsStream(path);
      SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
      SqlSession session=sf.openSession();
      BookDao dao=session.getMapper(BookDao.class);
      int i=dao.Del(id);
       if(i>0){
           System.out.println("yes");
           session.commit();
       }else{
           System.out.println("no");
       }
        session.close();
        return i;
    }
    /**
     * 修改
     * */
    @Test
    public void Upxx() throws Exception {
        Book book=new Book();
        book.setBookname("强大的小强");
        book.setBookauthor("小强");
        book.setBookabout("777");
        book.setBookcategory(5);
        book.setBookdatetime("2017-02-13");
        book.setBookid(41);
        Up(book);
    }
    public int Up(Book book) throws Exception {
        InputStream is= Resources.getResourceAsStream(path);
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=sf.openSession();
        BookDao dao=session.getMapper(BookDao.class);
        int i=dao.Up(book);
        if(i>0){
            System.out.println("yes");
            session.commit();
        }else{
            System.out.println("no");

        }
        session.close();
        return i;
    } 
     /**
      * 模糊查询
      * */
     @Test
     public void likebook() throws Exception {
         LikeBookInfo("武");
     }
    public List<Book> LikeBookInfo(String name) throws Exception {
        InputStream is=Resources.getResourceAsStream(path);
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=sf.openSession();
        BookDao dao=session.getMapper(BookDao.class);
        List<Book> list= dao.LikeBookInfo(name);
        return list;
    }
    /**
     * 多条件查询
     * */
    @Test
    public  void  byneed() throws Exception {
        Book book=new Book();
        book.setBookname("武");
        book.setBookcategory(5);
        ByNeedSelect(book);
    }
    public List<Book> ByNeedSelect(Book book) throws Exception {
        InputStream is=Resources.getResourceAsStream(path);
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=sf.openSession();
        BookDao dao=session.getMapper(BookDao.class);
        List<Book> list= dao.ByNeedSelect(book);
        return list;
    }

    @Test
    public void lname() throws Exception {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("bookname","武");
        map.put("bookcategory",5);
       List<Book> list= LikeBookName(map);
        for (Book b:list
             ) {
            System.out.println("书名："+b.getBookname());
        }
    }
    public List<Book> LikeBookName(Map<String, Object> map) throws Exception {

       List<Book> list=dao.LikeBookName(map);

        return list;
    }

    /**
     * 查询图书的分类和作者
     * */
     @Test
     public void ss() throws Exception {
         List<Book> list=SelectBookTypeAndAuthor();
         for (Book b:list
              ) {
             System.out.println("书名："+b.getBookname()+"  类型："+b.getCatename()+"  作者："+b.getBookauthor());
         }
     }

    public List<Book> SelectBookTypeAndAuthor() throws Exception {
        InputStream is=Resources.getResourceAsStream(path);
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=sf.openSession();
        BookDao dao=session.getMapper(BookDao.class);
        List<Book> list=dao.SelectBookTypeAndAuthor();
        return list;
    }
    /**
     * 按图书ID查询图书的分类和作者
     * */

    @Test
    public void byidse() throws Exception {
        Book b=ByIdSelectBookTypeAndAuthor(2);
        System.out.println(b.getBookname()+b.getCatename()+b.getBookauthor());
    }
    public Book ByIdSelectBookTypeAndAuthor(int id) throws Exception {
     InputStream is=Resources.getResourceAsStream(path);
     SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
     SqlSession session=sf.openSession();
     BookDao dao=session.getMapper(BookDao.class);
     Book b=dao.ByIdSelectBookTypeAndAuthor(id);
        return b;
    }
    /**
     * 按图书类型ID获取该类型图书信息
     * */
    @Test
    public void bytype() throws Exception {
        List<Book> list= ByTypeIdGetBookInfo(5);

       for (Book b:list
             ) {
           System.out.println("类型："+b.getBookCategory().getCatename());
             System.out.println("书名："+b.getBookname());
        }
    }
    public List<Book> ByTypeIdGetBookInfo(@Param("图书类型ID") int id) throws Exception {
        InputStream is=Resources.getResourceAsStream(path);
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
        SqlSession session=sf.openSession();
        BookDao dao=session.getMapper(BookDao.class);
        List<Book> list=dao.ByTypeIdGetBookInfo(id);
        return list;
    }
     @Test
     public void by2() throws Exception {
        List<Book> list=ByTypeIdGetBookInfo2(6);
         for (Book b:list
              ) {
             System.out.println(b.getBookname() + b.getBookCategory().getCatename());
         }
     }
    public List<Book> ByTypeIdGetBookInfo2(@Param("bookcategory") int id) throws Exception {
        List<Book> list =dao.ByTypeIdGetBookInfo2(id);
        return list;
    }
     @Test
     public void booklis() throws Exception {
        Book b=new Book();
       /* b.setBookname("武");*/
        b.setBookcategory(2);
        List<Book> list= BookListByIf(b);
         for (Book bo:list
              ) {
             System.out.println(bo.getBookname());
         }
     }

    public List<Book> BookListByIf(Book book) throws Exception {
     List<Book> list= dao.BookListByIf(book);
        return list;
    }
    @Test
    public void b() throws Exception {
        int[] i={20,21};
        BookListChoose(i);
    }
    public List<Book> BookListChoose(int[] ints) throws Exception {
      List<Book> list=  dao.BookListChoose(ints);
        return list;
    }
    @Test
    public  void Boli() throws Exception {
       List<Book> list=new ArrayList<Book>();
       Book book=new Book();
       book.setBookid(24);
        Book book2=new Book();
        book2.setBookid(20);
       list.add(book);
       list.add(book2);
       BookListList(list);
    }
    public List<Book> BookListList(List<Book> list) throws Exception {
        dao.BookListList(list);
        return list;
    }

}
