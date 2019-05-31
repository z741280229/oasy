<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


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
            <h4 class="panel-title">员工列表</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#staffAddDialog">添加</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>编号</th>
                            <th>姓名</th>
                            <th>性别</th>
                            <th>年龄</th>
                            <th>部门</th>
                            <th>职位</th>
                            <th>工资</th>
                            <th>入职时间</th>
                            <th>人员级别</th>
                            <th>状态</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="key" items="${list}">
                            <tr class="gradeA">
                                <input type="hidden" name="departId" value="${key.staffId}">
                                <td>${key.staffAccNum}</td>
                                <td>${key.staffName}</td>
                                <td>
                                    <c:forEach  var="item" items="${gender}">
                                        <c:if test="${key.staffGender == item.dictId}">
                                            ${item.dictTypeDetails}
                                        </c:if>
                                    </c:forEach>
                                </td>
                                <td>${key.staffAge}</td>

                                <td>
                                    <c:forEach  var="item" items="${depart}">
                                        <c:if test="${key.staffDepart == item.departId}">
                                            ${item.departName}
                                        </c:if>
                                    </c:forEach>
                                </td>
                                <td>
                                    <c:forEach  var="item" items="${positions}">
                                        <c:if test="${key.staffPosi == item.posiId}">
                                            ${item.posiName}
                                        </c:if>
                                    </c:forEach>
                                </td>

                                <td>${key.staffSal}</td>
                                <td>${key.staffHiredate}</td>

                                <td>
                                    <c:forEach  var="item" items="${types}">
                                        <c:if test="${key.staffGrade == item.dictId}">
                                            ${item.dictTypeDetails}
                                        </c:if>
                                    </c:forEach>
                                </td>
                                <td>
                                    <c:forEach  var="item" items="${status}">
                                        <c:if test="${key.staffStatus == item.dictId}">
                                            ${item.dictTypeDetails}
                                        </c:if>
                                    </c:forEach>
                                </td>
                                <td>
                                    <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#staffEditDialog" onclick="editstaff('${key.staffId}')">修改</a>
                                    <a href="#" class="btn btn-danger btn-xs" onclick="deleteStaff('${key.staffId}')">删除</a>
                                    <a href="#" class="btn btn-default btn-xs" onclick="initializePass('${key.staffId}')">初始化密码</a>
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

