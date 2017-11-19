import cn.jjz.dao.CategoryDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lenovo on 2017/7/12.
 */
public class Categorytest {
    @Test
    public void all() throws Exception {
        String path = "Mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(path);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sf.openSession();
        CategoryDao dao = session.getMapper(CategoryDao.class);
        dao.All(1);
    }

    @Test
    public void a() {


    }
}