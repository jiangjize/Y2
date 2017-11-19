package cn.jjz.dao;

import cn.jjz.entity.Category;

import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public interface CategoryDao {
    //自连接练习
    public List<Category> All(int id)throws Exception;
}
