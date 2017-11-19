package cn.jjz.springtest;



import cn.jjz.spring804_1.entity.StockException;
import cn.jjz.spring804_1.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/31.
 */
public class Spring804_2 {

    @Test
    public void d() {
        ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext804_2.xml");
        IAccountService d=(IAccountService) a.getBean("accService");
        try {
            d.buyStock(1,5,1,2000);
        } catch (StockException e) {
            e.printStackTrace();
        }


    }
}
