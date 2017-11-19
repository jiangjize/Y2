package cn.jjz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/1.
 */
public class MyBatisUtil {
    private static SqlSessionFactory factory;

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession createSqlsession() {
        return factory.openSession(false);
    }

    public static void closeSqlsesssion(SqlSession sqlsession) {
        sqlsession.commit();
        if (sqlsession != null) {
            sqlsession.close();
        }
    }
}
