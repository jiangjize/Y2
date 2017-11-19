package cn.jjz.demo2.dao;
import cn.jjz.demo2.entity.Book;
import java.util.List;
/**
 * Created by lenovo on 2017/7/1.
 */
public interface BookDao {
    //加载所有图书信息
    public List<Book> bookList();

}
