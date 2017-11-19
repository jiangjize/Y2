package cn.jjz.spring730_3.service;

import cn.jjz.spring730_3.dao.StuDao;
import cn.jjz.spring730_3.entity.Student;

/**
 * Created by lenovo on 2017/7/29.
 */
public class StuServiceImpl implements StuService {
    private StuDao dao;
    public void SavaStu(Student s) {
        dao.Save(s);
    }

    public StuDao getDao() {
        return dao;
    }

    public void setDao(StuDao dao) {
        this.dao = dao;
    }
}
