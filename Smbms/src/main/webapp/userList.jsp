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
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<script type="text/javascript" >
    function Cha() {
       var name= $("#namea").val();
        location.href="<%=path%>/UserServlet?act=Select&name="+name;
    }
    function Xiu(c,n,g,b,p,r,a) {
        location.href="<%=path%>/UserServlet?act=GetUpInfo&userCode="+c+"&userName="+n+"&gender="+g+"&userrole="+r+"&userAddress="+a+"&userphone="+p+"&data="+b;
    }
    function Del(name) {
       var a= confirm('确定删除？');
       if(a){
           location.href="<%=path%>/UserServlet?act=DelUser&name="+name;
       }
    }
    function up() {
        alert("已经是第一页了,请点击下一页查看！");
    }
    function down() {
        alert("已经是最后一页了,请点击上一页查看！");
    }
    function dian() {

    }
</script>
<!--头部-->
    <header class="publicHeader">
        <h1>超市账单管理系统</h1>
        <div class="publicHeaderR">
            <p><span>下午好！</span><span style="color: #fff21b"> ${n}</span> , 欢迎你！</p>
            <a href="<%=path%>/UserServlet?act=Zhuxiao">退出</a>
        </div>
    </header>
<!--时间-->
    <section class="publicTime">
        <span id="time">2015年1月1日 11:11  星期一</span>
        <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
    </section>
<!--主体内容-->
    <section class="publicMian ">
        <div class="left">
            <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
            <nav>
                <ul class="list">
                    <li ><a href="<%=path%>/BillServlet?act=getBillInfo">账单管理</a></li>
                    <li><a href="<%=path%>/ProviderServlet?act=getProviderInfo">供应商管理</a></li>
                    <li><a href="<%=path%>/UserServlet?act=LodingUserList">用户管理</a></li>
                    <li><a href="password.jsp">密码修改</a></li>
                    <li><a href="<%=path%>/UserServlet?act=Zhuxiao">退出系统</a></li>
                </ul>
            </nav>
        </div>
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>用户管理页面</span>
            </div>
            <div class="search">
                <span>用户名：</span>
                <input type="text" id="namea" name="name" value="${name}" placeholder="请输入用户名"/>
                <input type="button" value="查询" onclick="return Cha()"/>
                <a href="userAdd.jsp">添加用户</a>
            </div>
            <!--用户-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">用户编码</th>
                    <th width="20%">用户名称</th>
                    <th width="10%">性别</th>
                    <th width="10%">年龄</th>
                    <th width="10%">电话</th>
                    <th width="10%">用户类型</th>
                    <th width="30%">操作</th>
                </tr>
                    <c:forEach var="u" items="${UserList}">
                <tr>
                    <td>${u.userCode}</td>
                    <td>${u.userName}</td>
                    <c:if test="${u.gender eq 1}">
                        <td align="center">女</td>
                    </c:if>
                    <c:if test="${u.gender eq 2}">
                        <td align="center">男</td>
                    </c:if>
                    <td>${u.birthday}</td>
                    <td>${u.phone}</td>
                    <c:if test="${u.userRole eq 1}">
                        <td align="center">用户管理员</td>
                    </c:if>
                    <c:if test="${u.userRole eq 2}">
                        <td align="center">经理</td>
                    </c:if>
                    <c:if test="${u.userRole eq 3}">
                        <td align="center">普通用户</td>
                    </c:if>
                    <%--<td>
                        <a href="userView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="userUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="#" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>--%>
                    <td>
                       <%-- <a href="userView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>--%>
                        <a href="javascript:void(0)" onclick="Xiu('${u.userCode}','${u.userName}','${u.gender}','${u.birthday}','${u.phone}','${u.userRole}','${u.address}')"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="javascript:void(0)" onclick="Del('${u.userCode}')"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
                </c:forEach>
            </table>

<div style="padding-left: 350px;" >
    当前页数:[${Page.pageIndex} / ${Page.pagetotalpages}
        ]&nbsp;&nbsp;&nbsp;
    <a href="<%=path%>/UserServlet?act=LodingUserList&pageIndex=1">首页</a>&nbsp;&nbsp;&nbsp;
    <c:if test="${Page.pagetotalpages==1}">
        <li><a onclick="up();">上一页</a>&nbsp;&nbsp;&nbsp;</li>
        <li><a onclick="down();">下一页</a>&nbsp;&nbsp;&nbsp;</li>
    </c:if>
    <c:if test="${Page.pageIndex < Page.pagetotalpages && Page.pageIndex==1}">
        <a onclick="up();">上一页</a>&nbsp;&nbsp;&nbsp;
        <a href="<%=path%>/UserServlet?act=LodingUserList&pageIndex=${Page.pageIndex+1}">下一页</a>&nbsp;&nbsp;&nbsp;
    </c:if>
    <c:if test="${Page.pageIndex < Page.pagetotalpages && Page.pageIndex!=1}">
        <a  href="<%=path%>/UserServlet?act=LodingUserList&pageIndex=${Page.pageIndex-1}">上一页</a>&nbsp;&nbsp;&nbsp;
        <a href="<%=path%>/UserServlet?act=LodingUserList&pageIndex=${Page.pageIndex+1}">下一页</a>&nbsp;&nbsp;&nbsp;
    </c:if>
    <c:if test="${Page.pageIndex >= Page.pagetotalpages && Page.pageIndex>1}">

        <a  href="<%=path%>/UserServlet?act=LodingUserList&pageIndex=${Page.pageIndex-1}">上一页</a>&nbsp;&nbsp;&nbsp;
        <a  onclick="down();">下一页</a>&nbsp;&nbsp;&nbsp;
    </c:if>
         <a href="<%=path%>/UserServlet?act=LodingUserList&pageIndex=${Page.pagetotalpages}">尾页</a>&nbsp;&nbsp;&nbsp;
</div>


        </div>

    </section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该用户吗？</p>
            <button  id="yes" onclick="return Del(${u.userCode})">确定</button>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>

    <footer class="footer">
        版权归北大青鸟
    </footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>

</body>
</html>