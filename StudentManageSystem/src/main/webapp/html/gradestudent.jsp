<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/7/6
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Title</title>
</head>
<link rel="stylesheet" href="<%=path%>/css/pintuer.css">
<link rel="stylesheet" href="<%=path%>/css/admin.css">
<script src="<%=path%>/js/jquery.js"></script>
<script src="<%=path%>/js/pintuer.js"></script>
<script type="text/javascript" src="<%=path%>/plugin/jquery-1.8.3.js"></script>
<script type="text/javascript">

</script>

<body>
<form method="post" action="" id="listform">
    <div class="panel admin-panel">
        <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
        <div class="padding border-bottom">
            <ul class="search" style="padding-left:10px;">
               &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <if condition="$iscid eq 1">
                    <li>
                        <select name="cid" class="input" style="width:200px; line-height:17px;" onchange="changesearch()">
                            <option value="">请选择班级</option>
                            <option value="">产品分类</option>
                        </select>
                    </li>
                </if>
                <li>
                    <input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
                    <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a>
                </li>
            </ul>
        </div>
        <table class="table table-hover text-center">
            <tr>
                <th>ID</th>
                <th>名称</th>
                <th>所在班级</th>
                <th width="310">操作</th>
            </tr>
                <tr>
                    <td>1</td>
                    <td>李洪</td>
                    <td>所在班级</td>
                    <td><div class="button-group">
                        <a class="button border-main" href="add.html">
                            <span class="icon-edit"></span> 修改</a>
                        <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1,1)">
                            <span class="icon-trash-o"></span> 删除</a>
                    </div></td>
                </tr>
                <tr>
                    <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
                </tr>
        </table>
    </div>
</form>
</body>
</html>
