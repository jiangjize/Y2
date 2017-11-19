<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/22
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="go">Go!!!</a>
<%
    if(application.getAttribute("times")==null)
    application.setAttribute("times","2017年10月22日13:57:07");
     //session设置值
    session.setAttribute("sessionname","2017年10月22日14:53:51");
%>
</body>
</html>
