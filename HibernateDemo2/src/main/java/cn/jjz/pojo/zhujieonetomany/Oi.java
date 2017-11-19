package cn.jjz.pojo.zhujieonetomany;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/14.
 * 选择表
 */
@Entity
@Table(name = "Options")
public class Oi {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String optContent; //选项内容
    @Column
    private int vote; //得票数
    @ManyToOne
    @JoinColumn(name = "sid")
    private Os os;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }
}
