<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/7/9
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
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
    <title>编辑</title>
</head>
<%
    request.setCharacterEncoding("utf-8");
    String code=request.getParameter("code");
    String stucode=request.getParameter("stucode");
    String name=request.getParameter("name");
    String score=request.getParameter("score");
%>
<script type="text/javascript" src="<%=path%>/layer-v3.0.3/layer/layer.js"></script>
<link rel="stylesheet" href="<%=path%>/css/pintuer.css">
<link rel="stylesheet" href="<%=path%>/css/admin.css">
<link href="<%=path%>/../layer-v3.0.3/layer/mobile/need/layui.css" rel="stylesheet" />
<link href="<%=path%>/../plugin/layui/css/layui.css" rel="stylesheet" />
<body>

<div class="panel admin-panel margin-top">
    <div class="body-content">
        <form method="post" class="form-x" action="/StudentServlet?act=inputresult">
            <div class="form-group">
                <div class="label">
                    <label> 班级:</label>
                </div>
                <div class="field">
                    <input type="hidden" name="stucode" value="<%=stucode%>">
                    <input type="text" class="input w50" width="100px" name="code" readonly="readonly" value="<%=code%>" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label> 姓名:</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="name" readonly="readonly" value="<%=name%>" />
                    <div class="tips"></div>
                </div>
            </div>
            <br/>
            <div class="form-group">
                <div class="label">
                    <label> 成绩:</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="score" required="required" pattern="^[0-9]*$"   value="<%=score%>" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 录入</button>
                </div>
            </div>
        </form>

    </div>
</div>
<script type="text/javascript">

</script>
</body>
</html>
