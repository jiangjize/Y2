import cn.jjz.dao.ProviderDao;
import cn.jjz.entity.Provider;
import cn.jjz.util.MyBatisUtil2;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2017/7/16.
 */
public class ProviderTest {

    @Test
    public void a() throws Exception {
        SqlSession session= MyBatisUtil2.getSqlSession();
        ProviderDao dao=session.getMapper(ProviderDao.class);
       List<Provider> list= dao.getProviderInfo(0,5);


    }
    @Test
    public void b() throws Exception {
        SqlSession session= MyBatisUtil2.getSqlSession();
        ProviderDao dao=session.getMapper(ProviderDao.class);
        dao.getCount();
    }
}
