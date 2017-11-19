package cn.jjz.spring802_5;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by lenovo on 2017/8/2.
 */
public class MyAspectj{
    //前置增强
    public void befor(JoinPoint joinPoint){
        System.out.println("前置 ------------"+joinPoint);
    }
    public void befor(){
        System.out.println("前置 ------------");
    }
    //后置增强
    public void ret(Object o){
        System.out.println("后置--------------"+o);
    }
    public void ret(){
        System.out.println("后置--------------");
    }
    //环绕增强
    public Object around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("环绕增强---前");
         Object obj=p.proceed();
        System.out.println("环绕增强---后");
        return ((String )obj).toUpperCase();
    }
    public Object around(ProceedingJoinPoint p,Object o) throws Throwable {
        System.out.println("环绕增强---前");
        Object obj=p.proceed();
        System.out.println("环绕增强---后");
        return ((String )obj).toUpperCase();
    }
    //异常增强
     public void thr(){
         System.out.println("出错了");
     }
    //最终增强
    public void after(){
        System.out.println("-------------------最终增强-----------------");
    }
}
