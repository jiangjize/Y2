package cn.jjz.service;

import cn.jjz.entity.Us;

import java.util.List;

/**
 * Created by lenovo on 2017/10/16.
 */
public interface IUsService {
    public Us Login(Us us);
    /*查询所有用户*/
    public List queryAllUser();
}
