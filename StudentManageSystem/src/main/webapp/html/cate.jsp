<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>

<link rel="stylesheet" href="<%=path%>/css/pintuer.css">
<link rel="stylesheet" href="<%=path%>/css/admin.css">
<script src="<%=path%>/js/jquery.js"></script>
<script src="<%=path%>/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 班级列表</strong></div>
  <div class="padding border-bottom">
    <button type="button" class="button border-yellow" onclick="window.location.href='#add'">
      <span class="icon-plus-square-o"></span> 添加班级</button>
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th width="5%">ID</th>
      <th width="15%">班级名称</th>
      <th width="10%">操作</th>
    </tr>
      <c:forEach items="${gradelist}" var="g">
    <tr>
      <td>${g.gracode}</td>
      <td>${g.graname}</td>
      <td><div class="button-group">
       <%-- <a class="button border-main" href="javascript:void(0)" onclick="xiu()">
        <span class="icon-edit"></span> 修改</a>
        <a class="button border-red" href="javascript:void(0)" onclick="return del('${g.gracode}')">
          <span class="icon-trash-o"></span> 删除</a>--%>
        <a class="button border-blue" href="javascript:void(0)" onclick="return sele('${g.gracode}')">
          <span class="icon-search"></span> 查看</a>
      </div></td>
    </tr>
      </c:forEach>

  </table>
</div>



<script type="text/javascript">
  function xiu() {
        /*	location.href="/GradeServlet?act=UpdateGrade";*/
          alert('班级修改功能尚未完善，请勿重试！！！')


  }
function del(id){
	if(confirm("您确定要删除吗?")){			
	/*	location.href="/GradeServlet?act=DeleteGrade&id="+id;*/
	alert('班级不可以删除，请勿重试！！！')

	}
}
</script>
<div class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>添加班级</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/GradeServlet?act=AddGrade">
      <div class="form-group">
        <div class="label">
          <label>班级名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="graname" required="required" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>