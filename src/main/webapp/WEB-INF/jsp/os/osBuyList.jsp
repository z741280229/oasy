<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">采购历史</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#ApplyDialog">新建申请</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>物品编号</th>
                        <th>物品名称</th>
                        <%--<th>类别</th>--%>
                        <th>规格</th>

                        <th>采购人</th>
                        <th>申请量</th>
                        <th>购买量</th>
                        <th>未入库</th>

                        <th>预计金额</th>
                        <th>实际金额</th>

                        <th>申请日期</th>
                        <th>状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${list}">
                        <tr class="gradeA">
                            <td>${key.osOrdNum}</td>
                            <td>${key.osName}</td>
                            <%--<td>--%>
                                <%--<c:forEach var="type" items="${osTypes}">--%>
                                    <%--<c:if test="${key.osCategory == type.dictId}">--%>
                                        <%--${type.dictTypeDetails}--%>
                                    <%--</c:if>--%>
                                <%--</c:forEach>--%>
                            <%--</td>--%>
                            <td>${key.osSpecification}</td>
                            <td>${key.purchaserName}</td>
                            <td>${key.appPurchaseNum}</td>
                            <td>${key.purchaseNum}</td>
                            <td>${key.notInputNum}</td>
                            <td>${key.estimatedAmount}(元)</td>
                            <td>${key.useMoney}(元)</td>
                            <td>${key.applyDate}</td>
                            <td>
                               <c:forEach items="${osBuyStatus}" var="item">
                                   <c:if test="${item.dictId == key.purchaseStatus}">
                                       ${item.dictTypeDetails}
                                   </c:if>
                               </c:forEach>
                            </td>
                            <td>
                                <a href="#" class="btn btn-danger btn-xs"  data-toggle="modal" data-target="#osEditDialog" onclick="edit('${key.osbId}','${key.purchaseStatus}','${key.purchaseDate}')">修改</a>
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

<!-- 信息修改 -->
<div class="modal fade" id="osEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_osnum_form">
                    <input type="hidden" id="osbId" name="osbId">
                    <input type="hidden" id="purchaseStatus" name="purchaseStatus">
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="number" class="form-control" placeholder="实际购买量" name="purchaseNum">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="实际花费(元)" name="useMoney">
                        </div>
                    </div>
                    <div  class="form-group">
                        <div class="input-daterange col-sm-10">
                            <input type="text" class="form-control" placeholder="购买时间" id="purchaseDate" name="purchaseDate"/>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateNum()">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<!-- 信息修改 -->
<div class="modal fade" id="ApplyDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">新建购物申请</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="app_os_form" enctype="multipart/form-data">

                    <div class="form-group" >
                        <label class="col-sm-2 control-label">申请日期</label>
                        <div class="input-daterange col-sm-4">
                            <input type="text" class="form-control" name="applyDate" placeholder="申请日期" />
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">原由</label>
                        <div class="col-sm-10">
                              <textarea name="applyResult" class="form-control"></textarea>
                        </div>
                    </div>


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
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-2">
                            <input type="text" name="osOrdNum" class="form-control" id="osOrdNum">
                        </div>
                        <label class="col-sm-1 control-label">规格</label>
                        <div class="col-sm-2">
                            <input type="text" name="osSpecification" class="form-control" id="osSpecification">
                        </div>
                        <label class="col-sm-1 control-label">单位</label>
                        <div class="col-sm-1">
                            <input type="hidden" name="osUnit" class="form-control" id="osUnit">
                            <input type="text" class="form-control" id="_osUnit">
                        </div>
                        <label class="col-sm-1 control-label">单价</label>
                        <div class="col-sm-1">
                            <input type="text" name="osPrice" class="form-control" placeholder="元" id="osPrice">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">采购数量</label>
                        <div class="col-sm-2">
                            <input type="number" name="appPurchaseNum" class="form-control" onchange="addPrice()" id="appPurchaseNum">
                        </div>

                        <label class="col-sm-2 control-label">预计金额</label>
                        <div class="col-sm-2">
                            <input type="text" name="estimatedAmount" class="form-control" placeholder="元" id="estimatedAmount">
                        </div>
                    </div>

                    <div class="form-group" >
                        <label class="col-sm-2 control-label">审批意见</label>
                        <div class="col-sm-10">
                           <textarea name="" class="form-control"></textarea>
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
<!-- /#wrapper -->

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

<script>
    function edit(id,status,date) {
        $("#osbId").val(id)
        $("#purchaseStatus").val(status)
        $("#purchaseDate").val(date)
    }

    function updateNum() {
        $.post(rootPath+"/osBuy/updateNum",$("#edit_osnum_form").serialize(),function(data){
            if(data == "1"){
                alert("更新成功！");
            }else{
                alert("更新失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/osBuy/list")
        });
    }

    function getDetails() {
        var osId =  $("#osId option:selected").val()
        $.post(rootPath+"/osBuy/getDetails",{"osId":osId},function (data) {
            $("#osOrdNum").val(data.osOrdNum)
            $("#osSpecification").val(data.osSpecification)
            <c:forEach items="${osUnits}" var="item">
                if ('${item.dictId}'== data.osUnit) {
                    $("#_osUnit").val('${item.dictTypeDetails}')
                    $("#osUnit").val(data.osUnit)
                }
            </c:forEach>

            $("#osPrice").val(data.osPrice)
        })        
    }

    function addPrice() {
        var num = $("#appPurchaseNum").val();
        var price = $("#osPrice").val()
        $("#estimatedAmount").val(num*price)
    }

</script>
