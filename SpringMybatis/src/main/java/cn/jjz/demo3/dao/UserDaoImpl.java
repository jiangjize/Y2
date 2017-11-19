package cn.jjz.demo3.dao;

import cn.jjz.demo3.entity.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by lenovo on 2017/8/6.
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionTemplate st;
    public UserDaoImpl() {
    }
    public UserDaoImpl(SqlSessionTemplate st) {
        this.st= st;
    }
    public SqlSessionTemplate getSt() {
        return st;
    }
    public void setSt(SqlSessionTemplate st) {
        this.st= st;
    }
    public int Login(@Param("n") String n, @Param("p") String p) throws Exception {

        return st.getMapper(UserDao.class).Login(n,p);
    }

    public int AddUser(User user) throws Exception {
        return 0;
    }


}
