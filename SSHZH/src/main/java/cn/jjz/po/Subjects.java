package cn.jjz.po;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lenovo on 2017/10/14.
 * 主题表
 */
@Entity //指定是实体类
@Table(name = "Subjects")  //表名    默认以类名做表名
public class Subjects {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "title")
    private String title; //主题名字
    @Column(name = "totalVotes")
    private int totalVotes; //投票人数
    @Column(name = "viewTimes")
    private int viewTimes; //查看次数
    @Column(name = "createDate")
    private Date createDate;//创建时间


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
