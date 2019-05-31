<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html lang="en" class="app">
<head>
    <%@include file="/common/common.jspf" %>
</head>
<body class="" style="overflow:auto">
<!-- begin #page-container -->
    <div id="page-container" class="fade page-sidebar-fixed page-header-fixed">

        <!-- begin #header -->
        <div id="header" class="header navbar navbar-default navbar-fixed-top">
            <!-- begin container-fluid -->
            <div class="container-fluid">

            </div>
            <!-- end container-fluid -->

            <!-- begin mobile sidebar expand / collapse button -->
            <div class="navbar-header">
                <a href="index.html" class="navbar-brand"><span class="navbar-logo"></span> OA System</a>
                <button type="button" class="navbar-toggle" data-click="sidebar-toggled">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <!-- end mobile sidebar expand / collapse button -->



            <!-- begin header navigation right -->
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <form class="navbar-form full-width">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Enter keyword" />
                            <button type="submit" class="btn btn-search"><i class="fa fa-search"></i></button>
                        </div>
                    </form>
                </li>
                <li class="dropdown">
                    <a href="javascript:;" data-toggle="dropdown" class="dropdown-toggle f-s-14">
                        <i class="fa fa-bell-o"></i>
                        <span class="label">5</span>
                    </a>
                    <ul class="dropdown-menu media-list pull-right animated fadeInDown">
                        <li class="dropdown-header">Notifications (5)</li>
                        <li class="media">
                            <a href="javascript:;">
                                <div class="media-left"><i class="fa fa-bug media-object bg-red"></i></div>
                                <div class="media-body">
                                    <h6 class="media-heading">Server Error Reports</h6>
                                    <div class="text-muted f-s-11">3 minutes ago</div>
                                </div>
                            </a>
                        </li>
                        <li class="media">
                            <a href="javascript:;">
                                <div class="media-left"><img src="${ctx}/assets/img/user-1.jpg" class="media-object" alt="" /></div>
                                <div class="media-body">
                                    <h6 class="media-heading">John Smith</h6>
                                    <p>Quisque pulvinar tellus sit amet sem scelerisque tincidunt.</p>
                                    <div class="text-muted f-s-11">25 minutes ago</div>
                                </div>
                            </a>
                        </li>
                        <li class="media">
                            <a href="javascript:;">
                                <div class="media-left"><img src="${ctx}/assets/img/user-2.jpg" class="media-object" alt="" /></div>
                                <div class="media-body">
                                    <h6 class="media-heading">Olivia</h6>
                                    <p>Quisque pulvinar tellus sit amet sem scelerisque tincidunt.</p>
                                    <div class="text-muted f-s-11">35 minutes ago</div>
                                </div>
                            </a>
                        </li>
                        <li class="media">
                            <a href="javascript:;">
                                <div class="media-left"><i class="fa fa-plus media-object bg-green"></i></div>
                                <div class="media-body">
                                    <h6 class="media-heading"> New User Registered</h6>
                                    <div class="text-muted f-s-11">1 hour ago</div>
                                </div>
                            </a>
                        </li>
                        <li class="media">
                            <a href="javascript:;">
                                <div class="media-left"><i class="fa fa-envelope media-object bg-blue"></i></div>
                                <div class="media-body">
                                    <h6 class="media-heading"> New Email From John</h6>
                                    <div class="text-muted f-s-11">2 hour ago</div>
                                </div>
                            </a>
                        </li>
                        <li class="dropdown-footer text-center">
                            <a href="javascript:;">View more</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown navbar-user">
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="${ctx}/assets/img/user-13.jpg" alt="" />
                        <span class="hidden-xs">${staff.staffName}</span> <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu animated fadeInLeft">
                        <li class="arrow"></li>
                        <li><a href="javascript:;">设置</a></li>
                        <li><a href="javascript:;"><span class="badge badge-danger pull-right">2</span> 消息</a></li>
                        <li><a href="javascript:;">日历</a></li>
                        <li><a href="javascript:;">设置</a></li>
                        <li class="divider"></li>
                        <li><a href="${ctx}/staff/logout">退出</a></li>
                    </ul>
                </li>
            </ul>
            <!-- end header navigation right -->

        </div>
        <!-- end #header -->


        <!-- begin #sidebar -->
        <div id="sidebar" class="sidebar">
            <!-- begin sidebar scrollbar -->
            <div data-scrollbar="true" data-height="100%">
                <!-- begin sidebar user -->
                <ul class="nav">
                    <li class="nav-profile">
                        <div class="image">
                            <a href="javascript:;" data-toggle="modal" data-target="#staffEditDialog"><img src="${ctx}/assets/img/user-13.jpg" alt="" /></a>
                        </div>
                        <div class="info">
                           ${staff.staffName}
                            <small>${staff.departName}</small>
                        </div>
                    </li>
                </ul>
                <!-- end sidebar user -->


                <!-- begin sidebar nav -->
                <ul class="nav">
                    <li class="nav-header">Navigation</li>

                    <c:forEach var="key" items="${menus}" varStatus="s">
                    <li class="has-sub">
                        <%--图标部分--%>
                        <a href="javascript:;">
                            <b class="caret pull-right"></b>
                            <i class="${key.icon}"></i>
                            <span>${key.name}</span>
                        </a>
                        <%--/图标部分--%>

                        <%--子标题--%>
                        <ul class="sub-menu">
                            <c:forEach var="kc" items="${key.subs}">
                                <li>
                                    <%--<a href="index.html">Dashboard v1</a>--%>
                                    <a href="javascript:void(0)" class="active"
                                       nav-n="${key.name},${kc.name},${kc.resurl}">
                                        <span>${kc.name}</span>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                        <%--/子标题--%>
                    </li>
                    <!-- begin sidebar minify button -->
                    </c:forEach>


                    <li><a href="javascript:;" class="sidebar-minify-btn" data-click="sidebar-minify"><i class="fa fa-angle-double-left"></i></a></li>
                    <!-- end sidebar minify button -->
                </ul>
                <!-- end sidebar nav -->
            </div>
            <!-- end sidebar scrollbar -->
        </div>
        <!-- end #sidebar -->

        <!-- begin #content -->
        <div id="content" class="content">

            <!-- begin breadcrumb -->
            <ol class="breadcrumb pull-right" id="topli">
            </ol>
            <!-- end breadcrumb -->

            <!-- begin page-header -->
            <%--<h1 class="page-header">Dashboard v2 <small>header small text goes here...</small></h1>--%>
            <!-- end page-header -->

            <!-- begin row -->
            <div class="row">
                <div id="loadhtml"></div>
            </div>
            <!-- end row -->

        </div>
        <!-- end #content -->


        <!-- begin scroll to top btn -->
        <a href="javascript:;" class="btn btn-icon btn-circle btn-success btn-scroll-to-top fade" data-click="scroll-top"><i class="fa fa-angle-up"></i></a>
        <!-- end scroll to top btn -->

    </div>

