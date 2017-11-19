package cn.jjz.service.impl;

import cn.jjz.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by 123 on 2017/10/07.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "test";  //转入test.jsp页面
    }
}
