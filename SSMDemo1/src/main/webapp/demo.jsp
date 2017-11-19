<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/11/1
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Demo界面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<script src="${pageContext.request.contextPath}/bs/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/bs/js/holder.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bs/css/bootstrap.css">
<script src="${pageContext.request.contextPath}/bs/js/bootstrap.js"></script>
<style>
    * {
        font-family: 华文楷体;
    }

    .row {
        background-color: #a1abff;
        color: beige;
        margin-bottom: 15px;
    }

    .form-control {
        background-color: #a1abff;
        color: beige;
        margin-top: 7px;
        size: 16px;
    }

    #h1a {
        margin-top: -1px;
    }
</style>
<script>

</script>
<body>
<%--第一个大容器--%>
<div class="container">

    <div class="row">
        <div class="col-md-3 pull-left">
            <h1 id="h1a">soyea</h1>
        </div>
        <div class="col-md-3 pull-right">
            <select class="form-control">
                <option>超级管理员</option>
                <option>信息</option>
                <option>修改密码</option>
            </select>
        </div>
    </div>


</div>
</body>
</html>
