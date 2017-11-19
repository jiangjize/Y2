package cn.jjz.demo2.dao;



import cn.jjz.demo2.entity.Book;
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
        return (List<Book>) st.getMapper(BookDao.class).bookList();
    }
}
