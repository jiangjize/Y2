

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
<h1>出勤操作</h1>
<form action="/StudentAttServlet?act=add" method="post">
   根据日期查询:<input type="date" name="time" value=""><input type="submit" value="查询">
    <table>
        <c:forEach items="${sl}" var="s">
        <tr>
            <td>${s.studentname}</td>
        <c:forEach items="${al}" var="a">
            <th><input type="radio"name="${s.studentid}" value="${a.attendanceid}">${a.attendancename}</th>
        </c:forEach>
        </tr>
        </c:forEach>
    </table>
       <input type="submit" value="提交">
</form>
<script type="text/javascript">

</script>
</body>
</html>
