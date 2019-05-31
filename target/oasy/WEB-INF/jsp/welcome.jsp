<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="col-md-12">
    <!-- begin #content -->
    <div id="content" class="content" style="margin-left: -40px;">
        <!-- begin breadcrumb -->
        <ol class="breadcrumb pull-right">
            <li><a href="javascript:;">首页</a></li>
        </ol>
        <!-- end breadcrumb -->
        <!-- begin page-header -->
        <h1 class="page-header">OA System
            <small>header small text goes here...</small>
        </h1>
        <!-- end page-header -->


        <!-- begin row -->
        <div class="row ">
            <!-- begin col-8 -->
            <div class="col-md-8">

                <ul class="nav nav-tabs nav-tabs-inverse nav-justified nav-justified-mobile" data-sortable-id="index-2">
                    <li class="active"><a href="index.html#latest-post" data-toggle="tab"><i
                            class="fa fa-envelope m-r-5"></i> <span class="hidden-xs">消息提醒</span></a></li>
                    <li class=""><a href="index.html#purchase" data-toggle="tab"><i
                            class="fa fa-tasks m-r-5"></i> <span class="hidden-xs">我的流程</span></a></li>
                    <li class=""><a href="index.html#email" data-toggle="tab"><i class="fa fa-group m-r-5"></i> <span
                            class="hidden-xs">我的会议</span></a></li>
                </ul>
                <div class="tab-content" data-sortable-id="index-3">
                    <div class="tab-pane fade active in" id="latest-post">
                        <div class="height-sm" data-scrollbar="true">
                            <ul class="media-list media-list-with-divider">
                                <c:forEach items="${notice}" var="item">
                                <li class="media media-lg">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <form action="${pageContext.request.contextPath }/nan/download" method="post">
                                                <input type="hidden" name="fileName" value="${item.nFileNumName}">
                                                <input type="hidden" name="fileType" id="${item.nTypeName}">
                                                <input type="hidden" name="fileRealName" id="${item.nFileRealName}">
                                                附件:<input type="submit" value="${item.nFileRealName}" class="btn btn-link m-b-5">
                                            </form>
                                        </div>
                                        <div class="col-md-10">
                                            <div class="media-body">
                                                <h4 class="media-heading">
                                                    <p>标题：${item.nTitle}&ensp;
                                                        <small>发布时间：${item.nSendTime}</small>
                                                    </p>
                                                </h4>
                                                <div style="max-height: 100px;overflow: hidden">
                                                        ${item.nSendContent}
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="purchase">
                        <div class="height-sm" data-scrollbar="true">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>主题</th>
                                    <th>申请时间</th>
                                    <th>流水号</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="key" items="${approval}" varStatus="status">
                                    <tr>
                                        <td class="email-select">${status.index+1}</td>
                                        <td class="email-subject">
                                            <a href="#" class="btn-link m-b-5" onclick="getNanDetails('${key.enId}')">${key.enName}-${key.enDate}</a>
                                        </td>
                                        <td class="email-sender">${key.enDate}</td>
                                        <td class="email-date">${key.enNum}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="email">
                        <div class="height-sm" data-scrollbar="true">
                            <ul class="media-list media-list-with-divider">
                                <c:forEach items="${con}" var="key">
                                    <li class="media media-sm">
                                        <div class="media-body">
                                            <a href="#" class="btn-link m-b-5" data-toggle="modal" data-target="#conferenceDetailDialog" onclick="getConDetails('${key.conId}')">
                                                <h4 class="media-heading">${key.conTheme}</h4>
                                            </a>
                                            <p class="m-b-5">

                                            </p>
                                            <i class="text-muted">${key.conStartDate}</i>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- end col-8 -->
            <!-- begin col-4 -->
            <div class="col-md-4">

                <div class="panel panel-inverse" data-sortable-id="index-10">
                    <div class="panel-heading">
                        <div class="panel-heading-btn">
                            <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-default"
                               data-click="panel-expand"><i class="fa fa-expand"></i></a>
                            <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-success"
                               data-click="panel-reload"><i class="fa fa-repeat"></i></a>
                            <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-warning"
                               data-click="panel-collapse"><i class="fa fa-minus"></i></a>
                            <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-danger"
                               data-click="panel-remove"><i class="fa fa-times"></i></a>
                        </div>
                        <h4 class="panel-title">Calendar</h4>
                    </div>
                    <div class="panel-body">
                        <div id="datepicker-inline" class="datepicker-full-width" style="height: 300px">
                            <div></div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- end col-4 -->
        </div>
        <!-- end row -->
        <div class="row">
            <div class="col-md-12" style="">
                <div style="PADDING-RIGHT: 0px; PADDING-LEFT: 0px; PADDING-BOTTOM: 0px; PADDING-TOP: 0px; WIDTH: 100%; border: 1px solid #cacaca; background: #FFFFFF">
                    <div style="WIDTH: 100%; clear: both; height: 31px; background-image: url(http://www.tianqi.com/static/images/code/bg_13.jpg); background-repeat: repeat-x; border-bottom: 1px solid #cacaca;">
                        <div style="float: left; height: 31px; color: #9e0905; font-weight: bold; line-height: 31px; margin-left: 20px; font-size: 14px;">
                            城市天气预报
                        </div>

                    </div>
                    <iframe width="400" scrolling="no" height="120" frameborder="0"
                            allowtransparency="true"
                            src="http://i.tianqi.com/index.php?c=code&id=19&bgc=%23FFFFFF&bdc=%23&icon=1&temp=1&num=2"></iframe>
                </div>
            </div>
        </div>

    </div>
    <!-- end #content -->
