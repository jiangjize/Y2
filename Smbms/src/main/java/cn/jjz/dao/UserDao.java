package cn.jjz.dao;

import cn.jjz.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public interface UserDao {
    //查询用户（用户名称，用户编码皆可检索）
    public List<User> SelectUserByNameAndCode(@Param("use") String use,@Param("size") int page,@Param("index") int index)throws Exception;
    //获取所有用户列表
    public List<User> GetAllUserList(@Param("size") int page,@Param("index") int index)throws Exception;
    //查询用户总记录
    public int GetCount()throws Exception;
    //查询搜索的记录数
    public int GetCountByname(@Param("use") String use)throws Exception;
    //登录
    public int Login(@Param("n") String n,@Param("p") String p)throws Exception;
    //添加
    public  int AddUser(User user)throws Exception;
    //删除
    public int DeleTeUser(@Param("username") String name)throws Exception;
    //修改
    public int UpdetUser(@Param("name") String name, @Param("address")String address,@Param("phone") String phone,@Param("gender") int gender,@Param("role")int role,@Param("birt") Date birt,@Param("code") String code)throws Exception;
    public int UpdetUserNew(User user)throws Exception;
    //验证
    public int Yanzhen(@Param("username") String name)throws Exception;

}
