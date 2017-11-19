package cn.jjz.service;

/**
 * Created by lenovo on 2017/7/24.
 */
public class DemoB {
    private String a;
    private String b;

    public void writ(){
        System.out.println("你好，"+a);
    }
    public void Print(){
        System.out.println("练习"+b+"中");
    }
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
