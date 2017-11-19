package cn.jjz.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/8/11.
 */
public class Student {
    private int studentid;
    private String studentname;
    private int classesid;
    private Date studentcatetime;
  private Classes classes;

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getClassesid() {
        return classesid;
    }

    public void setClassesid(int classesid) {
        this.classesid = classesid;
    }

    public Date getStudentcatetime() {
        return studentcatetime;
    }

    public void setStudentcatetime(Date studentcatetime) {
        this.studentcatetime = studentcatetime;
    }
}
