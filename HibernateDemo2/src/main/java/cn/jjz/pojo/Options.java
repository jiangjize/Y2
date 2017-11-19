package cn.jjz.pojo;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/14.
 * 选择表
 */

public class Options {

    private int oid;

    private String optContent; //选项内容

    private int vote; //得票数

    private int sid;//主题ID
      private Subjects subjects=new Subjects();

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOptContent() {
        return optContent;
    }

    public void setOptContent(String optContent) {
        this.optContent = optContent;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }


}
