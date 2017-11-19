<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/30
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<s:form action="uploadAction" enctype="multipart/form-data" method="post">
    <s:file name="upload" label="选择文件"/><br/>
    <s:submit name="submit" value="文件上传"/>
</s:form>
</body>
</html>
