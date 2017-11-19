package cn.jjz.pojo.viewmodel;

import java.util.Date;

/**
 * Created by lenovo on 2017/9/26.
 */
public class EmpCondition {
    private  String job;
    private Date ahiredate;
    private Date bhiredate;
    private int sal;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getAhiredate() {
        return ahiredate;
    }

    public void setAhiredate(Date ahiredate) {
        this.ahiredate = ahiredate;
    }

    public Date getBhiredate() {
        return bhiredate;
    }

    public void setBhiredate(Date bhiredate) {
        this.bhiredate = bhiredate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
