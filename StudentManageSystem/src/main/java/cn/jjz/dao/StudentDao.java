package cn.jjz.dao;

import cn.jjz.entity.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public interface StudentDao {
    //Access to student information --查询学生信息
    public List<StudentInfo> accessStudentInfo();
    //Query students on condition --按条件查询学生
    public List<StudentInfo> onConditionQuery(StudentInfo studentInfo);
    //The input result --录入成绩
    public int inputResult(StudentInfo studentInfo);

}
