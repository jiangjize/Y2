package cn.jjz.spring802_4.service;

import cn.jjz.spring802_4.dao.BookDao;
import cn.jjz.spring802_4.entity.Book;

import java.util.List;

/**
 * Created by lenovo on 2017/8/2.
 */
public class BookServiceImpl implements BookService {
    private BookDao d;

    public BookDao getD() {
        return d;
    }

    public void setD(BookDao d) {
        this.d = d;
    }

    public List<Book> bookList() {
        return d.bookList();
    }
}
