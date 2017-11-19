package cn.tms.service;

import cn.tms.entity.Privilege;

import java.util.List;

/**
 * Created by Happy on 2017-10-16.
 * 权限Service
 */
public interface IPrivilegeService {
    //01.根据    用户编号  获取所有  【权限】
    public List<Privilege> getAllPrivilegesByEmpId(String id);
}
