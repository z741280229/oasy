<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">我的用车</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#carAppAddDialog">申请用车</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>车牌号</th>
                        <th>品牌</th>
                        <th>申请时间</th>
                        <th>使用时间</th>
                        <th>使用缘由</th>
                        <th>归还时间</th>
                        <th>状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${myApps}">
                        <tr class="gradeA">
                            <td>${key.carNum}</td>
                            <td>${key.carName}</td>
                            <td>${key.appCarTime}</td>
                            <td>${key.startTime}</td>
                            <td>${key.useReason}</td>
                            <td>
                                <c:if test="${empty key.returnDate}">
                                    未归还
                                </c:if>
                                    ${key.returnDate}
                            </td>
                            <td>
                                <c:if test="${key.carAppStatus == 0}">申请中</c:if>
                                <c:if test="${key.carAppStatus == 1}">申请成功</c:if>
                                <c:if test="${key.carAppStatus == 2}">拒绝申请</c:if>
                                <c:if test="${key.carAppStatus == 3}">已归还</c:if>
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

<!-- 车辆申请添加会议框 -->
<div class="modal fade" id="carAppAddDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">用车申请</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_app_form">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">车辆</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="carId">
                                <option value="">--请选择--</option>
                                <c:forEach items="${canUseCar}" var="item">
                                    <option value="${item.carId}">${item.carNumber }(${item.carBrand})</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">用车性质</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="nature">
                                <option value="">--请选择--</option>
                                    <option value="1">公用</option>
                                    <option value="2">使用</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">to</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="toStaff">
                                <option value="">--请选择--</option>
                                <c:forEach items="${staffs}" var="item">
                                    <option value="${item.staffId}">${item.staffName }(${item.staffAccNum})</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">方式</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="isSelf">
                                <option value="1">自驾</option>
                                <option value="2">代驾</option>
                            </select>
                        </div>

                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">开始时间</label>
                        <div class="col-sm-4">
                            <input type="hidden" name="startTime" id="startTime">
                            <input type="date" class="form-control" id="appStartDate" placeholder="日期" />
                            <input type="time" class="form-control" id="appStartTime" placeholder="时间" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">结束时间</label>
                        <div class="col-sm-4">
                            <input type="hidden" name="endTime" id="endTime">
                            <input type="date" class="form-control" id="appEndDate" placeholder="日期" />
                            <input type="time" class="form-control" id="appEndTime" placeholder="时间" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">预计历程</label>
                        <div class="col-sm-4">
                           <input type="number" class="form-control" name="preRun">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">始发地</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="startPart">
                        </div>

                        <label class="col-sm-2 control-label">目的地</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="endPart">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">使用缘由</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" name="useReason"></textarea>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addCarApp()">添加</button>
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

<script type="text/javascript">
    function addCarApp() {
        //开始时间
        var startDate = $("#appStartDate").val() + " " +$("#appStartTime").val();
        $("#startTime").val(startDate)

        //结束时间
        var endDate = $("#appEndDate").val() + " " +$("#appEndTime").val();
        $("#endTime").val(endDate)

        var formData = new FormData($("#add_app_form" )[0]);
        $.ajax({
            url: rootPath+"/car/carApp",
            type: 'POST',
            data:formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data == "1"){
                    alert("提交成功！");
                }else{
                    alert("提交失败");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/car/myList")
            }
        });
    }
</script>