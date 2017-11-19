package cn.jjz.action1021;

import com.opensymphony.xwork2.Action;

/**
 * Created by lenovo on 2017/10/21.
 */
public class HelloWorld implements Action {
    private  String name;
    private String messge;
    private String tele;


    public String execute() throws Exception {
        this.setMessge("Hello!"+this.getName());
        return "sucess";
    }
   public String Save(){
       this.setTele("+86"+this.getTele());
        return  "Save";
   }
    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

}
