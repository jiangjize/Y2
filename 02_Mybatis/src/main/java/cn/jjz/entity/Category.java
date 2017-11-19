package cn.jjz.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/7/12.
 */
public class Category {
    private Integer cid;
    private String cname;

    //植入自己的一个泛型
    private Set<Category> cates=new HashSet<Category>();

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Category> getCates() {
        return cates;
    }

    public void setCates(Set<Category> cates) {
        this.cates = cates;
    }
}
