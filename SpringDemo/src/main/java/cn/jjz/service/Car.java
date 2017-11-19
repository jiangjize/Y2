package cn.jjz.service;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Car {
    private String brend;
    private String cole;

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", cole='" + cole + '\'' +
                '}';
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getCole() {
        return cole;
    }

    public void setCole(String cole) {
        this.cole = cole;
    }
}
