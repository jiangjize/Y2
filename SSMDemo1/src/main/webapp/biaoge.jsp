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
    <title>表格界面</title>
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

</style>
<script>

</script>
<body>
<%--                     条纹状表格      悬停响应     加上边框        ---%>
<table class="table table-striped table-hover table-bordered">
    <tr>
        <th>姓名</th>
        <th>姓名</th>
        <th>姓名</th>
        <th>姓名</th>
    </tr>
    <tr>
        <td>剑姬</td>
        <td>剑姬</td>
        <td>剑姬</td>
        <td>剑姬</td>
    </tr>
    <tr>
        <td>剑姬</td>
        <td>剑姬</td>
        <td>剑姬</td>
        <td>剑姬</td>
    </tr>
    <tr>
        <td>剑姬</td>
        <td>剑姬</td>
        <td>剑姬</td>
        <td>剑姬</td>
    </tr>
</table>
<table class="table table-bordered table-hover">
<%--
   状态类
  .active	鼠标悬停在行或单元格上时所设置的颜色
  .success	标识成功或积极的动作
  .info	标识普通的提示信息或动作
  .warning	标识警告或需要用户注意
  .danger	标识危险或潜在的带来负面影响的动作
  --%>
<tr class="active">
    <th>321</th>
</tr>
<tr>
    <td class="active">...</td>
</tr>
<tr class="success">
    <th>321</th>
</tr>
<tr>
    <td class="success">...</td>
</tr>
<tr class="warning">
    <th>321</th>
</tr>
<tr>
    <td class="warning">...</td>
</tr>
<tr class="danger">
    <th>321</th>
</tr>
<tr>
    <td class="danger">...</td>
</tr>
<tr class="info">
    <th>321</th>
</tr>
<tr>
    <td class="info">...</td>
</tr>
</table>
<%--响应式表格   当th太长时会有效果--%>
<div class="table-responsive">
    <table class="table">
        <tr class="info">
            <th>电话...............</th>
            <th>电话................</th>
            <th>电话....................</th>
            <th>电话................</th>
            <th>电话...................</th>
            <th>电话..............</th>
            <th>电话..............</th>
            <th>电话................</th>
            <th>电话.............</th>
        </tr>
        <tr>
            <td class="info">...</td>
            <td class="info">...</td>
            <td class="info">...</td>
            <td class="info">...</td>
            <td class="info">...</td>
            <td class="info">...</td>
            <td class="info">...</td>
            <td class="info">...</td>
            <td class="info">...</td>

        </tr>
    </table>
</div>
</body>
</html>
