package cn.jjz.springtest;

import cn.jjz.spring731_1.ProxyStu;
import cn.jjz.spring731_1.StuDaoImpl;
import org.junit.Test;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring731_1 {
    @Test
    public void a(){
        ProxyStu s=new ProxyStu();
        StuDaoImpl d=new StuDaoImpl();
        s.setDao(d);
        s.Save();
    }
}
