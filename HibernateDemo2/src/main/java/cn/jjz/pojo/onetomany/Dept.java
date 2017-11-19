package cn.jjz.pojo.onetomany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/10/6.
 */
public class Dept {
    private int deptno;
    private String deptname;
    private Set<Emps> emps=new HashSet<Emps>();

    public Set<Emps> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emps> emps) {
        this.emps = emps;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
