import cn.jjz.dao.BillDao;
import cn.jjz.entity.Bill;
import cn.jjz.util.MyBatisUtil2;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public class BillTest {
    @Test
    public void a() throws Exception {
        SqlSession session= MyBatisUtil2.getSqlSession();
        BillDao dao= session.getMapper(BillDao.class);
        dao.ByTermSelectBill("伊",2,2,0,5);

    }
@Test
    public void  b() throws Exception {
    SqlSession session= MyBatisUtil2.getSqlSession();
    BillDao dao= session.getMapper(BillDao.class);
    List<Bill> list=dao.getBillInfo(0,6);
    Bill bu=new Bill();
   /* bu.getProviders().getproName();*/

    for (Bill b:list) {
        System.out.println(b.getProviderId()+b.getPro().getProName());
    }
}
@Test
    public void c() throws Exception {
    SqlSession session= MyBatisUtil2.getSqlSession();
    BillDao dao= session.getMapper(BillDao.class);
    dao.getSelectCount("伊利",2,0);
}

}
