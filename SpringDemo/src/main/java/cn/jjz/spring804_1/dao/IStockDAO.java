package cn.jjz.spring804_1.dao;


import cn.jjz.spring804_1.entity.Stock;

/**
 * Created by Happy on 2017-08-04.
 */
public interface IStockDAO {
    public boolean addStock(Stock stock);
    public boolean updateStock(int sid, int count, boolean isBuy);
}
