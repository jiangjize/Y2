package cn.jjz.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/8/11.
 */
public class Studentattendance {
    private int studentattendaneid;
    private int studentid;
    private Date attendancetime;
    private int attendanceid;

    public int getStudentattendaneid() {
        return studentattendaneid;
    }

    public void setStudentattendaneid(int studentattendaneid) {
        this.studentattendaneid = studentattendaneid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public Date getAttendancetime() {
        return attendancetime;
    }

    public void setAttendancetime(Date attendancetime) {
        this.attendancetime = attendancetime;
    }

    public int getAttendanceid() {
        return attendanceid;
    }

    public void setAttendanceid(int attendanceid) {
        this.attendanceid = attendanceid;
    }
}
