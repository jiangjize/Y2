package cn.jjz.spring730_3.dao;

import cn.jjz.spring730_3.entity.Student;

/**
 * Created by lenovo on 2017/7/29.
 */
public class StuDaoImpl implements StuDao {
    public void Save(Student s) {
        System.out.println("保存了一个学生");
    }
}
