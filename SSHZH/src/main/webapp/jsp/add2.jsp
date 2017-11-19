<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/14
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add2" method="post">
    主题名称：<input name="title" type="text">
    投票人数：<input name="totalVotes" type="text">
    查看次数：<input name="viewTimes" type="text">
 <%--   创建时间：<input name="createDate" type="date">--%>
    <input type="submit" value="添加">
</form>
</body>
</html>
