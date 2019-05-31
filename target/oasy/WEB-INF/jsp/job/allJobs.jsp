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
        <div class="panel-body" >
            <div class="table-responsive" id="jobList">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#jobAddDialog">新建</button>
                <%--<button type="button" class="btn btn-primary m-r-5 m-b-5" data-toggle="modal" >我参与的</button>--%>
                <button type="button" class="btn btn-primary m-r-5 m-b-5" data-toggle="modal" onclick="getMyReJob()">我负责的</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>任务标题</th>
                        <th>责任人</th>
                        <th>预计工时</th>
                        <th>进度</th>
                        <th>任务类别</th>
                        <th>任务起止</th>
                        <th>操作</th>
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
                            <td>
                                <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#staffEditDialog" onclick="editstaff('${key.jobId}')">修改</a>
                                <a href="#" class="btn btn-danger btn-xs" onclick="deleteStaff('${key.jobId}')">删除</a>
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

<!-- 任务添加对话框 -->
<div class="modal fade" id="jobAddDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">新建任务</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_job_form" enctype="multipart/form-data">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">任务标题</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="任务标题" name="jobTitle">
                        </div>

                        <label class="col-sm-2 control-label">责任人</label>
                        <div class="col-sm-2">
                            <select	class="form-control" placeholder="负责人" name="jobLeader">
                                <option value="">--请选择--</option>
                                <c:forEach items="${allStaffInfo}" var="item">
                                    <option value="${item.staffId}">${item.staffName }</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">任务等级</label>
                        <div class="col-sm-2">
                            <select	class="form-control" placeholder="任务等级" name="jobGrade">
                                <option value="">--请选择--</option>
                                <c:forEach items="${job_grades}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">

                        <label  class="col-sm-2 control-label">类别</label>
                        <div class="col-sm-2">
                            <select	class="form-control"  placeholder="类别" name="jobType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${job_types}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">关键字</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control"  placeholder="关键字" name="jobKeyWord">
                        </div>

                        <label style="float:left;padding:7px 15px 0 27px;"class="col-sm-2 control-label">进度</label>
                        <div class="col-sm-2">
                            <select	class="form-control" placeholder="进度" name="schedule">
                                <option value="">--请选择--</option>
                                <c:forEach items="${job_schedules}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">时间周期</label>
                            <div class="input-group input-daterange col-sm-6">
                                <input type="text" class="form-control" name="jobStartTime" placeholder="开始时间" />
                                <span class="input-group-addon">--</span>
                                <input type="text" class="form-control" name="jobEndTime" placeholder="结束时间" />
                            </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">预估时间</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control"  placeholder="预估时间(天)" name="jobAroundTime">
                        </div>

                        <div class="col-sm-2">
                            <span class="btn btn-primary  fileinput-button">
                                    <i class="fa fa-plus"></i>
                                    <span>上传文件</span>
                                    <input type="file" name="jobFile" id="jobFile">
                            </span>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">人员</label>
                        <div class="col-sm-10">
                            <input type="hidden" id="members" name="members">
                            <a href="#" class="btn btn-danger btn-xs" id="selectStaff" onclick="fillList()">添加</a>
                                <ul id="email-to" class="inverse"></ul>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">内容</label>
                        <div class="col-sm-10">
                            <textarea id="editor_add" style="width: 100%;height: 150px" name="jobContent"></textarea>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addJob()">添加</button>
            </div>
        </div>
    </div>
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

