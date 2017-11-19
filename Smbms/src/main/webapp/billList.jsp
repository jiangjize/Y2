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
<script type="text/javascript" src="<%=path%>/js/jquery-1.11.1.js"></script>
<script type="text/javascript">
$(function () {

})
    function cha() {
    var a= $("#proname").val();
    var b=$("#fukuan").val();
    var c=$("#tigong").val();
    location.href="<%=path%>/BillServlet?act=ByTermSelectBill&n="+a+"&is="+b+"&pid="+c;

    }
</script>
<body>
<!--头部-->
    <header class="publicHeader">
        <h1>超市账单管理系统</h1>
        <div class="publicHeaderR">
            <p><span>下午好！</span><span style="color: #fff21b">  ${n}</span> , 欢迎你！</p>
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
                <span>账单管理页面</span>
            </div>
            <div class="search">
                <span>商品名称：</span>
                <input type="text" name="proname" id="proname" placeholder="请输入商品的名称"/>
                
                <span>供应商：</span>
                <select name="tigong" id="tigong">
                    <option value="0">--请选择--</option>
                    <c:forEach items="${plist}" var="p">
                    <option value="${p.id}">${p.proName}</option>
                    </c:forEach>
                </select>

                <span>是否付款：</span>
                <select name="fukuan" id="fukuan">
                    <option value="0">--请选择--</option>
                    <option value="2">已付款</option>
                    <option value="1">未付款</option>
                </select>

                <input type="button" onclick="return cha()" value="查询"/>

                <a href="billAdd.jsp">添加订单</a>
            </div>
            <!--账单表格 样式和供应商公用-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">账单编码</th>
                    <th width="20%">商品名称</th>
                    <th width="10%">供应商</th>
                    <th width="10%">账单金额</th>
                    <th width="10%">是否付款</th>
                    <th width="10%">创建时间</th>
                    <th width="30%">操作</th>
                </tr>
                <c:forEach var="b" items="${list}">
                <tr>
                        <td>${b.billCode}</td>
                        <td>${b.productName}</td>
                        <td>${b.pro.proName}</td>
                        <td>${b.totalPrice}</td>
                        <c:if test="${b.isPayment eq 1}">
                            <td align="center">未支付</td>
                        </c:if>
                        <c:if test="${b.isPayment eq 2}">
                            <td align="center">已支付</td>
                        </c:if>
                        <td>${b.creationDate}</td>
                    <td>
                        <a href="billView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="billUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="#" class="removeBill"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <div style="padding-left: 350px;" >
                当前页数:[${Page.pageIndex} / ${Page.pagetotalpages}
                ]&nbsp;&nbsp;&nbsp;
                <a href="<%=path%>/BillServlet?act=getBillInfo&pageIndex=1">首页</a>&nbsp;&nbsp;&nbsp;
                <c:if test="${Page.pagetotalpages==1}">
                    <li><a onclick="up();">上一页</a>&nbsp;&nbsp;&nbsp;</li>
                    <li><a onclick="down();">下一页</a>&nbsp;&nbsp;&nbsp;</li>
                </c:if>
                <c:if test="${Page.pageIndex < Page.pagetotalpages && Page.pageIndex==1}">
                    <a onclick="up();">上一页</a>&nbsp;&nbsp;&nbsp;
                    <a href="<%=path%>/BillServlet?act=getBillInfo&pageIndex=${Page.pageIndex+1}">下一页</a>&nbsp;&nbsp;&nbsp;
                </c:if>
                <c:if test="${Page.pageIndex < Page.pagetotalpages && Page.pageIndex!=1}">
                    <a  href="<%=path%>/BillServlet?act=getBillInfo&pageIndex=${Page.pageIndex-1}">上一页</a>&nbsp;&nbsp;&nbsp;
                    <a href="<%=path%>/BillServlet?act=getBillInfo&pageIndex=${Page.pageIndex+1}">下一页</a>&nbsp;&nbsp;&nbsp;
                </c:if>
                <c:if test="${Page.pageIndex >= Page.pagetotalpages && Page.pageIndex>1}">

                    <a  href="<%=path%>/BillServlet?act=getBillInfo&pageIndex=${Page.pageIndex-1}">上一页</a>&nbsp;&nbsp;&nbsp;
                    <a  onclick="down();">下一页</a>&nbsp;&nbsp;&nbsp;
                </c:if>
                <a href="<%=path%>/BillServlet?act=getBillInfo&pageIndex=${Page.pagetotalpages}">尾页</a>&nbsp;&nbsp;&nbsp;
            </div>
        </div>
    </section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeBi">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该订单吗？</p>
            <a href="#" id="yes">确定</a>
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