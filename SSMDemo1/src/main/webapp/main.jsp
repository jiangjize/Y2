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
    <title>主界面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<script src="${pageContext.request.contextPath}/bs/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/bs/js/holder.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bs/css/bootstrap.css">
<script src="${pageContext.request.contextPath}/bs/js/bootstrap.js"></script>
<style>
    *{
        font-family: 华文楷体;
    }
    .row {
        margin-bottom: 15px;
    }
</style>
<script>

</script>
<body>
<div>
    <%--一个大容器  container--%>
    <div class="container">
        <h1>bootstrap前端框架</h1>
        <div class="row">
            <%--  pull-left 左偏移 pull-right 右偏移--%>
            <div class="col-md-3 pull-left">
                <img data-src="holder.js/263x263">
            </div>
            <div class="col-md-3 pull-left">
                <img data-src="holder.js/263x263">
            </div>

            <div class="col-md-3 pull-right">
                <img data-src="holder.js/263x263">
            </div>
        </div>

        <div class="row">

           <%-- <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>--%>

            <%--col-md-offset-3  让前面空3格出来--%>
            <div class="col-md-3 col-md-offset-3">
                <img data-src="holder.js/263x263">
            </div>
            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>
            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>

        </div>
        <div class="row">

            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>

            <div class="col-md-3 col-md-offset-3">
                <img data-src="holder.js/263x263">
            </div>
            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>

        </div>
        <div class="row">

            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>
            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>
            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>
            <div class="col-md-3">
                <img data-src="holder.js/263x263">
            </div>

        </div>
    </div>
</div>
</body>
</html>