<!-- 人员编辑对话框 -->
<div class="modal fade" id="staffEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改员工信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_staff_form">
                    <input type="hidden" id="staffId" name="staffId" value="${staff.staffId}"/>
                    <div class="form-group">
                        <label for="staffName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" id="staffName" placeholder="名称" name="staffName" value="${staff.staffName}">
                        </div>

                        <label for="staffAccNum" class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" id="staffAccNum" placeholder="编号" name="staffAccNum" value="${staff.staffAccNum}" readonly="readonly">
                        </div>

                        <label for="staffGrade" class="col-sm-2 control-label">等级</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffGrade" placeholder="等级" name="staffGrade" readonly="readonly">
                                <option value="">--请选择--</option>
                                <c:forEach items="${types}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == staff.staffGrade}"> selected</c:if>>${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="staffGender" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffGender" placeholder="性别" name="staffGender" >
                                <option value="">--请选择--</option>
                                <c:forEach items="${gender}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == staff.staffGender}"> selected</c:if>>${item.dictTypeDetails}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label for="staffStatus" style="float:left;padding:7px 15px 0 27px;"class="col-sm-2 control-label">状态</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffStatus" placeholder="状态" name="staffStatus" readonly="readonly">
                                <option value="">--请选择--</option>
                                <c:forEach items="${status}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == staff.staffStatus}"> selected</c:if>>${item.dictTypeDetails}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <label for="staffPosi" class="col-sm-2 control-label">职位</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffPosi" placeholder="职位" name="staffPosi" readonly="readonly">
                                <option value="">--请选择--</option>
                                <c:forEach items="${positions}" var="item">
                                    <option value="${item.posiId}"<c:if test="${item.posiId == staff.staffPosi}"> selected</c:if>>${item.posiName }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="staffAge" class="col-sm-2 control-label">年龄</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control" id="staffAge" placeholder="年龄" name="staffAge" value="${staff.staffAge}">
                        </div>
                        <label for="staffSal" class="col-sm-2 control-label">工资</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control" id="staffSal" placeholder="工资" name="staffSal" value="${staff.staffSal}" readonly>
                        </div>
                        <label for="staffDepart"  class="col-sm-2 control-label">部门</label>

                        <div class="col-sm-2">
                            <select	class="form-control" id="staffDepart" placeholder="部门" name="staffDepart" readonly="readonly">
                                <option value="">--请选择--</option>
                                <c:forEach items="${depart}" var="item">
                                    <option value="${item.departId}"<c:if test="${item.departId == staff.staffDepart}"> selected</c:if>>${item.departName }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="staffBirthday" class="col-sm-2 control-label">出生日期</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" id="staffBirthday"  name="staffBirthday" value="${staff.staffBirthday}"/>
                        </div>

                        <label for="staffAddress" class="col-sm-2 control-label">地址</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="staffAddress" placeholder="地址" name="staffAddress" value="${staff.staffAddress}">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="staffHiredate" class="col-sm-2 control-label">入职时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" id="staffHiredate" placeholder="入职时间" name="staffHiredate" value="${staff.staffHiredate}">
                        </div>

                        <label for="staffLeavedate" class="col-sm-2 control-label">离职时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" id="staffLeavedate" placeholder="离职时间" name="staffLeavedate" value="${staff.staffLeavedate}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="staffTel" class="col-sm-2 control-label">电话号码</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="staffTel" placeholder="电话号码" name="staffTel" value="${staff.staffTel}">
                        </div>

                        <label for="stmail" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="stmail" placeholder="邮箱" name="stmail" value="${staff.stmail}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">其他</label>
                        <div class="col-sm-10">
                            ${staff.staffOther}
                            <%--<textarea id="editor_edit" style="width: 100%;height: 150px" name="staffOther"></textarea>--%>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="updateStaff()" >保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<%@include file="/common/commonEnd.jspf"%>
    <script type="text/javascript">
        var rootPath = "${ctx}";
        $(function () {

            var tb = $("#loadhtml");
            tb.load("${ctx}/staff/welcome")

            /*加载内容页返回栏部分*/
            $("[nav-n]").each(function () {
                $(this).bind("click", function () {
                    var nav = $(this).attr("nav-n");
                    var sn = nav.split(",");
                    var html = '<li><i class="fa fa-home"></i>';
                    html += '<a href="index.shtml">Home</a></li>';
                    for (var i = 0; i < 2; i++) {
                        html += '<li><a href="javascript:void(0)">' + sn[i] + '</a></li>';
                    }
                    $("#topli").html(html);
                    var tb = $("#loadhtml");
                    tb.load(rootPath + sn[2])
                });
            });
        });
    </script>
    <script>
        function updateStaff() {
            $.post(rootPath+"/staff/updatePri",$("#edit_staff_form").serialize(),function(data){
                if(data == "1"){
                    alert("员工信息更新成功！");
                }else{
                    alert("员工更新失败！");
                }
            });

        }
    </script>
</body>
</html>