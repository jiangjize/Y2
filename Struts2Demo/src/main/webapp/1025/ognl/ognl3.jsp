<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/25
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="/wu/ognl2" method="POST">
    <s:textfield name="student.name" ></s:textfield>
    <s:textfield name="student.emil" ></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>



</body>
</html>
