package cn.jjz.controller;

import cn.jjz.po.Student;
import cn.jjz.po.Subjects;
import cn.jjz.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/13.
 */
@Controller
public class StudentCTR {
    @Resource(name = "studentService")
    private StudentService studentService;
    @RequestMapping("/add")

    public String add(Student student){
        studentService.add(student);
        return "addok";
    }

    @RequestMapping("/add2")

    public String add2(Subjects s){
        studentService.add(s);
        return "addok";
    }
}
