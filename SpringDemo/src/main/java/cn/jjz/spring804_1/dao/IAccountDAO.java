package cn.jjz.spring804_1.dao;


import cn.jjz.spring804_1.entity.Account;

/**
 * Created by Happy on 2017-08-04.
 * 账户类
 */
public interface IAccountDAO {
    //开户的方法
    public boolean addAccount(Account account);
    //修改账户余额  金额减少true
    public boolean updateAccount(int aid, double money, boolean isBuy);
}
