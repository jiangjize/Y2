package cn.jjz.dao;

import cn.jjz.entity.Book;

import java.util.List;

/**
 * Created by lenovo on 2017/8/20.
 */
public interface BookDao {
    public List<Book> getBook();
    public List<Book> byName(String name);
    public List<Book> byName2(String name);

}
