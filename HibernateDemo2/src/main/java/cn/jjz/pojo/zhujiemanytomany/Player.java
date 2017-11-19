package cn.jjz.pojo.zhujiemanytomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/10/11.
 */
@Entity
@Table
public class Player {
    @Id
    @GeneratedValue
    private Integer pid;
    private  String pname;
    /*
     * cascade：为级联操作，里面有级联保存，级联删除等，all为所有
     * fetch：加载类型，有lazy和eager二种，
     *   eager为急加载，意为立即加载，在类加载时就加载，lazy为慢加载，第一次调用的时候再加载，由于数据量太大，onetomany一般为lazy
     * mappedBy：这个为manytoone中的对象名
     */

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "player")
    private Set<Game> game=new HashSet<Game>();

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Set<Game> getGame() {
        return game;
    }

    public void setGame(Set<Game> game) {
        this.game = game;
    }
}
