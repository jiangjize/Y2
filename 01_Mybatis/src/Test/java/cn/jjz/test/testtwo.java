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
import java.util.List;


/**
 * Created by lenovo on 2017/6/30.
 */
public class testtwo {
  /*  @Test
    public void add(){
        try {
            String path="mybatis-config.xml";
          InputStream is=Resources.getResourceAsStream(path);
          SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(is);
          SqlSession session=sf.openSession();

          int i=session.getMapper(UserDao.class).Add("jjj");
            session.commit();   //事务提交一定要写上  不然添加不进数据库
          if(i>0) {
              System.out.println("yes");
          }else{
              System.out.println("no");
          }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    @Test
    public void byid() {

      /*  //查询所有的图书信息
      String path = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(path);
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = sf.openSession();
            UserDao dao=session.getMapper(UserDao.class);
             List<User> list=dao.All();
            for (User u:list){

                System.out.println(u.getBookname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/


       //按ID查询图书信息
       System.out.println("===========================");
        String path="mybatis-config.xml";
        try {
            InputStream is= Resources.getResourceAsStream(path);
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            SqlSession session =  factory.openSession();

            UserDao dao = session.getMapper(UserDao.class);
            User dept = dao.ByidresultMap(2);
            System.out.println(dept.getBookname());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
