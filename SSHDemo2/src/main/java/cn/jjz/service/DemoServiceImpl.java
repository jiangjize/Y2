package cn.jjz.service;

import cn.jjz.dao.DemoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/11/3.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Resource(name = "DemoDao")
    private DemoDao demoDao;

}
