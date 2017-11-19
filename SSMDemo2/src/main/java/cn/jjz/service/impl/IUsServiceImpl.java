package cn.jjz.service.impl;

import cn.jjz.dao.IUsDao;
import cn.jjz.entity.Us;
import cn.jjz.service.IUsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/10/16.
 */
@Service("IUsService")
public class IUsServiceImpl implements IUsService {
    @Resource(name = "IUsDao")
    private IUsDao iUsDao;
    public Us Login(Us us) {
        return iUsDao.Login(us);
    }

    public List queryAllUser() {
        return iUsDao.queryAllUser();
    }
}
