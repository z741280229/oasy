<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <meta charset="utf-8"/>
    <title>登录 </title>
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport"/>
    <meta content="" name="description"/>
    <meta content="" name="author"/>

    <!-- ================== BEGIN BASE CSS STYLE ================== -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
    <link href="<%=basePath%>assets/plugins/jquery-ui/themes/base/minified/jquery-ui.min.css" rel="stylesheet"/>
    <link href="<%=basePath%>assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="<%=basePath%>assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet"/>
    <link href="<%=basePath%>assets/css/animate.min.css" rel="stylesheet"/>
    <link href="<%=basePath%>assets/css/style.min.css" rel="stylesheet"/>
    <link href="<%=basePath%>assets/css/style-responsive.min.css" rel="stylesheet"/>
    <link href="<%=basePath%>assets/css/theme/default.css" rel="stylesheet" id="theme"/>
    <!-- ================== END BASE CSS STYLE ================== -->
</head>
<body>
<!-- begin #page-loader -->
<div id="page-loader" class="fade in"><span class="spinner"></span></div>
<!-- end #page-loader -->

<div class="login-cover">
    <div class="login-cover-image"><img src="<%=basePath%>assets/img/login-bg/bg-1.jpg" data-id="login-cover-image" alt=""/></div>
    <div class="login-cover-bg"></div>
</div>
<!-- begin #page-container -->
<div id="page-container" class="fade">
    <!-- begin login -->
    <div class="login login-v2" data-pageload-addclass="animated flipInX">
        <!-- begin brand -->
        <div class="login-header">
            <div class="brand">
                <span class="logo"></span> OA system
                <%--<small>responsive bootstrap 3 admin template</small>--%>
            </div>
            <div class="icon">
                <i class="fa fa-sign-in"></i>
            </div>
        </div>
        <!-- end brand -->
        <div class="login-content">
            <%--<form action="${pageContext.request.contextPath }/staff/login" method="POST" class="margin-bottom-0">--%>
                <div class="form-group m-b-20">
                    <input type="text" class="form-control input-lg" placeholder="工号" name="staffAccNum" id="staffAccNum"/>
                </div>
                <div class="form-group m-b-20">
                    <input type="password" class="form-control input-lg" placeholder="密码" name="staffPass" id="staffPass"/>
                </div>
                <div class="checkbox m-b-20">
                    <label>
                        <input type="checkbox"/> 记住我
                    </label>
                </div>
                <div class="login-buttons">
                    <button type="submit" class="btn btn-success btn-block btn-lg" id="login_btn">登录</button>
                </div>
            <%--</form>--%>
        </div>
    </div>
    <!-- end login -->

    <%--<ul class="login-bg-list">
        <li class="active"><a href="<%=basePath%>jsp/login.jsp#" data-click="change-bg">
            <img src="<%=basePath%>assets/img/login-bg/bg-2.jpg" alt=""/></a>
        </li>
        <li><a href="<%=basePath%>login.jsp" data-click="change-bg"><img src="<%=basePath%>assets/img/login-bg/bg-2.jpg" alt=""/></a></li>
        <li><a href="<%=basePath%>login.jsp" data-click="change-bg"><img src="<%=basePath%>assets/img/login-bg/bg-3.jpg" alt=""/></a></li>
        <li><a href="<%=basePath%>login.jsp" data-click="change-bg"><img src="<%=basePath%>assets/img/login-bg/bg-4.jpg" alt=""/></a></li>
        <li><a href="<%=basePath%>login.jsp" data-click="change-bg"><img src="<%=basePath%>assets/img/login-bg/bg-5.jpg" alt=""/></a></li>
        <li><a href="<%=basePath%>login.jsp" data-click="change-bg"><img src="<%=basePath%>assets/img/login-bg/bg-6.jpg" alt=""/></a></li>
    </ul>--%>

    <!-- begin theme-panel -->
    <div class="theme-panel">
        <a href="javascript:;" data-click="theme-panel-expand" class="theme-collapse-btn"><i class="fa fa-cog"></i></a>
        <div class="theme-panel-content">
            <h5 class="m-t-0">Color Theme</h5>
            <ul class="theme-list clearfix">
                <li class="active"><a href="javascript:;" class="bg-green" data-theme="default"
                                      data-click="theme-selector" data-toggle="tooltip" data-trigger="hover"
                                      data-container="body" data-title="Default">&nbsp;</a></li>
                <li><a href="javascript:;" class="bg-red" data-theme="red" data-click="theme-selector"
                       data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Red">&nbsp;</a></li>
                <li><a href="javascript:;" class="bg-blue" data-theme="blue" data-click="theme-selector"
                       data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Blue">&nbsp;</a>
                </li>
                <li><a href="javascript:;" class="bg-purple" data-theme="purple" data-click="theme-selector"
                       data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Purple">&nbsp;</a>
                </li>
                <li><a href="javascript:;" class="bg-orange" data-theme="orange" data-click="theme-selector"
                       data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Orange">&nbsp;</a>
                </li>
                <li><a href="javascript:;" class="bg-black" data-theme="black" data-click="theme-selector"
                       data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Black">&nbsp;</a>
                </li>
            </ul>
            <div class="divider"></div>
            <div class="row m-t-10">
                <div class="col-md-5 control-label double-line">Header Styling</div>
                <div class="col-md-7">
                    <select name="header-styling" class="form-control input-sm">
                        <option value="1">default</option>
                        <option value="2">inverse</option>
                    </select>
                </div>
            </div>
            <div class="row m-t-10">
                <div class="col-md-5 control-label">Header</div>
                <div class="col-md-7">
                    <select name="header-fixed" class="form-control input-sm">
                        <option value="1">fixed</option>
                        <option value="2">default</option>
                    </select>
                </div>
            </div>
            <div class="row m-t-10">
                <div class="col-md-5 control-label double-line">Sidebar Styling</div>
                <div class="col-md-7">
                    <select name="sidebar-styling" class="form-control input-sm">
                        <option value="1">default</option>
                        <option value="2">grid</option>
                    </select>
                </div>
            </div>
            <div class="row m-t-10">
                <div class="col-md-5 control-label">Sidebar</div>
                <div class="col-md-7">
                    <select name="sidebar-fixed" class="form-control input-sm">
                        <option value="1">fixed</option>
                        <option value="2">default</option>
                    </select>
                </div>
            </div>
            <div class="row m-t-10">
                <div class="col-md-5 control-label double-line">Sidebar Gradient</div>
                <div class="col-md-7">
                    <select name="content-gradient" class="form-control input-sm">
                        <option value="1">disabled</option>
                        <option value="2">enabled</option>
                    </select>
                </div>
            </div>
            <div class="row m-t-10">
                <div class="col-md-5 control-label double-line">Content Styling</div>
                <div class="col-md-7">
                    <select name="content-styling" class="form-control input-sm">
                        <option value="1">default</option>
                        <option value="2">black</option>
                    </select>
                </div>
            </div>
            <div class="row m-t-10">
                <div class="col-md-12">
                    <a href="<%=basePath%>jsp/login.jsp#" class="btn btn-inverse btn-block btn-sm"
                       data-click="reset-local-storage"><i class="fa fa-refresh m-r-3"></i> Reset Local Storage</a>
                </div>
            </div>
        </div>
    </div>
    <!-- end theme-panel -->
