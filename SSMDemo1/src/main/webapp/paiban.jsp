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
    <title>排版界面</title>
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
<div>
    <%--标题--%>
    <h1>h1. Bootstrap heading</h1>
    <h2>h2. Bootstrap heading</h2>
    <h3>h3. Bootstrap heading</h3>
    <h4>h4. Bootstrap heading</h4>
    <h5>h5. Bootstrap heading</h5>
    <h6>h6. Bootstrap heading</h6>
    <%--在标题内还可以包含 <small> 标签或赋予 .small 类的元素，
    可以用来标记副标题。--%>
    <h1>h1. Bootstrap heading
        <small>Secondary text</small>
    </h1>
    <h2>h2. Bootstrap heading
        <small>Secondary text</small>
    </h2>
    <h3>h3. Bootstrap heading
        <small>Secondary text</small>
    </h3>
    <h4>h4. Bootstrap heading
        <small>Secondary text</small>
    </h4>
    <h5>h5. Bootstrap heading
        <small>Secondary text</small>
    </h5>
    <h6>h6. Bootstrap heading
        <small>Secondary text</small>
    </h6>
    <%--带下划线的文本--%>
        <u>我带了下划线的</u>
        <%--文本对齐--%>
        <p class="text-left">Left aligned text.</p>
        <p class="text-center">Center aligned text.</p>
        <p class="text-right">Right aligned text.</p>
        <p class="text-justify">Justified text.</p>
        <p class="text-nowrap">No wrap text.</p>
    <%--无序列表--%>
    <ul>
        <li>123</li>
        <li>456</li>
        <li>789</li>
        <li>123</li>
    </ul>
    <%--有序列表--%>
    <ol>
        <li>123</li>
        <li>456</li>
        <li>789</li>
        <li>123</li>
    </ol>
    <%--无样式列表--%>
    <ul class="list-unstyled">
        <li>123</li>
        <li>456</li>
        <li>789</li>
        <li>123</li>
    </ul>
    <%--内联列表--%>
    <ul class="list-inline">
        <li>123</li>
        <li>456</li>
        <li>789</li>
        <li>123</li>
    </ul>
</body>
</html>
