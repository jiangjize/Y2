package cn.jjz.util;


import java.io.InputStream;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * Created by lenovo on 2017/7/4.
 */
public class MyBatisUtil2 {
    public static SqlSessionFactory getSqlSessionFactory() {
        String path = "Mybatis-config.xml";
        InputStream is = MyBatisUtil2.class.getClassLoader().getResourceAsStream(path);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        return factory;
    }

    /**
     * 获取SqlSession
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession() {
        return getSqlSessionFactory().openSession();
    }
    public static SqlSession getSqlSession(boolean isAutoCommit) {
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}