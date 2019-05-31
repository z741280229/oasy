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
                            <th>申请人</th>
                            <th>物品编号</th>
                            <th>物品名称</th>
                            <th>申请日期</th>
                            <th>备注</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="key" items="${list}">
                            <tr class="gradeA">
                                <td> <input type="checkbox" name="ospId" value="${key.ospId}"></td>
                                <td>${key.pickupStaffName}</td>
                                <td>${key.osOrdNum}</td>
                                <td>${key.osName}</td>
                                <td>${key.appDate}</td>
                                <td>${key.others}</td>
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
        $("input[name='ospId']:checked").each(function(i){//把所有被选中的复选框的值存入数组
          checkID[i] =$(this).val();
        });
        $.post(rootPath+"/ospc/dealApp",{"ospIds":checkID,"appStatus":status},function (data) {
            if (data == "1"){
                alert("处理成功")
            } else {
                alert("处理失败")
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/ospc/getpu")
        })
    }
</script>
