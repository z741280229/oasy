<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <div class="panel-heading-btn">
                <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
                <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
                <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
                <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
            </div>
            <h4 class="panel-title">部门列表</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#departAddDialog">添加</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>部门标号</th>
                            <th>部门名称</th>
                            <th>上级部门</th>
                            <th>部门类型</th>
                            <th>部门职责</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="key" items="${list}">
                            <tr class="gradeA">
                                <input type="hidden" name="departId" value="${key.departId}">
                                <td>${key.departNum}</td>
                                <td>${key.departName}</td>
                                <td>${key.parentName}</td>
                                <td>${key.dapartType}</td>
                                <td>${key.departDuty}</td>
                                <td>
                                    <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#departEditDialog" onclick="editDepartment('${key.departId}')">修改</a>
                                    <a href="#" class="btn btn-danger btn-xs" onclick="deleteDepartment('${key.departId}')">删除</a>
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

<!-- 部门编辑对话框 -->
<div class="modal fade" id="departEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改部门信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_depart_form">
                    <input type="hidden" id="departId" name="departId"/>

                    <div class="form-group">
                        <label for="departName" class="col-sm-2 control-label">部门名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="departName" placeholder="部门名称" name="departName">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="departNum" class="col-sm-2 control-label">部门编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="departNum" placeholder="部门编号" name="departNum" readonly="readonly">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="parentId" style="float:left;padding:7px 15px 0 27px;">上级部门</label>
                        <div class="col-sm-10">
                            <select	class="form-control" id="parentId" placeholder="上级部门" name="parentId">

                                <c:if test="${parentId != '0'}">
                                    <option value="">--请选择--</option>
                                    <c:forEach items="${list}" var="item">
                                        <option value="${item.departId}"<c:if test="${item.departId == parentId}"> selected</c:if>>${item.departName }</option>
                                    </c:forEach>
                                </c:if>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="departLeader" style="float:left;padding:7px 15px 0 27px;">领导</label>
                        <div class="col-sm-10">
                            <select	class="form-control" id="departLeader" placeholder="领导" name="departLeader">
                                    <option value="">--请选择--</option>
                                    <c:forEach items="${staffs}" var="item">
                                        <option value="${item.staffId}"<c:if test="${item.staffId == departLeader}"> selected</c:if>>${item.staffName }</option>
                                    </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="datepicker-default" class="col-sm-2 control-label">创建时间</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="datepicker-default"  name="createDate"/>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="dapartType" style="float:left;padding:7px 15px 0 27px;">部门类型</label>
                        <div class="col-sm-10">
                            <select	class="form-control" id="dapartType" placeholder="部门类型" name="dapartType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${dapartTpye}" var="item">
                                    <option value="${item.dictId}" <c:if test="${item.dictId == dapartType}"> selected</c:if> >${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="departDuty" class="col-sm-2 control-label">部门职责</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" id="departDuty" placeholder="部门职责" name="departDuty"/>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateDepartment()">保存</button>
                <%--<a href="#" class="btn btn-danger btn-xs" onclick="updateDepartment()">保存修改</a>--%>

            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->



<!-- 部门添加对话框 -->
<div class="modal fade" id="departAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="">添加部门</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_depart_form">
                    <div class="form-group">
                        <label for="departName" class="col-sm-2 control-label">部门名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="部门名称" name="departName">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="departNum" class="col-sm-2 control-label">部门编号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="部门编号" name="departNum">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="parentId" style="float:left;padding:7px 15px 0 27px;">上级部门</label>
                        <div class="col-sm-10">
                            <select	class="form-control" placeholder="上级部门" name="parentId">
                                <c:if test="${parentId != '0'}">
                                    <option value="">--请选择--</option>
                                    <c:forEach items="${list}" var="item">
                                        <option value="${item.departId}"<c:if test="${item.departId == parentId}"> selected</c:if>>${item.departName }</option>
                                    </c:forEach>
                                </c:if>

                            </select>
                        </div>
                    </div>


                    <div class="form-group">
                        <label  style="float:left;padding:7px 15px 0 27px;">领导</label>
                        <div class="col-sm-10">
                            <select	class="form-control" placeholder="领导" name="departLeader">
                                    <option value="">--请选择--</option>
                                    <c:forEach items="${staffs}" var="item">
                                        <option value="${item.staffId}">${item.staffName }</option>
                                    </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="datepicker-default" class="col-sm-2 control-label">创建时间</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="datepicker-default"  name="createDate"/>
                            <%--<input type="text" class="form-control" id="createDate" placeholder="创建时间" name="createDate"/>'>--%>
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="dapartType" style="float:left;padding:7px 15px 0 27px;">部门类型</label>
                        <div class="col-sm-10">
                            <select	class="form-control" placeholder="部门类型" name="dapartType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${dapartTpye}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == dapartType}"> selected</c:if>>${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="departDuty" class="col-sm-2 control-label">部门职责</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" placeholder="部门职责" name="departDuty"/>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addDepartment()">保存</button>
                <%--<a href="#" class="btn btn-danger btn-xs" onclick="updateDepartment()">保存修改</a>--%>

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
    function deleteDepartment(id) {
        if(confirm('确实要删除该部门吗?')) {
            $.post(rootPath+"/depart/delete",{"departId":id},function(data){
                if(data == "1"){
                    alert("部门信息删除成功！");
                }else{
                    alert("用户信息删除失败！");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/depart/list")
            });
        }
    }


    function editDepartment(id) {
        $.ajax({
            type:"post",
            url:rootPath+"/depart/edit",
            data:{"departId":id},
            success:function(data) {
                $("#departId").val(data.departId);
                $("#departNum").val(data.departNum);
                $("#departName").val(data.departName)
                $("#parentId").val(data.parentId)
                $("#datepicker-default").val(data.createDate)
                $("#dapartType").val(data.dapartType);
                $("#departDuty").val(data.departDuty);
                $("#departLeader").val(data.departLeader);
            }
        });
    }

    function updateDepartment() {
        $.post(rootPath+"/depart/update",$("#edit_depart_form").serialize(),function(data){
            if(data == "1"){
                alert("部门信息更新成功！");
            }else{
                alert("部门信息更新失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/depart/list")
        });
    }

    function addDepartment() {
        $.post(rootPath+"/depart/add",$("#add_depart_form").serialize(),function(data){
            if(data == "1"){
                alert("添加部门信息成功！");
            }else{
                alert("添加部门信息失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/depart/list")
        });
    }

</script>
