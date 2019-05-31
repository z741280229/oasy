<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">车辆列表</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#carAddDialog">添加车辆</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>车牌号</th>
                        <th>品牌</th>
                        <th>车型</th>
                        <th>载客数</th>
                        <th>司机</th>
                        <th>下次年检</th>
                        <th>状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${list}">
                        <tr class="gradeA">
                            <td>${key.carNumber}</td>
                            <td>${key.carBrand}</td>
                            <td>
                                <c:forEach items="${types}" var="item">
                                    <c:if test="${item.dictId == key.carType}">
                                        ${item.dictTypeDetails}
                                    </c:if>
                                </c:forEach>
                            </td>
                            <td>${key.carSpace}人</td>
                            <td>${key.carDriverName}(${key.carDriverTel})</td>
                            <td>${key.carDateSafe}</td>
                            <td>
                                <c:if test="${key.carStatus == 0}">
                                    可用
                                </c:if>
                                <c:if test="${key.carStatus == 1}">
                                    已出
                                </c:if>
                                <c:if test="${key.carStatus == 2}">
                                    检修
                                </c:if>
                            </td>
                            <td>
                                <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#carEditDialog" onclick="editCar('${key.carId}')">修改</a>
                                <a href="#" class="btn btn-danger btn-xs" onclick="deleteCar('${key.carId}')">删除</a>
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


<!-- 车辆添加对话框 -->
<div class="modal fade" id="carAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="">添加车辆</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_car_form">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">车牌号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="车牌号" name="carNumber">
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">品牌</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="品牌" name="carBrand">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">车型</label>
                        <div class="col-sm-4">
                            <select	class="form-control" placeholder="车型" name="carType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${types}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>


                    <div class="form-group">
                        <label  class="col-sm-2 control-label">载客数</label>
                        <div class="col-sm-4">
                            <input type="number" class="form-control" placeholder="载客数" name="carSpace">
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">驾驶员</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="驾驶员" name="carDriverName">
                        </div>
                        <label  class="col-sm-2 control-label">电话号码</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="电话号码" name="carDriverTel">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">权限</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="carLimits">
                                <option value="">--请选择--</option>
                                    <option value="1">全部</option>
                                    <option value="2">董事长</option>
                                    <option value="3">经理</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">年检时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" placeholder="年检时间" name="carDateSafe">
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addCar()">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<!-- 车辆修改对话框 -->
<div class="modal fade" id="carEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">修改车辆</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_car_form">
                    <input type="hidden" id="carId" name="carId">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">车牌号</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="车牌号" name="carNumber" id="carNumber">
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">品牌</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="品牌" name="carBrand" id="carBrand">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">车型</label>
                        <div class="col-sm-4">
                            <select	class="form-control" placeholder="车型" name="carType" id="carType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${types}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == carType}"> </c:if>>${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>


                    <div class="form-group">
                        <label  class="col-sm-2 control-label">载客数</label>
                        <div class="col-sm-4">
                            <input type="number" class="form-control" placeholder="载客数" name="carSpace" id="carSpace">
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">驾驶员</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="驾驶员" name="carDriverName" id="carDriverName">
                        </div>
                        <label  class="col-sm-2 control-label">电话号码</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="电话号码" name="carDriverTel" id="carDriverTel">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">权限</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="carLimits" id="carLimits">
                                <option value="">--请选择--</option>
                                <option value="1" <c:if test="${carLimits == 1}"></c:if>>全部</option>
                                <option value="2" <c:if test="${carLimits == 2}"></c:if>>董事长</option>
                                <option value="3" <c:if test="${carLimits == 3}"></c:if>>经理</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">年检时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" placeholder="年检时间" name="carDateSafe" id="carDateSafe">
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateCar()">保存</button>
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
    function deleteCar(id) {
        if(confirm('确实要删除该车辆吗?')) {
            $.post(rootPath+"/car/delete",{"carId":id},function(data){
                if(data == "1"){
                    alert("删除成功！");
                }else{
                    alert("删除失败！");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/car/list")
            });
        }
    }
    function editCar(id) {
        $.ajax({
            type:"post",
            url:rootPath+"/car/edit",
            data:{"carId":id},
            success:function(data) {
                $("#carId").val(data.carId);
                $("#carNumber").val(data.carNumber);
                $("#carBrand").val(data.carBrand)
                $("#carType").val(data.carType)
                $("#carSpace").val(data.carSpace)
                $("#carDriverName").val(data.carDriverName);
                $("#carDriverTel").val(data.carDriverTel);
                $("#carDateSafe").val(data.carDateSafe);
                $("#carLimits").val(data.carLimits);
                $("#carDateSafe").val(data.carDateSafe);
            }
        });
    }
    function updateCar() {
        $.post(rootPath+"/car/update",$("#edit_car_form").serialize(),function(data){
            if(data == "1"){
                alert("更新成功！");
            }else{
                alert("更新失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/car/list")
        });
    }
    function addCar() {
        $.post(rootPath+"/car/add",$("#add_car_form").serialize(),function(data){
            if(data == "1"){
                alert("添加成功！");
            }else{
                alert("添加失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/car/list")
        });
    }
</script>

