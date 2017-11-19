package cn.jjz.dao;

import cn.jjz.entity.Book;
import cn.jjz.entity.BookCategory;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/1.
 */
public interface BookDao {
    //////////////////////小试牛刀///////////////////
    //加载所有图书信息
    public List<Book> bookList()throws Exception;
    //按ID查询图书信息
    public Book byIdSelect(int id) throws IOException;
    //添加图书
    public int Add(Book book) throws IOException;
    //删除图书
    public int Del(int id)throws IOException;
    //修改图书
    public int Up(Book book)throws Exception;
        //模糊查询       显示图书信息  （单条件）
    public List<Book> LikeBookInfo(@Param("bookname") String name)throws Exception;
        //多条件查询     显示图书信息
    public List<Book> ByNeedSelect( Book book)throws Exception;
        //多条件查询2
    public List<Book> LikeBookName(Map<String,Object> map)throws  Exception;
       //查询图书的分类和作者    在Book实体类中加上分类名称属性- private String catename;
    public List<Book> SelectBookTypeAndAuthor()throws Exception;
       //按图书ID查询图书的分类和作者     重复练习加强记忆
    public Book ByIdSelectBookTypeAndAuthor(@Param("bookid") int id)throws Exception;
       //按图书类型ID获取该类型图书信息
    public List<Book> ByTypeIdGetBookInfo(@Param("bookcategory")int id)throws Exception;
      //按图书类型ID获取该类型图书信息2
    public List<Book> ByTypeIdGetBookInfo2(@Param("bookcategory")int id)throws Exception;
      //智能标签if
    public List<Book> BookListByIf(Book book)throws Exception;
    //智能标签choose
    public List<Book> BookListChoose(int[] ints)throws Exception;
    //智能标签List
    public List<Book> BookListList(List<Book> list)throws Exception;






}
