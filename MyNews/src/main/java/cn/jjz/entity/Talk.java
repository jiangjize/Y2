package cn.jjz.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/21.
 */
public class Talk {
    private int tid;
    private String content;
    private int nid;
    private String talktime;
    private News news;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getTalktime() {
        return talktime;
    }

    public String setTalktime(String talktime) {
        this.talktime = talktime;
        return null;
    }
}
