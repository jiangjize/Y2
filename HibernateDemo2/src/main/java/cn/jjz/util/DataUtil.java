package cn.jjz.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo on 2017/9/26.
 */
public class DataUtil {
    /*
    * String类型转换时间类型
    * */
    public static Date StrData(String str,String type) throws ParseException {
    SimpleDateFormat s=new SimpleDateFormat(type);
        return  s.parse(str);
    }

}
