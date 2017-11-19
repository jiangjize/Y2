package cn.jjz.dao;

import cn.jjz.entity.Book;
import cn.jjz.entity.BookCategory;

import java.util.List;

/**
 * Created by lenovo on 2017/7/10.
 */
public interface BookCategoryDao {
    //一对多查询
    public BookCategory SelectCategoryName(int id)throws Exception;
    //查询所有类型
    public List<BookCategory> AllSelect()throws Exception;

    //多对一查询
    public BookCategory SelectCategory(int id)throws Exception;
}
