<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/21
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<s:property value="messge"></s:property>
<form action="tijiao.action" method="post">
    name:<input name="name" type="text"/>
    <input type="submit" value="提交"/>
</form>

<form action="save.action" method="post">
    tele:<input name="tele" type="text"/>
    <input type="submit" value="提交"/>
</form>
<a href="index.action">Go!!.......首页</a>
<a href="index2.action">Go!!.......首页2</a>
<h2>第一个登录</h2>
<form action="Login.action" method="post">
   账号:<input name="username" type="text"/><br/>
    密码：<input name="password" type="password"/><br/>
    <input type="submit" value="提交"/>
</form>


<h2>新的登录</h2>

<form action="Logins.action" method="post">
    账号:<input name="name" type="text"/><br/>
    密码：<input name="pwd" type="password"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
