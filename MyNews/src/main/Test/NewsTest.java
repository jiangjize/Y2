import cn.jjz.dao.NewsDao;
import cn.jjz.dao.TalkDao;
import cn.jjz.entity.Talk;
import cn.jjz.util.MyBatisUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/21.
 */
public class NewsTest {
    @Test
    public void a() throws Exception {
       SqlSession session= MyBatisUtil.getSqlSession();
         NewsDao dao= session.getMapper(NewsDao.class);
         dao.getNewsList(0,5);
    }
    @Test
    public void  b() throws Exception {
        SqlSession session= MyBatisUtil.getSqlSession();
        NewsDao dao= session.getMapper(NewsDao.class);
        dao.GetCount();
    }
    @Test
    public void c() throws Exception {
        SqlSession session= MyBatisUtil.getSqlSession();
        TalkDao dao= session.getMapper(TalkDao.class);
        Talk talk=new Talk();

        talk.setContent("asdas");
        talk.setTalktime("2017-05-11");
        dao.Add(talk);
    }
    @Test
    public void aa() throws Exception {
        SqlSession session= MyBatisUtil.getSqlSession();
        TalkDao dao= session.getMapper(TalkDao.class);
        dao.Gettalk(1);
    }
}
