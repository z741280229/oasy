<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">用车审批</h4>
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
                            <th>车牌号</th>
                            <th>品牌</th>
                            <th>申请时间</th>
                            <th>使用时间</th>
                            <th>始-终</th>
                            <th>预计公里</th>
                            <th>使用缘由</th>
                            <th>申请人</th>
                            <th>状态</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="key" items="${list}">
                        <tr class="gradeA">
                            <td> <input type="checkbox" name="carAppId" value="${key.carAppId}"></td>
                            <td>${key.carNum}</td>
                            <td>${key.carName}</td>
                            <td>${key.appCarTime}</td>
                            <td>${key.startTime}</td>
                            <td>${key.startPart}-${key.endPart}</td>
                            <td>${key.preRun}/KM</td>
                            <td>${key.useReason}</td>
                            <td>${key.carAppUserName}</td>
                            <td>
                                    <%--0 :申请中 1：申请通过 2:未通过 3：已归还--%>
                                <c:if test="${key.carAppStatus == 0}">申请中</c:if>
                                <c:if test="${key.carAppStatus == 1}">使用中</c:if>
                                <c:if test="${key.carAppStatus == 2}">未通过</c:if>
                                <c:if test="${key.carAppStatus == 3}">已归还</c:if>
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
        $("input[name='carAppId']:checked").each(function(i){//把所有被选中的复选框的值存入数组
            checkID[i] =$(this).val();
        });
        $.post(rootPath+"/car/deal",{"carAppIds":checkID,"appStatus":status},function (data) {
            if (data == "1"){
                alert("处理成功")
            } else {
                alert("处理失败")
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/car/toDeal")
        })
    }
</script>
