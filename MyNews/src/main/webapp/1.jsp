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
<script type="text/javascript">

    $(function(){
      A();

    })
function A(ti,id) {
    location.href="<%=path%>/NewsServlet?act=A&title="+ti+"&id="+id;
}
</script>

<body>
<section class="publicMian ">

    <div class="right">

        <!--供应商操作表格-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="80px">编号</th>
                <th width="100px">标题</th>
                <th width="70px">访问量</th>
                <th width="70px">评论次数</th>
            </tr>
              <c:forEach var="u" items="${List}">
                <tr>
                    <td>${u.newsid}</td>
                    <td><a href="" onclick="A('${u.newstitle}','${u.newsid}')">${u.newstitle}</a></td>
                    <td>${u.clickCount}</td>
                    <td>5</td>
                </tr>
             </c:forEach>
        </table>

            当前页数:[${Page.pageIndex} / ${Page.pagetotalpages}
            ]&nbsp;&nbsp;&nbsp;
            <c:if test="${Page.pagetotalpages==1}">
                <li><a onclick="up();">上一页</a></li>
                <li><a onclick="down();">下一页</a></li>
            </c:if>
            <c:if test="${Page.pageIndex < Page.pagetotalpages && Page.pageIndex==1}">
                <a onclick="up();">上一页</a>&nbsp;&nbsp;&nbsp;
                <a href="<%=path%>/NewsServlet?pageIndex=${Page.pageIndex+1}">下一页</a>
            </c:if>
            <c:if test="${Page.pageIndex < Page.pagetotalpages && Page.pageIndex!=1}">
                <a  href="<%=path%>/NewsServlet?pageIndex=${Page.pageIndex-1}">上一页</a>
                <a href="<%=path%>/NewsServlet?pageIndex=${Page.pageIndex+1}">下一页</a>
            </c:if>
            <c:if test="${Page.pageIndex >= Page.pagetotalpages && Page.pageIndex>1}">
                <a  href="<%=path%>/NewsServlet?pageIndex=${Page.pageIndex-1}">上一页</a>
                <a  onclick="down();">下一页</a>
            </c:if>
        </div>
</section>
</body>
</html>
