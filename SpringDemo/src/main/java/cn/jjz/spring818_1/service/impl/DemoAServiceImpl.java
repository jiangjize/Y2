package cn.jjz.spring818_1.service.impl;


import cn.jjz.spring818_1.dao.DemoA;
import cn.jjz.spring818_1.service.DemoAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/8/18.
 */
@Service()
public class DemoAServiceImpl implements DemoAService {
    @Autowired
    private DemoA demoA;
    public void A() {
        demoA.Save();
    }

    public DemoA getDemoA() {
        return demoA;
    }

    public void setDemoA(DemoA demoA) {
        this.demoA = demoA;
    }
}
