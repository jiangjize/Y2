package cn.jjz.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/10/14.
 * 主题表
 */

public class Subjects {

    private int sid;

    private String title; //主题名字

    private int totalVotes; //投票人数

    private int viewTimes; //查看次数

    private Date createDate;//创建时间
    private Set<Options> optionss=new HashSet<Options>();

    public Set<Options> getOptionss() {
        return optionss;
    }

    public void setOptionss(Set<Options> optionss) {
        this.optionss = optionss;
    }

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
