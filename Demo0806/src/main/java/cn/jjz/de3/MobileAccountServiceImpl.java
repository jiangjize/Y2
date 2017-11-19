package cn.jjz.de3;

public class MobileAccountServiceImpl implements AccountService {
    @Override
    public int quer(String mobileNo) {
        if(mobileNo!=null){
            return 100;
        }
        return 0;
    }

    public String shoopingPayment(String name, byte age) {
        StringBuffer sb = new StringBuffer().append("打出来的是：").append(name).append(",年龄是：").append(age);
        return sb.toString();
    }
}
