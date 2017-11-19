package cn.jjz.dao;

import cn.jjz.entity.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public interface BillDao {
    //获取所有的订单信息
    public List<Bill> getBillInfo(@Param("size") int page, @Param("index") int index) throws Exception;
    //获取总订单记录数
    public int getCount()throws Exception;
    //按选择条件查询订单
    public List<Bill> ByTermSelectBill(@Param("n") String n,@Param("is") int is,@Param("pid") int pid,@Param("size") int page, @Param("index") int index)throws Exception;
    //获取查询总订单记录数
    public int getSelectCount(@Param("n") String n,@Param("is") int is,@Param("pid") int pid)throws Exception;
    //添加订单
    //删除订单
    //修改订单
}
