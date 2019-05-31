<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">领用历史</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <form id="dealApp">
                    <button type="button" class="btn btn-success m-r-5 m-b-5" onclick="dealStatus('${1}')">同意</button>
                    <button type="button" class="btn btn-success m-r-5 m-b-5" onclick="dealStatus('${2}')">不同意</button>
                    <table id="data-table" class="table table-striped table-bordered">
                        <thead>
                        <tr>
                            <th>
                                <input type="checkbox" id="checkAll">
                            </th>
                            <th>会议主题</th>
                            <th>会议地点</th>
                            <th>会议时间</th>
                            <th>联系人</th>
                            <th>会议模式</th>
                            <th>状态</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="key" items="${list}">
                        <tr class="gradeA">
                            <td> <input type="checkbox" name="conId" value="${key.conId}"></td>
                            <td><a href="#" class="btn-link m-b-5" data-toggle="modal" data-target="#conferenceDetailDialog" onclick="getConDetails('${key.conId}')">${key.conTheme}</a></td>
                            <td>${key.conPlaceName}</td>
                            <td>${key.conStartDate}</td>
                            <td>${key.conLinkmanName}-${key.conLinkmanTel}</td>
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
                            </c:forEach>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </div>
    <!-- end panel -->
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

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

<script>
    $(function(){
        $("#checkAll").click(function(){
            $("input").prop("checked",this.checked);
        });
    });
    function dealStatus(status) {
        var checkID = [];//定义一个空数组
        $("input[name='conId']:checked").each(function(i){//把所有被选中的复选框的值存入数组
            checkID[i] =$(this).val();
        });
        $.post(rootPath+"/conference/dealAppCon",{"conIds":checkID,"appStatus":status},function (data) {
            if (data == "1"){
                alert("处理成功")
            } else {
                alert("处理失败")
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/conference/myDeal")
        })
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
