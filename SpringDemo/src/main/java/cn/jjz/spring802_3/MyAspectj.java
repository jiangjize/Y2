package cn.jjz.spring802_3;



/**
 * Created by lenovo on 2017/8/2.
 */
public class MyAspectj{
    public void befor(){
        System.out.println("前置 ------------");
    }
    public void ret(String o){
        System.out.println("后置--------------返回值："+0);
    }
}
