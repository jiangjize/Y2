package cn.jjz.service;

/**
 * Created by lenovo on 2017/7/22.
 */
public class DemoService {
    private String info;
    private String name;
    public DemoService(){
        System.out.println("------------");

    }
    public void We(){
        System.out.println(name+"说:"+info);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
