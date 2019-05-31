<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--列表--%>
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">工作列表</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>任务标题</th>
                        <th>责任人</th>
                        <th>预计工时</th>
                        <th>进度</th>
                        <th>任务类别</th>
                        <th>任务起止</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${jobs}">
                        <tr class="gradeA">
                            <input type="hidden" name="jobId" value="${key.jobId}">
                            <td>
                                <button type="button" class="btn btn-link m-b-5" data-toggle="modal" data-target="#jobDetails" onclick="getJobDetails('${key.jobId}')">${key.jobTitle}</button>
                            </td>
                            <td>${key.jobLeaderName}</td>
                            <td>${key.jobAroundTime}天</td>
                            <td>
                                <c:forEach  var="item" items="${job_schedules}">
                                    <c:if test="${key.schedule == item.dictId}">
                                        ${item.dictTypeDetails}
                                    </c:if>
                                </c:forEach>
                            </td>
                            <td>
                                <c:forEach  var="item" items="${job_types}">
                                    <c:if test="${key.jobType == item.dictId}">
                                        ${item.dictTypeDetails}
                                    </c:if>
                                </c:forEach>
                            </td>

                            <td>
                                    ${key.jobStartTime}至${key.jobEndTime}
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- end panel -->
</div>

<%--任务详情--%>
<div class="modal fade" id="jobDetails" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">任务详情</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="details_form" action="${pageContext.request.contextPath }/job/download" method="post">
                    <input type="hidden" name="fileName" id="fileName">
                    <input type="hidden" name="fileType" id="fileType">
                    <input type="hidden" name="fileRealName" id="fileRealName">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">任务标题</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="任务标题" id="d_jobTitle">
                        </div>

                        <label class="col-sm-2 control-label">责任人</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="任务标题" id="d_jobLeader">
                        </div>

                        <label class="col-sm-2 control-label">任务等级</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="任务标题" id="d_jobGrade">
                        </div>
                    </div>

                    <div class="form-group">

                        <label  class="col-sm-2 control-label">类别</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="任务标题" id="d_jobType">
                        </div>

                        <label class="col-sm-2 control-label">关键字</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control"  placeholder="关键字" id="d_jobKeyWord">
                        </div>

                        <label style="float:left;padding:7px 15px 0 27px;"class="col-sm-2 control-label">进度</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="任务标题" id="d_schedule">
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">时间周期</label>
                        <div class="input-group input-daterange col-sm-6">
                            <input type="text" class="form-control" id="d_jobStartTime" placeholder="开始时间" />
                            <span class="input-group-addon">--</span>
                            <input type="text" class="form-control" id="d_jobEndTime" placeholder="结束时间" />
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">预估时间</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control"  placeholder="预估时间(天)" id="d_jobAroundTime">
                        </div>

                        <div class="col-sm-4">
                            <span>附件</span>
                            <input type="submit" id="d_jobFile" class="btn btn-link m-b-5">
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">参与者</label>
                        <div class="col-sm-10">
                            <div id="d_participant" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">内容</label>
                        <div class="col-sm-10">
                            <div id="d_jobContent"></div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>

<script type="text/javascript">
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

<script type="text/javascript">
    function getJobDetails(id) {
        $.ajax({
            type:"get",
            url:rootPath+"/job/details",
            data:{"jobId":id},
            success:function(data) {
                $("#fileRealName").val(data.jobFileRealName);
                $("#fileType").val(data.jobFileType);
                $("#fileName").val(data.jobFileNumberName);
                $("#d_jobLeader").val(data.jobLeaderName);
                $("#d_jobAroundTime").val(data.jobAroundTime);
                $("#d_jobEndTime").val(data.jobEndTime)
                $("#d_jobStartTime").val(data.jobStartTime)
                $("#d_jobFile").val(data.jobFileRealName)
                $("#d_jobGrade").val(data.jobGradeName);
                $("#d_jobTitle").val(data.jobTitle);
                $("#d_jobKeyWord").val(data.jobKeyWord);
                $("#d_schedule").val(data.scheduleName);
                $("#d_jobType").val(data.jobTypeName);
                var jobContent = document.getElementById("d_jobContent")
                jobContent.innerHTML = data.jobContent;
                var par = '';
                jQuery.each(data.staffs, function(i,item){
                    par += item.staffName +"("+item.departName +")"+";"
                });
                var participant = document.getElementById("d_participant")
                participant.innerHTML = par;
            }
        });
    }
</script>