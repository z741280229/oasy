<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">档案借阅列表</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <button type="button" class="btn btn-success m-r-5 m-b-5" data-toggle="modal" data-target="#borrowAddDialog">新建借阅</button>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th><input type="checkbox"></th>
                        <th>档案编号</th>
                        <th>档案命</th>
                        <th>借阅者</th>
                        <th>应还时间</th>
                        <th>归还时间</th>
                        <th>归还状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${list}">

                        <tr class="gradeA">
                            <td><input type="checkbox"></td>
                            <td>${key.fileNum}</td>
                            <td>${key.fileName}</td>
                            <td>${key.borrowerName}(${key.borrowerNum})</td>
                            <td>${key.filePreReturnDate}</td>
                            <td>
                                <c:if test="${empty key.fileReturnDate}">
                                    未归还
                                </c:if>
                                <c:if test="${key.fileReturnDate != ''}">
                                    ${key.fileReturnDate}
                                </c:if>
                            </td>
                            <td>
                                <%--0 以借阅  1 以归还  2 以超期 3 续借--%>
                                <c:if test="${key.fileBorrowStatus == 0}">
                                    以借阅
                                </c:if>
                                <c:if test="${key.fileBorrowStatus == 1}">
                                    以归还
                                </c:if>
                                <c:if test="${key.fileBorrowStatus == 2}">
                                    以超期
                                </c:if>
                                <c:if test="${key.fileBorrowStatus == 3}">
                                    续借中
                                </c:if>
                            </td>
                            <td>
                                <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#staffEditDialog" onclick="updateBorrow('${key.fileBorrowId}',1)">归还</a>
                                <a href="#" class="btn btn-danger btn-xs" onclick="updateBorrow('${key.fileBorrowId}',2)">超期</a>
                                <a href="#" class="btn btn-default btn-xs" onclick="updateBorrow('${key.fileBorrowId}',3)">续借</a>
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

<!-- 档案借阅添加对话框 -->
<div class="modal fade" id="borrowAddDialog" tabindex="-1" role="dialog" aria-labelledby="borrowAddDialog" style="overflow:auto">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">新增借阅档案</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_borrow_form">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">借阅人</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="borrowerId">
                                <option value="">--请选择--</option>
                                <c:forEach items="${allStaffInfo}" var="item">
                                    <option value="${item.staffId}">${item.staffName }(${item.staffAccNum})</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">借阅档案</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileId">
                                <option value="">--请选择--</option>
                                <c:forEach items="${allFile}" var="item">
                                    <option value="${item.fileId}">${item.fileName }(${item.fileNum})</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">借阅档案</label>
                        <div class="col-sm-10">
                            <textarea name="fileBorrowReason" class="form-control"></textarea>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addBorrow()">添加</button>
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
    function updateBorrow(id,way) {
        $.post(rootPath+"/fbc/deal",{fbId:id,dealWay:way},function(data){
            if(data == "1"){
                alert("归还成功！");
            }else if(data == "2"){
                alert("操作成功");
            }else if(data == "3"){
                alert("续借成功");
            }else{
                alert("操作失败");
            }
        });
    }

    function addBorrow() {
        $.post(rootPath+"/fbc/add",$("#add_borrow_form").serialize(),function(data){
            if(data == "1"){
                alert("借阅信息添加成功");
            }else{
                alert("借阅信息添加失败");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/fbc/list")
        });
    }

</script>