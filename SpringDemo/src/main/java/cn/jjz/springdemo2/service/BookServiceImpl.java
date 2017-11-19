package cn.jjz.springdemo2.service;

import cn.jjz.springdemo2.dao.BookDao;
import cn.jjz.springdemo2.entity.Book;

/**
 * Created by lenovo on 2017/7/24.
 */
public class BookServiceImpl implements BookService {

    //主业务
    private BookDao dao;
    public void Add2(Book book) {
      dao.Add(book);
    }

    public BookDao getDao() {
        return dao;
    }

    public void setDao(BookDao dao) {
        this.dao = dao;
    }

}
