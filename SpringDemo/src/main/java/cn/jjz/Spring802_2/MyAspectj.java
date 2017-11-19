package cn.jjz.Spring802_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by lenovo on 2017/8/2.
 * Aspect注解
 */
@Aspect
public class MyAspectj{
    @Pointcut("execution(* *..Spring802_2.*.A(..))")
    private void A(){}

    @Pointcut("execution(* *..Spring802_2.*.B(..))")
    private void B(){}

    @Pointcut("execution(* *..Spring802_2.*.c(..))")
    private void c(){}

//前置增强
@Before("A()||B()")
    public void befor(){
    System.out.println("前置增强---------------");

}

//后置增强
@AfterReturning("execution(* *..Spring802_2.*.*(..))")
    public void ret(){
    System.out.println("----------后置增强");
    System.out.println();
}

//环绕增强
@Around("execution(* *..Spring802_2.*.*(..))")
    public void thr(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("------环绕异常----前");
    pjp.proceed();
    System.out.println("------环绕异常----后");
    System.out.println("");
    }
    //异常增强
    @AfterThrowing("execution(* *..Spring802_2.*.*(..))")
    public void thr(){
        System.out.println("==========出错了=============");
    }
}
