package cn.jjz.pojo.zhujieonetomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/10/14.
 * 主题表
 */
@Entity
@Table(name = "Subjects")
public class Os {
    @Id
    @GeneratedValue
    private int sid;
    @Column(name = "title")
    private String title; //主题名字
    @Column(name = "totalVotes")
    private int totalVotes; //投票人数
    @Column(name = "viewTimes")
    private int viewTimes; //查看次数
    @Column(name = "createDate")
    private String createDate;//创建时间
    @OneToMany(mappedBy = "os",cascade = CascadeType.ALL)
    private Set<Oi> ois=new HashSet<Oi>();

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public int getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(int viewTimes) {
        this.viewTimes = viewTimes;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Set<Oi> getOis() {
        return ois;
    }

    public void setOis(Set<Oi> ois) {
        this.ois = ois;
    }
}
