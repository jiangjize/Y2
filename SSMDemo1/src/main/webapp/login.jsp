<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/10/25
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
</head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/component.css" />
<script src="js/html5.js"></script>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>权限管理登陆界面</h3>
                <form action="/a" name="f" method="post">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input name="logname" class="text" value="jiangjize" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="123" type="password" placeholder="请输入密码">
                    </div>
                    <div class="mb2">
                        <a class="act-but submit" href="/a" style="color: #FFFFFF">登录</a>
                            <%--<input value="登陆" type="submit" style="color: #FFFFFF;" class="act-but2 submit" >--%>
                    </div>

                <%--<div class="mb2"><a class="act-but submit" href="/a" style="color: #FFFFFF">登录</a></div>--%>
                </form>
            </div>
        </div>
    </div>
</div><!-- /container -->
<script src="js/TweenLite.min.js"></script>
<script src="js/EasePack.min.js"></script>
<script src="js/rAF.js"></script>
<script src="js/demo-1.js"></script>
<div style="text-align:center;">
</div>
</body>
</html>
