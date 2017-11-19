package cn.jjz.po;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/13.
 */
@Entity
@Table(name = "studentnew")
public class Student {
    @Id
    @GeneratedValue
    private int sid;
    @Column
    private String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
