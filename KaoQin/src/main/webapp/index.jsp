

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
    <title>学生考勤</title>
</head>
<body>
<h1>欢迎来到考勤管理系统</h1>
<form action="/StudentServlet?act=cha" method="post">
<select name="classesid">
    <option value="0">请选择班级</option>
    <c:forEach items="${cl}" var="g">
        <option value="${g.classesid}">${g.classesname}</option>
    </c:forEach>
</select>
    <input type="submit" value="查询">
</form>
</body>
</html>
