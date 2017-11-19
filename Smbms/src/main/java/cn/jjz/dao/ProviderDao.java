package cn.jjz.dao;

import cn.jjz.entity.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public interface ProviderDao {
    //获取所有的供应商信息
    public  List<Provider> getProviderInfo(@Param("size") int page, @Param("index") int index) throws Exception;
    //获取总供应商记录数
    public int getCount()throws Exception;
    //添加供应商
    public int addProvider(Provider pro)throws Exception;
    //删除供应商
    public int DeleTeProvide(@Param("proCode") String proCode)throws Exception;
    //修改供应商

}
