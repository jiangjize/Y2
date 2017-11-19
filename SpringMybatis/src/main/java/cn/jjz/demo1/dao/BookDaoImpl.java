package cn.jjz.demo1.dao;

import cn.jjz.demo1.entity.Book;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * Created by lenovo on 2017/8/1.
 */
public class BookDaoImpl implements BookDao {
    private SqlSessionTemplate st;

    public BookDaoImpl() {
    }

    public BookDaoImpl(SqlSessionTemplate st) {
        this.st = st;
    }

    public SqlSessionTemplate getSt() {
        return st;
    }

    public void setSt(SqlSessionTemplate st) {
        this.st = st;
    }

    public List<Book> bookList() {
        return st.getMapper(BookDao.class).bookList();
    }
}
