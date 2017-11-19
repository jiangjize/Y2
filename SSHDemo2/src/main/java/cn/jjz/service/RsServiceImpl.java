package cn.jjz.service;


import cn.jjz.dao.RsDaoImpl;
import cn.jjz.pojo.Rs;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/29.
 */
@Service("RsService")
public class RsServiceImpl implements RsService {
 @Resource(name = "RsDao")
    private RsDaoImpl rsDao;

    @Transactional
    public void add(Rs rs) {
        rsDao.add(rs);
    }

    public void setRsDao(RsDaoImpl rsDao) {
        this.rsDao = rsDao;
    }

    public RsDaoImpl getRsDao() {
        return rsDao;
    }
}
