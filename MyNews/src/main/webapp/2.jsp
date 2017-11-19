<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="<%=path%>/js/jquery-1.11.1.js"></script>
<script type="text/javascript">

    $(function(){

    })
    function B() {
        var n= $("#name").val();
        var id=$("#nid").val();
        location.href="<%=path%>/NewsServlet?act=B&name="+n+"&nid="+id;
    }
</script>
<body>
<div>
    <h1>内容：${title}</h1>


    <table class="providerTable" cellpadding="0" cellspacing="0">
        <tr class="firstTr">

            <th width="70px">评论</th>
        </tr>
        <c:forEach var="u" items="${li}">
            <tr>
                <td>${u.content}</td>
                <input type="hidden" id="nid" value="${u.nid}">
            </tr>
        </c:forEach>
    </table>
       <input type="text" id="name" value="">
    <input type="button" onclick="return B()" name="xx" id="xx" value="发表">

</div>
</body>
</html>
