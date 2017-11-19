package cn.jjz.service;

import cn.jjz.po.Student;
import cn.jjz.po.Subjects;

/**
 * Created by lenovo on 2017/10/13.
 */
public interface StudentService {
    public int add(Student student);
    public int add(Subjects s);
}
