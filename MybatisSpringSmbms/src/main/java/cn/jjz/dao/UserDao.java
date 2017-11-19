package cn.jjz.dao;

import cn.jjz.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public interface UserDao {
    //登录
    public int Login(@Param("n") String n,@Param("p") String p)throws Exception;
    //添加
    public  int AddUser(User user)throws Exception;


}
