package cn.jjz.service;

import cn.jjz.dao.StudentDao;
import cn.jjz.po.Student;
import cn.jjz.po.Subjects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/13.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
@Resource(name = "studentDao")
    private StudentDao dao;
    @Transactional
    public int add(Student student) {
        int result=dao.add(student);
        return result;
    }
    @Transactional
    public int add(Subjects s) {
        return dao.add(s);
    }

}
