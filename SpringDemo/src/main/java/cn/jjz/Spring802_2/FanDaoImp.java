package cn.jjz.Spring802_2;

/**
 * Created by lenovo on 2017/7/31.
 */
public class FanDaoImp implements FanDao {
    public void A() {
        System.out.println("      a方法    ");
    }

    public void B() {
        System.out.println("      b方法    ");
    }

    public String c() {
        int i=5/0;
        System.out.println("     c方法      ");
        return "哈哈";
    }



}
