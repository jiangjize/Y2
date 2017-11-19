package cn.jjz.dao;

import cn.jjz.entity.Talk;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/7/21.
 */
public interface TalkDao {
    public int Add(Talk talk)throws Exception;
    public List<Talk> Gettalk(@Param("nid")int nid)throws Exception;
}

