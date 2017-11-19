package cn.jjz.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/9/22.
 */
@Entity
@Table(name = "Rs")
public class Rs {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy="uuid")
    private String id;
    @Column
    private String name;
    @Column
    private int age;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
