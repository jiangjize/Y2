package cn.tms.dao;

import cn.tms.entity.Privilege;

import java.util.List;

/**
 * Created by Happy on 2017-10-16.
 * 权限接口
 */
public interface IPrivilegeDAO {
    //01.根据    用户编号  获取所有  【权限】
    public List<Privilege> getAllPrivilegesByEmpId(String id);
}

