package cn.jjz.dao;

import cn.jjz.entity.Studentattendance;

import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public interface StudentattendanceDao {
    public List<Studentattendance> ByRiqi(Studentattendance studentattendance);
    public int Add(Studentattendance studentattendance);
}
