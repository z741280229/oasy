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
            <h4 class="panel-title">职位列表</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#positionAddDialog">添加</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>名称</th>
                            <th>工作内容</th>
                            <th>创建时间</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="key" items="${list}">
                            <tr class="gradeA">
                                <input type="hidden" name="posiId" value="${key.posiId}">
                                <td>${key.posiName}</td>
                                <td>${key.posiContent}</td>
                                <td>${key.createTime}</td>
                                <td>
                                    <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#positionEditDialog" onclick="editposition('${key.posiId}')">修改</a>
                                    <a href="#" class="btn btn-danger btn-xs" onclick="deletePosition('${key.posiId}')">删除</a>
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
<div class="modal fade" id="positionEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改职位信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_position_form">
                    <input type="hidden" id="posiId" name="posiId"/>

                    <div class="form-group">
                        <label for="posiName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="posiName" placeholder="名称" name="posiName">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="posiContent" class="col-sm-2 control-label">职位职责</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="posiContent" placeholder="职位职责" name="posiContent">
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updatePosition()">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->



<!-- 部门添加对话框 -->
<div class="modal fade" id="positionAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="">添加职位</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_position_form">
                    <div class="form-group">
                        <label for="posiName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="名称" name="posiName">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="posiContent" class="col-sm-2 control-label">职责</label>
                        <div class="col-sm-10">
                            <textarea class="form-control" placeholder="职责" name="posiContent"/>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addPosition()">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->




<script>
    $(document).ready(function() {
        //App.init();
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

<script>
    function deletePosition(id) {
        if(confirm('确实要删除该客户吗?')) {
            $.post(rootPath+"/position/delete",{"posiId":id},function(data){
                if(data == "1"){
                    alert("职位信息删除成功！");
                }else{
                    alert("职位信息删除失败！");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/position/list")

            });
        }
    }


    function editposition(id) {
        $.ajax({
            type:"post",
            url:rootPath+"/position/edit",
            data:{"posiId":id},
            success:function(data) {
                $("#posiId").val(data.posiId);
                $("#posiName").val(data.posiName);
                $("#posiContent").val(data.posiContent)
            }
        });
    }

    function updatePosition() {
        $.post(rootPath+"/position/update",$("#edit_position_form").serialize(),function(data){
            if(data == "1"){
                alert("职位信息更新成功！");
            }else{
                alert("职位信息更新失败！");
            }
           var tb = $("#loadhtml");
            tb.load(rootPath + "/position/list")
        });
    }

    function addPosition() {
        $.post(rootPath+"/position/add",$("#add_position_form").serialize(),function(data){
            if(data == "1"){
                alert("添加职位信息成功！");
            }else{
                alert("添加职位信息失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/position/list")
        });
    }

</script>
