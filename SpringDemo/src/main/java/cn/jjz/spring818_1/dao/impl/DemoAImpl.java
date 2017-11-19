package cn.jjz.spring818_1.dao.impl;

import cn.jjz.spring818_1.dao.DemoA;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2017/8/18.
 */
@Repository("demoaimpl")
public class DemoAImpl implements DemoA {
    public void Save() {
        System.out.println("保存了一本书");
    }
}
