package cn.jjz.printer.dayin;

import cn.jjz.printer.mohe.Mohe;
import cn.jjz.printer.zhi.Zhi;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Daying {
    private Mohe mohe;
    private Zhi zhi;
    public void Print(){
        System.out.println("使用"+mohe.GetMohe()+"，"+zhi.GetZhi()+"打印了一串字符");
    }


    public Mohe getMohe() {
        return mohe;
    }

    public void setMohe(Mohe mohe) {
        this.mohe = mohe;
    }

    public Zhi getZhi() {
        return zhi;
    }

    public void setZhi(Zhi zhi) {
        this.zhi = zhi;
    }
}
