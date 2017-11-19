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
    <title>按钮界面</title>
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

<body>
<%--
    按钮：
--%>
<!-- Standard button -->
<button type="button" class="btn btn-default">（button）Default</button>
<button type="submit" class="btn btn-default">（submit）Default</button>
<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
<button type="button" class="btn btn-primary">（button）Primary</button>
<button type="submit" class="btn btn-primary">（submit）Primary</button>
<!-- Indicates a successful or positive action -->
<button type="button" class="btn btn-success">（button）Success</button>
<button type="submit" class="btn btn-success">（submit）Success</button>
<!-- Contextual button for informational alert messages -->
<button type="button" class="btn btn-info">（button）Info</button>
<button type="submit" class="btn btn-info">（submit）Info</button>
<!-- Indicates caution should be taken with this action -->
<button type="button" class="btn btn-warning">（警告）Warning</button>

<!-- Indicates a dangerous or potentially negative action -->
<button type="button" class="btn btn-danger">（危险）Danger</button>

<!-- Deemphasize a button by making it look like a link while maintaining button behavior -->
<button type="button" class="btn btn-link" href="/anniu.jsp">（链接）Link</button>



<p>
    <button type="button" class="btn btn-primary btn-lg">（大按钮）Large button</button>
    <button type="button" class="btn btn-default btn-lg">（大按钮）Large button</button>
</p>
<p>
    <button type="button" class="btn btn-primary">（默认尺寸）Default button</button>
    <button type="button" class="btn btn-default">（默认尺寸）</button>
</p>
<p>
    <button type="button" class="btn btn-primary btn-sm">（小按钮）Small button</button>
    <button type="button" class="btn btn-default btn-sm">（小按钮）Small button</button>
</p>
<p>
    <button type="button" class="btn btn-primary btn-xs">（超小尺寸）Extra small button</button>
    <button type="button" class="btn btn-default btn-xs">（超小尺寸）Extra small button</button>
</p>
</body>
</html>
