package cn.jjz.spring731_1;

/**
 * Created by lenovo on 2017/7/31.
 */
public class ProxyStu implements StuDao {
private StuDao dao;
    public void Save() {
        System.out.println("我是在方法前");
        dao.Save();
    }

    public StuDao getDao() {
        return dao;
    }

    public void setDao(StuDao dao) {
        this.dao = dao;
    }
}
