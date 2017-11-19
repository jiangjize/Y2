package cn.jjz.dao;

import cn.jjz.entity.GradeInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public interface GradeDao {
    // 查询所有班级
    public List<GradeInfo> selectAllGrade();
    // 添加班级
    public int addGrade(GradeInfo gradeInfo);
    // 删除学生
    public int delGrade(@Param("gradecode")int gradecode);
     //修改学生
    public int updateGrade();
}
