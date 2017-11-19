package cn.jjz.dao;

import cn.jjz.entity.Student;

import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public interface StudentDao {
    public List<Student> ByclassSelect(Student student);
}