<!-- 人员编辑对话框 -->
<div class="modal fade" id="staffEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改员工信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_staff_form">
                    <input type="hidden" id="staffId" name="staffId"/>
                    <div class="form-group">
                        <label for="staffName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" id="staffName" placeholder="名称" name="staffName">
                        </div>

                        <label for="staffAccNum" class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" id="staffAccNum" placeholder="编号" name="staffAccNum" readonly="readonly">
                        </div>

                        <label for="staffGrade" class="col-sm-2 control-label">等级</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffGrade" placeholder="等级" name="staffGrade">
                                <option value="">--请选择--</option>
                                <c:forEach items="${types}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == staffGrade}"> selected</c:if>>${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="staffGender" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffGender" placeholder="性别" name="staffGender">
                                    <option value="">--请选择--</option>
                                    <c:forEach items="${gender}" var="item">
                                        <option value="${item.dictId}"<c:if test="${item.dictId == staffGender}"> selected</c:if>>${item.dictTypeDetails}</option>
                                    </c:forEach>
                            </select>
                        </div>

                        <label for="staffStatus" style="float:left;padding:7px 15px 0 27px;"class="col-sm-2 control-label">状态</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffStatus" placeholder="状态" name="staffStatus">
                                <option value="">--请选择--</option>
                                <c:forEach items="${status}" var="item">
                                    <option value="${item.dictId}"<c:if test="${item.dictId == staffStatus}"> selected</c:if>>${item.dictTypeDetails}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <label for="staffPosi" class="col-sm-2 control-label">职位</label>
                        <div class="col-sm-2">
                            <select	class="form-control" id="staffPosi" placeholder="职位" name="staffPosi">
                                <option value="">--请选择--</option>
                                <c:forEach items="${positions}" var="item">
                                    <option value="${item.posiId}"<c:if test="${item.posiId == staffPosi}"> selected</c:if>>${item.posiName }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="staffAge" class="col-sm-2 control-label">年龄</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control" id="staffAge" placeholder="年龄" name="staffAge">
                        </div>
                        <label for="staffSal" class="col-sm-2 control-label">工资</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control" id="staffSal" placeholder="工资" name="staffSal">
                        </div>
                        <label for="staffDepart"  class="col-sm-2 control-label">部门</label>

                        <div class="col-sm-2">
                            <select	class="form-control" id="staffDepart" placeholder="部门" name="staffDepart">
                                <option value="">--请选择--</option>
                                <c:forEach items="${depart}" var="item">
                                    <option value="${item.departId}"<c:if test="${item.departId == staffDepart}"> selected</c:if>>${item.departName }</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="staffBirthday" class="col-sm-2 control-label">出生日期</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" id="staffBirthday"  name="staffBirthday"/>
                        </div>

                        <label for="staffAddress" class="col-sm-2 control-label">地址</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="staffAddress" placeholder="地址" name="staffAddress">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="staffHiredate" class="col-sm-2 control-label">入职时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" id="staffHiredate" placeholder="入职时间" name="staffHiredate">
                        </div>

                        <label for="staffLeavedate" class="col-sm-2 control-label">离职时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control" id="staffLeavedate" placeholder="离职时间" name="staffLeavedate">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="staffTel" class="col-sm-2 control-label">电话号码</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="staffTel" placeholder="电话号码" name="staffTel">
                        </div>

                        <label for="stmail" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="stmail" placeholder="邮箱" name="stmail">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">其他</label>
                        <div class="col-sm-10">
                            <textarea id="editor_edit" style="width: 100%;height: 150px" name="staffOther"></textarea>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateStaff()">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<!-- 人员添加对话框 -->
<div class="modal fade" id="staffAddDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">添加员工信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_staff_form">
                    <div class="form-group">
                        <label for="staffName" class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control" placeholder="名称" name="staffName">
                        </div>

                        <label for="staffAccNum" class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-2">
                            <input type="text" class="form-control"  placeholder="编号" name="staffAccNum">
                        </div>

                        <label for="staffGrade" class="col-sm-2 control-label">等级</label>
                        <div class="col-sm-2">
                            <select	class="form-control" placeholder="等级" name="staffGrade">
                                <option value="">--请选择--</option>
                                <c:forEach items="${types}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="form-group">
                        <label for="staffGender" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-2">
                            <select	class="form-control"  placeholder="性别" name="staffGender">
                                <option value="">--请选择--</option>
                                <c:forEach items="${gender}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label for="staffStatus" style="float:left;padding:7px 15px 0 27px;"class="col-sm-2 control-label">状态</label>
                        <div class="col-sm-2">
                            <select	class="form-control" placeholder="状态" name="staffStatus">
                                <option value="">--请选择--</option>
                                <c:forEach items="${status}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <label for="staffAge" class="col-sm-2 control-label">年龄</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control"  placeholder="年龄" name="staffAge">
                        </div>

                    </div>
                    <div class="form-group" >

                        <label for="staffDepart"  class="col-sm-2 control-label">部门</label>
                        <div class="col-sm-2">
                            <select	class="form-control"  placeholder="部门" name="staffDepart">
                                <option value="">--请选择--</option>
                                <c:forEach items="${depart}" var="item">
                                    <option value="${item.departId}">${item.departName }</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label for="staffPosi" class="col-sm-2 control-label">职位</label>
                        <div class="col-sm-2">
                            <select	class="form-control"  placeholder="职位" name="staffPosi">
                                <option value="">--请选择--</option>
                                <c:forEach items="${positions}" var="item">
                                    <option value="${item.posiId}">${item.posiName }</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label for="staffSal" class="col-sm-2 control-label">工资</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control"  placeholder="工资" name="staffSal">
                        </div>
                    </div>
                    <div class="form-group" >

                        <label for="staffAddress" class="col-sm-2 control-label">地址</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control"  placeholder="地址" name="staffAddress">
                        </div>
                        <label for="staffTel" class="col-sm-2 control-label">电话</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control"  placeholder="电话号码" name="staffTel">
                        </div>

                    </div>
                    <div class="form-group" >
                        <label for="staffBirthday" class="col-sm-2 control-label">出生日期</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control"  name="staffBirthday"/>
                        </div>
                        <label for="staffHiredate" class="col-sm-2 control-label">入职时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control"  placeholder="入职时间" name="staffHiredate">
                        </div>


                    </div>
                    <div class="form-group" >
                        <label for="staffLeavedate" class="col-sm-2 control-label">离职时间</label>
                        <div class="col-sm-4">
                            <input type="date" class="form-control"  placeholder="离职时间" name="staffLeavedate">
                        </div>
                        <label for="stmail" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control"  placeholder="邮箱" name="stmail">
                        </div>
                    </div>

                    <div class="form-group" >
                        <label class="col-sm-2 control-label">其他</label>
                        <div class="col-sm-10">
                            <textarea id="editor_add" style="width: 100%;height: 150px" name="staffOther"></textarea>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addStaff()">添加</button>
            </div>
        </div>
    </div>
</div>


<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
        UE.delEditor('editor_add');
        var ue1 = UE.getEditor('editor_add');

        UE.delEditor('editor_edit');
        var ue2 = UE.getEditor('editor_edit');
    });
