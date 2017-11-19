
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>Blog</title>
    <link rel="shortcut icon" href="<%=path%>/../images/Logo_40.png" type="image/x-icon">
    <!-- layui.css -->
    <link href="<%=path%>/../plugin/layui/css/layui.css" rel="stylesheet" />
    <!-- front-awesome.css -->
    <link href="<%=path%>/../plugin/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
    <!-- animate.css -->
    <link href="<%=path%>/../css/animate.min.css" rel="stylesheet" />
    <!-- 本页样式 -->
    <link href="<%=path%>/../css/main.css" rel="stylesheet" />
    <link rel="stylesheet" href="<%=path%>/css/pintuer.css">
    <link rel="stylesheet" href="<%=path%>/css/admin.css">
    <script src="<%=path%>/js/jquery.js"></script>
    <script src="<%=path%>/js/pintuer.js"></script>
</head>
<body>
     <%
           String name= (String) session.getAttribute("name");
             if(name==null){
                response.sendRedirect(path+"/UserServlet");
             }
       %>
    <div class="layui-layout layui-layout-admin">
        <!--顶部-->
        <div class="layui-header">
            <div class="ht-console">
                <div class="ht-user">
                    <img src="../images/Logo_40.png" />
                    <a class="ht-user-name">管理员：<%=name%></a>
                </div>
            </div>
            <span class="sys-title">学生成绩管理系统</span>
            <ul class="ht-nav">
                <%--<li class="ht-nav-item">
                    <a target="_blank" href="javascript:;">前台入口</a>
                </li>--%>
                <li class="ht-nav-item">
                    <a href="javascript:;" id="individuation"><i class="fa fa-tasks fa-fw" style="padding-right:5px;"></i>个性化</a>
                </li>
                <li class="ht-nav-item">
                    <a href="<%=path%>/UserServlet?act=UnLogin"><i class="fa fa-power-off fa-fw"></i>注销</a>
                </li>
            </ul>
        </div>
        <!--侧边导航-->
        <div class="layui-side">
            <div class="layui-side-scroll">
                <ul class="layui-nav layui-nav-tree" lay-filter="leftnav">
                    <li class="layui-nav-item layui-this">
                        <a href="javascript:;"data-id="1"><i class="fa fa-home"></i>首页</a>
                    </li>

                    <li class="layui-nav-item">
                        <a href="javascript:;"><i class="fa fa-file-text"></i>班级管理</a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" data-url="<%=path%>/GradeServlet?act=GradeList" data-id="2">班级列表</a></dd>
                            <dd><a href="javascript:;" data-url="<%=path%>/html/gradestudent.jsp" data-id="3">班级学生</a></dd>
                            <%--<dd><a href="javascript:;" data-url="<%=path%>/html/bloglist" data-id="3">时光轴</a></dd>--%>
                               <%--<dd><a href="javascript:;">资源回收站</a></dd>--%>
                        </dl>
                    </li>

                   <%-- <li class="layui-nav-item">
                        <a href="javascript:;"><i class="fa fa-user"></i>学员管理</a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;" data-url="<%=path%>/html/datalist1.jsp" data-id="3">成绩录入</a></dd>
                            <dd><a href="javascript:;" data-url="<%=path%>/html/gradelist.jsp" data-id="3">成绩查询</a></dd>
                        </dl>
                    </li>--%>

                </ul>
            </div>
        </div>
        <!--收起导航-->
        <div class="layui-side-hide layui-bg-cyan">
            <i class="fa fa-long-arrow-left fa-fw"></i>收起导航
        </div>
        <!--主体内容-->
        <div class="layui-body">
            <div style="margin:0;position:absolute;top:4px;bottom:0px;width:100%;" class="layui-tab layui-tab-brief" lay-filter="tab" lay-allowclose="true">
                <ul class="layui-tab-title">
                    <li lay-id="0" class="layui-this">学生成绩</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <fieldset class="layui-elem-field layui-field-title">
                            <legend>学生成绩</legend>
                            <div class="padding border-bottom">
                                <form action="/StudentServlet?act=onConditionQuery" method="post">
                                <ul class="search" style="padding-left:10px;">
                                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                    <if condition="$iscid eq 1">
                                        <li>
                                            <select name="stucode" class="input" style="width:200px; line-height:17px;" onchange="changesearch()">
                                                <option value="0">请选择班级</option>
                                                <c:forEach items="${gradelist}" var="g">
                                                <option value="${g.gracode}">${g.graname}</option>
                                                </c:forEach>
                                            </select>
                                        </li>
                                    </if>
                                    <li>
                                        <input type="text" placeholder="请输入搜索关键字" name="stuname" class="input" style="width:250px; line-height:17px;display:inline-block" />
                                        <button class="button border-main icon-search" type="submit"> 搜索</button>
                                    </li>
                                        <button class="layui-btn layui-btn-normal" type="submit">报表导出</button>
                                </ul>
                                </form>
                            </div>
                            <div class="layui-field-box">
                                <div style="display: inline-block; width: 100%;">
                          <c:forEach items="${stulist}" var="s">

                                    <div class="ht-box layui-bg-red" onclick="up('${s.gradeInfo.graname}','${s.stuname}','${s.stuscore}','${s.stucode}')">
                                        <p></p>
                                       <p>班级：${s.gradeInfo.graname}</p>
                                        <p>姓名：${s.stuname}</p>
                                        <p>成绩：${s.stuscore}</p>
                                    </div>
                          </c:forEach>

                                </div>
                            </div>

                        </fieldset>
                    </div>
                </div>
            </div>
        </div>
        <!--底部信息-->
        <div class="layui-footer">
            <p style="line-height:44px;text-align:center;">学生成绩管理系统</p>
        </div>
        <!--快捷菜单-->
        <div class="short-menu" style="display:none">
            <fieldset class="layui-elem-field layui-field-title">
                <legend style="color:#fff;padding-top:10px;padding-bottom:10px;">快捷菜单</legend>
                <div class="layui-field-box">
                    <div style="width:832px;margin:0 auto;">
                        <div class="windows-tile windows-two">
                            <i class="fa fa-file-text"></i>
                            <span data-url="datalist.html" data-id="1">文章管理</span>
                        </div>
                        <div class="windows-tile windows-one">
                            <i class="fa fa-volume-up"></i>
                            <span data-url="datalist.html" data-id="2">网站公告</span>
                        </div>
                        <div class="windows-tile windows-one">
                            <i class="fa fa-comments-o"></i>
                            <span data-url="datalist.html" data-id="3">留言管理</span>
                        </div>
                        <div class="windows-tile windows-two">
                            <i class="fa fa-handshake-o"></i>
                            <span data-url="datalist.html" data-id="4">友情链接</span>
                        </div>
                        <div class="windows-tile windows-one">
                            <i class="fa fa-arrow-circle-right"></i>
                            <span data-url="datalist.html" data-id="5">更新日志</span>
                        </div>
                       <%-- <div class="windows-tile windows-one">
                            <i class="fa fa-wrench"></i>
                            <span data-url="datalist.html" data-id="6">操作日志</span>
                        </div>
                        <div class="windows-tile windows-one">
                            <i class="fa fa-tags"></i>
                            <span data-url="datalist.html" data-id="7">资源管理</span>
                        </div>
                        <div class="windows-tile windows-one">
                            <i class="fa fa-pencil-square-o"></i>
                            <span data-url="datalist.html" data-id="8">笔记管理</span>
                        </div>
                        <div class="windows-tile windows-two">
                            <i class="fa fa-hourglass-half"></i>
                            <span data-url="datalist.html" data-id="9">时光轴管理</span>
                        </div>--%>
                        <div style="clear:both;"></div>
                    </div>
                </div>
            </fieldset>

        </div>
        <!--个性化设置-->
        <div class="individuation animated flipOutY layui-hide">
            <ul>
                <li><i class="fa fa-cog" style="padding-right:5px"></i>个性化</li>
            </ul>
            <div class="explain">
                <small>从这里进行系统设置和主题预览</small>
            </div>
            <div class="setting-title">设置</div>
            <div class="setting-item layui-form">
                <span>侧边导航</span>
                <input type="checkbox" lay-skin="switch" lay-filter="sidenav" lay-text="ON|OFF" checked>
            </div>
            <div class="setting-item layui-form">
                <span>管家提醒</span>
                <input type="checkbox" lay-skin="switch" lay-filter="steward" lay-text="ON|OFF" checked>
            </div>
            <div class="setting-title">主题</div>
            <div class="setting-item skin skin-default" data-skin="skin-default">
                <span>低调优雅</span>
            </div>
            <div class="setting-item skin skin-deepblue" data-skin="skin-deepblue">
                <span>蓝色梦幻</span>
            </div>
            <div class="setting-item skin skin-pink" data-skin="skin-pink">
                <span>姹紫嫣红</span>
            </div>
            <div class="setting-item skin skin-green" data-skin="skin-green">
                <span>一碧千里</span>
            </div>
        </div>
    </div>
    <!-- layui.js -->
    <script src="../plugin/layui/layui.js"></script>
    <!-- layui规范化用法 -->
    <script type="text/javascript">
        layui.config({
            base: '../js/'
        }).use('main');
    </script>
     <script type="text/javascript" src="<%=path%>/plugin/jquery-1.8.3.js"></script>
     <script type="text/javascript">
     function up(code,name,score,stucode) {
     layer.ready(function(){
     layer.open({
     type: 2,
     title: '正在对'+name+'进行编辑中~~~',
     shadeClose: true,
     shade: false,
     maxmin: true, //开启最大化最小化按钮
     area: ['400px', '420px'],
     content:'<%=path%>/html/uplist.jsp?code='+code+'&name='+name+'&score='+score+'&stucode='+stucode
     });
     });

     }
     </script>
</body>
</html>