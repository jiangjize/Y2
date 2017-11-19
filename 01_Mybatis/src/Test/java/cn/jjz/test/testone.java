package cn.jjz.test;

import cn.jjz.dao.UserDao;
import cn.jjz.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

/**
 * Created by lenovo on 2017/6/30.
 */
public class testone {
    @Test
    public void all(){
        String path="mybatis-config.xml";
        try {
            InputStream is= Resources.getResourceAsStream(path);
            //2.get factory by builder()
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            //3.get session by factory
            //这个session不是jsp的内置对象中所描述的session
            //和数据库的会话
            SqlSession session =  factory.openSession();
            UserDao dao=session.getMapper(UserDao.class);
            List<User> user=  dao.All();
            for (User u:user
                 ) {
                System.out.println(u.getBookname());
            }
            //4.close session
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void al(){
        try {
        /*    String path="mybatis-config.xml";
            InputStream is= Resources.getResourceAsStream(path);
            SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
            SqlSession session= sf.openSession();*/
          String path="mybatis-config.xml";
            Reader reader=Resources.getResourceAsReader(path);
            SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=sf.openSession();
           /*User user=session.selectOne("BLL",20);*/
            UserDao dao=session.getMapper(UserDao.class);
            User user=dao.Byid(22);
            System.out.println(user.getBookname());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
