package cn.jjz.service;


import cn.jjz.dao.RsDaoImpl;
import cn.jjz.pojo.Rs;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/29.
 */

public class RsServiceImpl implements RsService {

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
