package cn.jjz.pojo.manytoone;



/**
 * Created by lenovo on 2017/10/6.
 */
public class Emps {
    private int eid;
    private String ename;
    private Dept dept=new Dept();

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
