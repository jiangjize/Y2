<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/29
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form method="POST" action="add">
    姓名：<s:textfield name="rs.name"></s:textfield>
    年龄：<s:textfield name="rs.age"></s:textfield>
    <s:submit value="添加"></s:submit>
</s:form>
</body>
</html>
