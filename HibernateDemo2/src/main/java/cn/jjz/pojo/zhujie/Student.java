package cn.jjz.pojo.zhujie;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/11.
 */
@Entity  //让hibernate知道 这是一个持久类
@Table(name = "studentnew")
public class Student {
    /*
    * 使用序列做ID
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "a")
    @SequenceGenerator(name = "a",sequenceName = "seq_id",allocationSize = 1,initialValue = 1)
    private int sid;
    @Column(name = "sname")
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
