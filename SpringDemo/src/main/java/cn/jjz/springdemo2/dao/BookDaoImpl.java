package cn.jjz.springdemo2.dao;

import cn.jjz.springdemo2.entity.Book;

/**
 * Created by lenovo on 2017/7/24.
 */
public class BookDaoImpl implements BookDao {
    public void Add(Book book) {
        System.out.println("↑边的是来张切面中的方法");
    }
}
