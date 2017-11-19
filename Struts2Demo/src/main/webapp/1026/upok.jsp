<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/30
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传成功</title>
</head>
<body>
文件是: <s:property value="uploadFileName"></s:property><br/>
文件类型：<s:property value="uploadContentType"></s:property><br/>
</body>
</html>
