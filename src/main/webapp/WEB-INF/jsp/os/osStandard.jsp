<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">办公用品列表</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#osAddDialog">添加</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>物品编号</th>
                        <th>物品名称</th>
                        <th>类别</th>
                        <th>规格</th>
                        <th>单位</th>
                        <th>参考价格(元)</th>
                        <th>库存</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${allOs}">
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
                                <c:forEach var="unit" items="${osUnits}">
                                    <c:if test="${key.osUnit == unit.dictId}">
                                        ${unit.dictTypeDetails}
                                    </c:if>
                                </c:forEach>
                            </td>
                            <td>${key.osPrice}</td>
                            <td>${key.osTotal}</td>
                            <td>
                                <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#osEditDialog" onclick="editOs('${key.osId}')">修改</a>
                                <a href="#" class="btn btn-danger btn-xs" onclick="deleteOs('${key.osId}')">删除</a>
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

<!-- 办公用品编辑对话框 -->
<div class="modal fade" id="osEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改物品信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_os_form">
                    <input type="hidden" id="osId" name="osId"/>

                    <div class="form-group">
                        <label for="osName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="osName" placeholder="名称" name="osName">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="osOrdNum" class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="osOrdNum" placeholder="编号" name="osOrdNum" readonly="readonly">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="osCategory" style="float:left;padding:7px 15px 0 27px;">类别</label>
                        <div class="col-sm-10">
                            <select	class="form-control" id="osCategory" placeholder="类别" name="osCategory">
                                <option value="">--请选择--</option>
                                <c:forEach items="${osTypes}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == osCategory}"> selected</c:if>>${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="osUnit" style="float:left;padding:7px 15px 0 27px;">单位</label>
                        <div class="col-sm-10">
                            <select	class="form-control" id="osUnit" placeholder="单位" name="osUnit">
                                <option value="">--请选择--</option>
                                <c:forEach items="${osUnits}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == osUnit}"> selected</c:if>>${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="osSpecification" class="col-sm-2 control-label">规格</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="osSpecification" placeholder="规格" name="osSpecification"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="osPrice" class="col-sm-2 control-label">单位</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="osPrice" placeholder="单位" name="osPrice"/>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateOs()">保存</button>

            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<!-- 办公用品添加对话框 -->
<div class="modal fade" id="osAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="">添加物品</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_os_form">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="名称" name="osName">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="编号" name="osOrdNum">
                        </div>
                    </div>

                    <div class="form-group">
                        <label style="float:left;padding:7px 15px 0 27px;">类别</label>
                        <div class="col-sm-10">
                            <select	class="form-control" placeholder="类别" name="osCategory">
                                <option value="">--请选择--</option>
                                <c:forEach items="${osTypes}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>


                    <div class="form-group">
                        <label  style="float:left;padding:7px 15px 0 27px;">单位</label>
                        <div class="col-sm-10">
                            <select	class="form-control" placeholder="单位" name="osUnit">
                                <option value="">--请选择--</option>
                                <c:forEach items="${osUnits}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">价格</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="价格" name="osPrice"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">规格</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="规格" name="osSpecification"/>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addOs()">保存</button>
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
    function deleteOs(id) {
        if(confirm('确实要删除该办公用品吗?')) {
            $.post(rootPath+"/osc/deleteOs",{"osId":id},function(data){
                if(data == "1"){
                    alert("删除成功！");
                }else{
                    alert("删除失败！");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/osc/getOas")
            });
        }
    }


    function editOs(id) {
        $.ajax({
            type:"post",
            url:rootPath+"/osc/editOs",
            data:{"osId":id},
            success:function(data) {
                $("#osId").val(data.osId);
                $("#osName").val(data.osName);
                $("#osOrdNum").val(data.osOrdNum)
                $("#osCategory").val(data.osCategory)
                $("#osSpecification").val(data.osSpecification)
                $("#osUnit").val(data.osUnit);
                $("#osPrice").val(data.osPrice);
            }
        });
    }

    function updateOs() {
        $.post(rootPath+"/osc/updateOs",$("#edit_os_form").serialize(),function(data){
            if(data == "1"){
                alert("更新成功！");
            }else{
                alert("更新失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/osc/getOas")
        });
    }

    function addOs() {
        $.post(rootPath+"/osc/addOs",$("#add_os_form").serialize(),function(data){
            if(data == "1"){
                alert("添加成功！");
            }else{
                alert("添加失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/osc/getOas")
        });
    }

</script>
