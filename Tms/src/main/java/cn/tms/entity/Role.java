package cn.tms.entity;

/**
 * Created by Happy on 2017-10-16.
 * 角色类
 */
public class Role {
    private Integer id;// 编号
    private String rolename;// 角色名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
