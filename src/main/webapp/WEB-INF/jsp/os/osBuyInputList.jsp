<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">入库清单</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>物品编号</th>
                        <th>物品名称</th>
                        <th>类别</th>
                        <th>规格</th>
                        <th>未入库</th>
                        <th>入库日期</th>
                        <th>入库人</th>
                        <th>状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${list}">
                        <tr class="gradeA">
                            <td>${key.osOrdNum}</td>
                            <td>${key.osName}</td>
                            <td>
                                <c:forEach var="type" items="${osTypes}">
                                    <c:if test="${key.osCategory == type.dictId}">
                                        ${type.dictTypeDetails}
                                    </c:if>
                                </c:forEach>
                            </td>
                            <td>${key.osSpecification}</td>
                            <td>
                                <input type="number" id="${key.osbId}" value="${key.notInputNum}" style="width: 60px">
                                <a href="#" class="btn btn-danger btn-xs" onclick="updateNum('${key.osbId}','${key.purchaseStatus}','${key.osId}')">提交</a>
                            </td>
                            <td>${key.inputDate}</td>
                            <td>${key.inputerName}</td>
                            <td>
                                <c:forEach items="${osBuyStatus}" var="item">
                                    <c:if test="${item.dictId == key.purchaseStatus}">
                                        ${item.dictTypeDetails}
                                    </c:if>
                                </c:forEach>
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




<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

<script>
    function updateNum(id,status,osId) {
        $.post(rootPath+"/osBuy/updateInputNum",{"osbId":id,"inputNum":$("#"+id).val(),"purchaseStatus":status,"osId":osId},function(data){
            if(data == "1"){
                alert("更新成功！");
            }else{
                alert("更新失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/osBuy/input")
        });
    }


</script>
