package cn.jjz.dao;

import cn.jjz.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/7/21.
 */
public interface NewsDao {
    //获取新闻列表
    public List<News> getNewsList(@Param("size") int size,@Param("index") int index)throws Exception;
    //
    public int GetCount()throws Exception;
    //
    public News ByNewsName(@Param("name")String name)throws Exception;


}
