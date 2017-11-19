package cn.jjz.entity;

/**
 * Created by lenovo on 2017/8/9.
 */
public class GradeInfo {
    private int gracode;
    private String graname;
    private StudentInfo studentInfo;

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public int getGracode() {
        return gracode;
    }

    public void setGracode(int gracode) {
        this.gracode = gracode;
    }

    public String getGraname() {
        return graname;
    }

    public void setGraname(String graname) {
        this.graname = graname;
    }
}
