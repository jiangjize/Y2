package cn.jjz.dao;

import cn.jjz.po.Student;
import cn.jjz.po.Subjects;
import org.hibernate.Session;

/**
 * Created by lenovo on 2017/10/13.
 */
public interface StudentDao {
    public int add(Student student);
    public int add(Subjects s);
}
