<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">档案详情</h4>
        </div>
        <div class="panel-body" style="height: 100%">
            <div class="table-responsive">
                <c:if test="${isSelect != 0}">
                    <div class="col-sm-1">
                        <a href="#" class="btn btn-sm btn-inverse" data-toggle="modal" data-target="#fileAddDialog"><i class="fa fa-plus m-r-5"></i>添加</a>
                    </div>
                </c:if>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>档案编号</th>
                        <th>档案名称</th>
                        <th>归档人</th>
                        <th>归档日期</th>
                        <th>存储方式</th>
                        <th>状态</th>
                        <c:if test="${isSelect != 0}">
                        <th>操作</th>
                        </c:if>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="item" items="${list}">
                        <tr class="odd gradeA">
                            <td>
                                <a href="#" class="btn-link m-b-5" onclick="getFileDetails('${item.fileId}')">${item.fileNum}</a>
                            </td>
                            <td>${item.fileName}</td>
                            <td>${item.fileSavePersonName}</td>
                            <td>${item.fileSaveDate}</td>
                            <td>
                                <c:if test="${item.fileSaveWay == 1}">
                                    纸质保存
                                </c:if>
                                <c:if test="${item.fileSaveWay == 0}">
                                    电子保存
                                </c:if>
                            </td>
                            <td>
                                <c:if test="${item.fileStatus == 1}">
                                    在库
                                </c:if>
                                <c:if test="${item.fileStatus == 0}">
                                    外借
                                </c:if>
                            </td>

                            <c:if test="${isSelect != 0}">
                                <td>
                                    <a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#fileEditDialog" onclick="editFile('${item.fileId}')">修改</a>
                                    <a href="#" class="btn btn-danger btn-xs" onclick="deleteFile('${item.fileId}')">下架</a>
                                </td>
                            </c:if>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- end panel -->
</div>

<div class="modal fade" id="fileAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >添加档案</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_file_form">
                    <input type="hidden" name="fileParent" value="${parentId}">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="档案编号" name="fileNum">
                        </div>
                        <label class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="档案名称" name="fileName">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">保存期限</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileDeadline">
                                <option value="">--请选择--</option>
                                <option value="1">短期</option>
                                <option value="2">长期</option>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">密级</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileGrade">
                                <option value="">--请选择--</option>
                                <option value="1">公开</option>
                                <option value="2">机密</option>
                                <option value="3">指定人可见</option>
                            </select>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">归档类别</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileBelong">
                                <option value="">--请选择--</option>
                                <c:forEach items="${belong}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">存储方式</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileSaveWay">
                                <option value="">--请选择--</option>
                                <option value="0">电子保存</option>
                                <option value="1">纸质保存</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">位置</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" placeholder="位置" name="fileSavePlace">
                        </div>
                    </div>



                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addFile()">保存</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="fileEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >修改档案</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_file_form">
                    <input type="hidden" name="fileId" id="fileId">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">编号</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="档案编号" name="fileNum" id="fileNum" readonly>
                        </div>
                        <label class="col-sm-2 control-label">名称</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="档案名称" name="fileName" id="fileName">
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">保存期限</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileDeadline" id="fileDeadline">
                                <option value="">--请选择--</option>
                                <option value="1">短期</option>
                                <option value="2">长期</option>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">密级</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileGrade" id="fileGrade">
                                <option value="">--请选择--</option>
                                <option value="1" >公开</option>
                                <option value="2">机密</option>
                                <option value="3">指定人可见</option>
                            </select>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-sm-2 control-label">归档类别</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileBelong" id="fileBelong">
                                <option value="">--请选择--</option>
                                <c:forEach items="${belong}" var="item">
                                    <option value="${item.dictId}">${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>

                        <label class="col-sm-2 control-label">存储方式</label>
                        <div class="col-sm-4">
                            <select	class="form-control" name="fileSaveWay" id="fileSaveWay">
                                <option value="">--请选择--</option>
                                <option value="0">电子保存</option>
                                <option value="1">纸质保存</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">位置</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" placeholder="位置" name="fileSavePlace" id="fileSavePlace">
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateFile()">保存</button>
            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function() {
        TableManageColVis.init();
    });
</script>
<script type="text/javascript">
    function addFile() {
        var formData = new FormData($("#add_file_form" )[0]);
        $.ajax({
            url: rootPath+"/file/add",
            type: 'POST',
            data:formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data == "1"){
                    alert("上传成功！");
                }else{
                    alert("上传失败");
                }
                var tb = $("#fileList");
                tb.load(rootPath + "/file/single/?parentId="+'${parentId}')
            }
        })
    }

    function editFile(id) {
        $.post(rootPath+"/file/editFile",{"fId":id},function (data) {
            $("#fileId").val(data.fileId);
            $("#fileNum").val(data.fileNum);
            $("#fileName").val(data.fileName);
            $("#fileSavePlace").val(data.fileSavePlace);
        })
    }

    function getFileDetails(id) {
        $.post(rootPath+"/file/getFileDe",{"fId":id},function (data) {
            $("#fileId").val(data.fileId);
            $("#fileNum").val(data.fileNum);
            $("#fileName").val(data.fileName);
            $("#fileSavePlace").val(data.fileSavePlace);
        })
    }

    function updateFile() {
        $.post(rootPath+"/file/updateFile",$("#edit_file_form").serialize(),function (data) {
            if (data == "1"){
                alert("更新成功");
            } else{
                alert("更新成功")
            }
            var tb = $("#fileList");
            tb.load(rootPath + "/file/single/?parentId="+'${parentId}')
        })
    }

    function deleteFile(id) {
        $.post(rootPath+"/file/deteleFile",{"fId":id},function (data) {
            if (data == "1"){
                alert("下架成功");
            } else{
                alert("下架失败")
            }
            var tb = $("#fileList");
            tb.load(rootPath + "/file/single/?parentId="+'${parentId}')
        })
    }



</script>