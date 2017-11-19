package cn.jjz.entity;

import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public class StudentInfo {
    private int stucode;
    private  String stuname;
    private int stugrade;
    private int stuscore;
    private GradeInfo gradeInfo;

    public GradeInfo getGradeInfo() {
        return gradeInfo;
    }

    public void setGradeInfo(GradeInfo gradeInfo) {
        this.gradeInfo = gradeInfo;
    }

    public int getStucode() {
        return stucode;
    }

    public void setStucode(int stucode) {
        this.stucode = stucode;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getStugrade() {
        return stugrade;
    }

    public void setStugrade(int stugrade) {
        this.stugrade = stugrade;
    }

    public int getStuscore() {
        return stuscore;
    }

    public void setStuscore(int stuscore) {
        this.stuscore = stuscore;
    }
}