</div>
<!-- end page container -->

<!-- ================== BEGIN BASE JS ================== -->
<script src="<%=basePath%>assets/plugins/jquery/jquery-1.9.1.min.js"></script>
<script src="<%=basePath%>assets/plugins/jquery/jquery-migrate-1.1.0.min.js"></script>
<script src="<%=basePath%>assets/plugins/jquery-ui/ui/minified/jquery-ui.min.js"></script>
<script src="<%=basePath%>assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
<script src="<%=basePath%>assets/crossbrowserjs/html5shiv.js"></script>
<script src="<%=basePath%>assets/crossbrowserjs/respond.min.js"></script>
<script src="<%=basePath%>assets/crossbrowserjs/excanvas.min.js"></script>
<![endif]-->
<script src="<%=basePath%>assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="<%=basePath%>assets/plugins/jquery-cookie/jquery.cookie.js"></script>
<!-- ================== END BASE JS ================== -->

<!-- ================== BEGIN PAGE LEVEL JS ================== -->
<script src="<%=basePath%>assets/js/login-v2.demo.min.js"></script>
<script src="<%=basePath%>assets/js/apps.min.js"></script>
<!-- ================== END PAGE LEVEL JS ================== -->

<script>
    $(document).ready(function () {
        App.init();
        LoginV2.init();
    });
</script>
<script>
    (function (i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r;
        i[r] = i[r] || function () {
            (i[r].q = i[r].q || []).push(arguments)
        }, i[r].l = 1 * new Date();
        a = s.createElement(o),
            m = s.getElementsByTagName(o)[0];
        a.async = 1;
        a.src = g;
        m.parentNode.insertBefore(a, m)
    })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

    ga('create', 'UA-53034621-1', 'auto');
    ga('send', 'pageview');
</script>

<script>
    $(function () {
        //用户点击按钮
        $("#login_btn").click(function () {
            //获取用户名
            var username = $('#staffAccNum').val();
            //获取密码
            var userpass = $('#staffPass').val();
            if (username == "" || userpass == "") {
                alert("用户名密码不能为空！")
            }else{
                $.ajax({
                    type:"post",
                    url:"<%=basePath%>staff/login",
                    data:{"sNum":username,"sPass":userpass},
                    success:function(data) {
                        if(data== "0"){
                            alert("账号或密码不正确");
                            window.location.reload();
                        }else{
                            window.location.href = "<%=basePath%>staff/index";
                        }
                    }
                });
            }
        })

        $("body").keydown(function(event) {
            if (event.keyCode == "13") {//keyCode=13是回车键
                $("#login_btn").click();
            }
        });
    });
</script>
</body>
</html>