<%--第二层模态框 选择人员--%>
<div class="modal fade" id="staffList" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 600px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">添加任务人员</h4>
            </div>
            <%--内容--%>
            <div class="modal-body">
                <button type="button" class="btn-link m-b-5" data-toggle="modal" data-target="#" onclick="">所有人员</button>
                <button type="button" class="btn-link m-b-5" data-toggle="modal" data-target="#" onclick="">按部门</button>
                <button type="button" class="btn-link m-b-5" data-toggle="modal" data-target="#" onclick="">按职位</button>
                <HR align=center width=100% color=#987cb9 SIZE=1>
                <div class="row">
                    <div class="col-md-5">
                        <div data-scrollbar="true" data-height="280px" id="right">
                            <ul class="list1"></ul>

                        </div>
                    </div>
                    <div class="col-md-2">
                        <p> &gt;&gt; </p>
                        <p> &gt;&gt;&gt;</p>
                        <p>&lt;&lt;</p>
                        <p>&lt;&lt;&lt;</p>
                    </div>
                    <div class="col-md-5">
                        <div data-scrollbar="true" data-height="280px" id="left">
                            <ul class="list2"></ul>
                        </div>
                    </div>
                </div>
            </div>
            <%--/内容--%>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="return_add()">确认</button>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    handleSlimScroll();
    EmailCompose.init();
</script>



<script type="text/javascript">
        $(function() {
            $('#selectStaff').on("click", function () {
                $('#staffList').modal();
            });
        });
</script>

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
        UE.delEditor('editor_add');
        var ue1 = UE.getEditor('editor_add');
    });
</script>

<script type="text/javascript ">
    function getContent(editor) {
        var arr = [];
        arr.push(UE.getEditor(editor).getContent());
        var content = arr.join("\n");
        return content;
    }

    function setContent(html,isAppendTo) {
        UE.getEditor('editor_edit').setContent(html,isAppendTo);
    }

    function deleteStaff(id) {
        if(confirm('确实要删除该员工吗?')) {
            $.post(rootPath+"/staff/delete",{"staffId":id},function(data){
                if(data == "1"){
                    alert("员工信息删除成功！");
                }else{
                    alert("员工信息删除失败！");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/staff/list")
            });
        }
    }

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


    function addJob() {
        if(getContent("editor_add") == null){
            $("#editor_add").val("&nbsp")
        }else{
            $("#editor_add").val(getContent("editor_add"));
        }

        $("#members").val(right.toString())
        alert(right.toString())
        var formData = new FormData($("#add_job_form" )[0]);
        $.ajax({
            url: rootPath+"/job/add",
            type: 'POST',
            data:formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data == "1"){
                    alert("添加任务成功！");
                }else{
                    alert(data);
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/job/getAll")
            }
        });
    }

    function getMyReJob() {
        var tb = $("#jobList");
        tb.load(rootPath+"/job/getMyRe");
    }

</script>

<script type="text/javascript">
    var left = [];  //未被选中列表
    var leftName = [];   //未选中人姓名和部门
    right = [];    //
    rightName = [];  //选中的姓名和部门

    function render(arr) {
        var str = '';
        arr.forEach(function (ele, index) {
            return str += "<li>"+ ele + "</li>"
        })
        return str
    }
    function renderPage() {
        //$('.list1').html(render(left));
        //$('.list2').html(render(right));

        $('.list1').html(render(leftName));
        $('.list2').html(render(rightName));

        $('.list1 > li').on('click', function () {
            var index = $(this).index();
            right.push(left[index]);
            left.splice(index, 1);

            rightName.push(leftName[index])
            leftName.splice(index, 1);

            renderPage();
        });
        $('.list2 > li').on('click', function () {
            var index = $(this).index();

            left.unshift(right[index])
            right.splice(index, 1);

            leftName.unshift(rightName[index])
            rightName.splice(index, 1);
            renderPage();
        })
    }

    function fillList() { //将后台数据填充到书中当中
        <c:forEach items="${allStaffInfo}" var="item">
        left.push('${item.staffId}')
        leftName.push('${item.staffName}'+"("+'${item.departName}'+")")
        </c:forEach>
        renderPage()
    }

    function return_add() {
        var str = '';
        for (var i = 0 ; i < right.length;i++){
            str += "<li>" + rightName[i] +";"+  "</li>";
        }
        $("#email-to").html(str)

    }





</script>

