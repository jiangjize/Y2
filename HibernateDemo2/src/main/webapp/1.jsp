<%@ page import="cn.jjz.pojo.onetomany.Dept" %>
<%@ page import="cn.jjz.service.DeptService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>

<%
    DeptService s=new DeptService();
    Dept d= (Dept) s.Load(Dept.class,1);
    System.out.println(d.getDeptname());

%>
