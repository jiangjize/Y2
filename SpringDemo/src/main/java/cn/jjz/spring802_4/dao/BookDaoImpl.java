package cn.jjz.spring802_4.dao;



import cn.jjz.spring802_4.entity.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lenovo on 2017/8/1.
 */
public class BookDaoImpl extends JdbcDaoSupport implements BookDao {

    public List<Book> bookList() {
        String s="select * from book";
        List<Book> list=this.getJdbcTemplate().query(s, new RowMapper<Book>() {

            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book=new Book();
                book.setBookname(resultSet.getString("bookname"));
                return book;
            }
        });
        return list;
    }
}