</div>
<!-- 会议详情框 -->
<div class="modal fade" id="conferenceDetailDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">会议详情</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="details_conference_form" enctype="multipart/form-data">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">会议主题</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="会议主题" id="conTheme">
                        </div>


                        <label class="col-sm-2 control-label">主持人</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="主持人" id="conCompere">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">主办部门</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="主办部门" id="conSponsorDapart">
                        </div>

                        <label class="col-sm-2 control-label">联系人</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="联系人" id="conLinkman">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">会议室</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="会议室" id="conPlaceId">
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">会议时间</label>
                        <div class="col-sm-4">
                            <input type="text" id="conStartDateAndTime">
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">参会人员</label>
                        <div class="col-sm-10">
                            <textarea id="menbers" class="form-control"></textarea>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">资源准备</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" id="conResource"></textarea>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">会议纪要</label>
                        <div class="col-sm-10">
                            <div id="conRecord"></div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">模式</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="模式" id="conModel">
                        </div>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(document).ready(function () {
        handleDraggablePanel();
        handleLocalStorage();
        handleResetLocalStorage();
        handleSlimScroll();
        handleMobileSidebarToggle();
        handleSidebarMinify();
        handleThemePageStructureControl();
        handleThemePanelExpand();
        handleAfterPageLoadAddClass();
        handlePanelAction();
        handleScrollToTopButton();
        handlePageContentView()
        Dashboard.init();
    });
</script>

<script type="text/javascript">
        function getNanDetails(id) {
            var tb = $("#loadhtml");
            tb.load(rootPath + "/approval/myDeatils/?enId="+id)
        }

        function getConDetails(id){
            $.post(rootPath+"/conference/details",{conId:id},function (data) {
                $("#conTheme").val(data.conTheme)
                <c:forEach items="${contypes}" var="item">
                if ('${item.dictId}'==data.conType){
                    $("#conType").val('${item.dictTypeDetails}')
                }
                </c:forEach>
                $("#conCompere").val(data.conCompereName)
                $("#conSponsorDapart").val(data.conSponsorDapartName)
                $("#conLinkman").val(data.conLinkmanName)
                $("#conPlaceId").val(data.conPlaceName)

                $("#conStartDate").val(data.conStartDate)
                $("#conResource").val(data.conResource)
                $("#conStartDateAndTime").val(data.conStartDate)
                switch(data.conModel)
                {
                    case 1:
                        $("#conModel").val("日常会议")
                        break;
                    case 2:
                        $("#conModel").val("周例会")
                        break;
                    case 3:
                        $("#conModel").val("月例会")
                        break;
                    default:
                        $("#conModel").val("其他")
                }
                var members = ""
                jQuery.each(data.needReachedStaffs, function(i,item){
                    members +=  item.staffName + "(" +item.staffTel + ")" + ";"
                });
                $("#menbers").val(members);

                var participant = document.getElementById("conRecord")
                if(data.conRecord != null){
                    participant.innerHTML = data.conRecord;
                }


            })
        }
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


