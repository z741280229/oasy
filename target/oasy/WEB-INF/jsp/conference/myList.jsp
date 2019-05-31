<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">周期会议</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#conferenceAddDialog">申请会议</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>会议主题</th>
                        <th>会议地点</th>
                        <th>会议时间</th>
                        <th>联系人</th>
                        <th>会议重复模式</th>
                        <th>状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${list}">
                        <tr class="gradeA">
                            <td>
                                <a href="#" class="btn-link m-b-5" data-toggle="modal" data-target="#conferenceDetailDialog" onclick="getConDetails('${key.conId}')">${key.conTheme}</a>
                            </td>
                            <td>${key.conPlaceName}</td>
                            <td>${key.conStartDate}</td>
                            <td>${key.conLinkmanName}</td>
                            <td>
                                <c:if test="${key.conModel == 1}">日常列会</c:if>
                                <c:if test="${key.conModel == 2}">周列会</c:if>
                                <c:if test="${key.conModel == 3}">月列会</c:if>
                            </td>
                            <td>
                                <%--0 :申请中 1：申请通过 2:未通过 3：结束--%>
                                <c:if test="${key.conStatus == 0}">申请中</c:if>
                                <c:if test="${key.conStatus == 1}">通过</c:if>
                                <c:if test="${key.conStatus == 2}">未通过</c:if>
                                <c:if test="${key.conStatus == 3}">结束</c:if>
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

<!-- 任务添加会议框 -->
<div class="modal fade" id="conferenceAddDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">新建会议</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_conference_form" enctype="multipart/form-data">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">会议主题</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="会议主题" name="conTheme">
                        </div>

                        <label class="col-sm-2 control-label">会议类型</label>
                        <div class="col-sm-2">
                            <select	class="form-control" name="conType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${contypes}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">主持人</label>
                        <div class="col-sm-2">
                            <select	class="form-control" name="conCompere">
                                <option value="">--请选择--</option>
                                <c:forEach items="${staffs}" var="item">
                                    <option value="${item.staffId}">${item.staffName }-${item.departName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">主办部门</label>
                        <div class="col-sm-2">
                            <select	class="form-control"  name="conSponsorDapart">
                                <option value="">--请选择--</option>
                                <c:forEach items="${allDepartments}" var="item">
                                    <option value="${item.departId}">${item.departName}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">联系人</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="conLinkman">
                                <option value="">--请选择--</option>
                                <c:forEach items="${staffs}" var="item">
                                    <option value="${item.staffId}">${item.staffName }-${item.staffTel}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">to</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="toStaff">
                                <option value="">--请选择--</option>
                                <c:forEach items="${staffs}" var="item">
                                    <option value="${item.staffId}">${item.staffName }-${item.staffTel}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">会议室</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="conPlaceId">
                                <option value="">--请选择--</option>
                                <c:forEach items="${allBoardroom}" var="item">
                                    <option value="${item.bdId}">${item.bdName}(容：${item.bdSpace}人)</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">会议时间</label>
                        <div class="col-sm-4">
                            <input type="hidden" name="conStartDate" id="conStartDate">
                            <input type="date" class="form-control" id="conStart" placeholder="日期" />
                            <input type="time" class="form-control" id="conStartTime" placeholder="时间" />
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">参会人员</label>
                        <div class="col-sm-10">
                            <input type="hidden" id="members" name="members">
                            <a href="#" class="btn btn-danger btn-xs" id="selectStaff" onclick="fillList()">添加</a>
                            <ul id="email-to" class="inverse"></ul>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">资源准备</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" name="conResource"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">模式</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="conModel">
                                <option>--请选择--</option>
                                <option value="1">日常会议</option>
                                <option value="2">周会议</option>
                                <option value="3">月会议</option>
                            </select>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addConference()">添加</button>
            </div>
        </div>
    </div>
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

                        <label class="col-sm-2 control-label">会议类型</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="会议类型" id="conType">
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
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addConference()">添加</button>
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

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

<script type="text/javascript">
    $(function() {
        $('#selectStaff').on("click", function () {
            $('#staffList').modal();
        });
    });
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
        <c:forEach items="${staffs}" var="item">
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

<script>

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

    function addConference() {
        $("#members").val(right.toString())
        var date = $("#conStart").val() + " " +$("#conStartTime").val();
        $("#conStartDate").val(date)
        var formData = new FormData($("#add_conference_form" )[0]);
        $.ajax({
            url: rootPath+"/conference/addCon",
            type: 'POST',
            data:formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data == "1"){
                    alert("会议申请提交成功！");
                }else{
                    alert("提交失败");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/conference/myList")
            }
        });
    }
</script>