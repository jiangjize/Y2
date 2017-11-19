package cn.jjz.dao;

import cn.jjz.po.Student;
import cn.jjz.po.Subjects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by lenovo on 2017/10/13.
 */
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
    @Resource
 private SessionFactory sessionFactory;
    public int add(Student student) {
        Serializable s=sessionFactory.getCurrentSession().save(student);
        return (Integer) s;
    }

    public int add(Subjects s) {
        Serializable s1=sessionFactory.getCurrentSession().save(s);
        return (Integer) s1;
    }
}
