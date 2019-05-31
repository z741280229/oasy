<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">我的领用</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#ApplyOsDialog">申请领用</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>申请时间</th>
                        <th>物品编号</th>
                        <th>物品名称</th>
                        <th>备注</th>
                        <th>状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${list}">
                        <tr class="gradeA">
                            <td>${key.appDate}</td>
                            <td>${key.osOrdNum}</td>
                            <td>${key.osName}</td>
                            <td>${key.others}</td>
                            <td>
                                <c:if test="${key.appStatus == 0}">待审批</c:if>
                                <c:if test="${key.appStatus == 1}">已通过</c:if>
                                <c:if test="${key.appStatus == 2}">不同意</c:if>
                            </td>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- end panel -->
</div>


<!--添加物品申请 -->
<div class="modal fade" id="ApplyOsDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">新建领用申请</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="app_os_form" enctype="multipart/form-data">

                    <div class="form-group">
                        <label class="col-sm-2 control-label">物品</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="osId" onchange="getDetails()" id="osId">
                                <option value="">--请选择--</option>
                                <c:forEach items="${oslist}" var="item">
                                    <option value="${item.osId}">${item.osName}/${item.osOrdNum}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">申请数量</label>
                        <div class="col-sm-2">
                            <input type="number" name="pickupNum" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">原由</label>
                        <div class="col-sm-10">
                            <textarea name="others" class="form-control"></textarea>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addApp()">添加</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

<script>
    function addApp() {
        $.post(rootPath+"/ospc/addApp",$("#app_os_form").serialize(),function (data) {
            if (data ==1 ){
                alert("成功发出申请")

            } else{
                alert("发出申请失败");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/ospc/myList")
        })
    }
</script>