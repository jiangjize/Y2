

<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="/LoginServlet" method="post">
   账号： <input type="text" value="jiang" name="logincode"><br/>
    密码：<input type="password" value="1" name="loginpwd">
    <input type="submit" value="登陆">
</form>
</body>
</html>