</script>


<script type="text/javascript ">
    function getContent(editor) {
        var arr = [];
        arr.push(UE.getEditor(editor).getContent());
        var content = arr.join("\n");
        return content;
    }

    function setContent(html,isAppendTo) {
        UE.getEditor('editor_edit').setContent(html,isAppendTo);
    }

    function deleteStaff(id) {
        if(confirm('确实要删除该员工吗?')) {
            $.post(rootPath+"/staff/delete",{"staffId":id},function(data){
                if(data == "1"){
                    alert("员工信息删除成功！");
                }else{
                    alert("员工信息删除失败！");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/staff/list")
            });
        }
    }


    function editstaff(id) {
        $.ajax({
            type:"post",
            url:rootPath+"/staff/edit",
            data:{"staffId":id},
            success:function(data) {
                $("#staffId").val(data.staffId);
                $("#staffName").val(data.staffName);
                $("#staffAccNum").val(data.staffAccNum)
                $("#staffGender").val(data.staffGender)
                $("#staffBirthday").val(data.staffBirthday)
                $("#staffAddress").val(data.staffAddress);
                $("#staffAge").val(data.staffAge);
                $("#staffDepart").val(data.staffDepart);
                $("#staffSal").val(data.staffSal);
                $("#staffHiredate").val(data.staffHiredate)
                $("#staffLeavedate").val(data.staffLeavedate)
                $("#staffTel").val(data.staffTel);
                $("#stmail").val(data.stmail);
                //$("#editor_edit").val(data.staffOther);
                $("#staffPosi").val(data.staffPosi);
                $("#staffStatus").val(data.staffStatus);
                $("#staffGrade").val(data.staffGrade)
                if(data.staffOther == null){
                    setContent("&nbsp",false)
                }else{
                    setContent(data.staffOther,false)
                }
            }
        });
    }

    function updateStaff() {
        $("#editor_edit").val(getContent("editor_edit"));
        $.post(rootPath+"/staff/update",$("#edit_staff_form").serialize(),function(data){
            if(data == "1"){
                alert("员工信息更新成功！");
            }else{
                alert("员工更新失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/staff/list")
        });
        // var tb = $("#loadhtml");   //放在这里和放在上面的区别
        // tb.load(rootPath + "/staff/list")
    }

    function addStaff() {
        if(getContent("editor_add") == null){
            $("#editor_add").val("&nbsp")
        }else{
            $("#editor_add").val(getContent("editor_add"));
        }
        $.post(rootPath+"/staff/add",$("#add_staff_form").serialize(),function(data){
            if(data == "1"){
                alert("添加员工信息成功！");
            }else{
                alert(data);
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/staff/list")
        });
    }


    function initializePass(id) {
        if(confirm('初始化密吗?')) {
            $.post(rootPath+"/staff/initializePass",{"staffId":id},function(data){
                if(data == "1"){
                    alert("初始化密成功！");
                }else{
                    alert("初始化密失败！");
                }
            });
        }
    }
</script>