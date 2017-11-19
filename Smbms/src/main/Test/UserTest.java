import cn.jjz.dao.UserDao;
import cn.jjz.entity.User;
import cn.jjz.util.MyBatisUtil;
import cn.jjz.util.MyBatisUtil2;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public class UserTest {

    @Test
    public void GetUser() throws Exception {   //获取所有用户
        SqlSession session= MyBatisUtil2.getSqlSession();
         UserDao dao= session.getMapper(UserDao.class);
         List<User>list=dao.GetAllUserList(1,2);


    }

    @Test
    public void Login() throws Exception {  //登录
        SqlSession session= MyBatisUtil2.getSqlSession();
        UserDao dao= session.getMapper(UserDao.class);
        int i= dao.Login("lifei","123456");
       if(i>0){
          System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
    @Test
    public void AddUser() throws Exception {
        SqlSession session= MyBatisUtil2.getSqlSession();
        UserDao dao= session.getMapper(UserDao.class);
        User u=new User();
        u.setUserPassword("123456");
        u.setUserCode("jiangjize");
        u.setUserName("蒋济泽");
        u.setBirthday(new Date());
        u.setUserRole(2);
       int i= dao.AddUser(u);
       if (i>0){
           System.out.println("1");
           session.commit();
           session.close();
       }
    }
    @Test
    public void Selectbyname() throws Exception {
        SqlSession session= MyBatisUtil2.getSqlSession();
        UserDao dao= session.getMapper(UserDao.class);
        dao.SelectUserByNameAndCode("泽",0,2);
    }
    @Test
    public void Getcount() throws Exception {
        SqlSession session= MyBatisUtil2.getSqlSession();
        UserDao dao= session.getMapper(UserDao.class);
        dao.GetCount();
    }
    @Test
    public void GetcountByname() throws Exception {
        SqlSession session= MyBatisUtil2.getSqlSession();
        UserDao dao= session.getMapper(UserDao.class);
        dao.GetCountByname("泽");
    }
    @Test
    public void Update() throws Exception {
        SimpleDateFormat s=new SimpleDateFormat("yy-MM-dd");
        Date d=new Date("2017-05-01");
int id=MyBatisUtil2.getSqlSession().getMapper(UserDao.class).UpdetUser("姜武","地球",
        "15487458789",2,1,d,"jiangwu");


        if(id>0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

/*        User s=new User();
        s.setUserCode("jiangwu");
        s.setGender(2);
        s.setUserRole(1);
        int ids=MyBatisUtil.createSqlsession().getMapper(UserDao.class).UpdetUserNew(s);
        if(ids>0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }*/

    }

}
