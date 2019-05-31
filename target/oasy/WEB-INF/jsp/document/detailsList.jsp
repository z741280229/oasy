<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">文件详情</h4>
        </div>
        <div class="panel-body" style="height: 100%">
            <div class="table-responsive">
                <c:if test="${isSelect != 0}">
                    <div class="col-sm-1">
                        <a href="#" class="btn btn-sm btn-inverse" data-toggle="modal" data-target="#docuAddDialog"><i class="fa fa-plus m-r-5"></i>添加</a>
                    </div>
                </c:if>
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>名称</th>
                        <th>大小</th>
                        <th>下载次数</th>
                        <th>最后更新</th>
                        <c:if test="${isSelect != 0}">
                            <th>操作</th>
                        </c:if>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="item" items="${documents}">
                        <tr class="odd gradeA">
                            <td>
                                <a href="${pageContext.request.contextPath}/document/download/?fileName=${item.docuNumName}&fileType=${item.docuType}&fileRealName=${item.docuRealName}&docuId=${item.docuId}" class="btn-link m-b-5">${item.docuRealName}</a>
                            </td>
                            <td>${item.docuSize}KB</td>
                            <td>${item.docuDownloadNum}</td>
                            <td>${item.uploaderName}</td>
                            <c:if test="${isSelect != 0}">
                                <td>
                                    <a href="#" class="btn-link m-b-5" data-toggle="modal" data-target="#docuReNameDialog" onclick="editName('${item.docuId}')">重命名</a>
                                    <a href="#" class="btn-link m-b-5" onclick="deleteDocu('${item.docuId}')">下架</a>
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

<div class="modal fade" id="docuAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document" >
        <div class="modal-content" >
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >添加文件</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_docu_form">
                    <input type="hidden" name="catalogId" value="${catalogId}">
                    <div class="form-group">
                        <div class="col-sm-2">
                            <span class="btn btn-primary  fileinput-button">
                                    <i class="fa fa-plus"></i>
                                    <span>上传文件</span>
                                    <input type="file" name="nFile" id="nFile">
                            </span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addDocu()">保存</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="docuReNameDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document" >
        <div class="modal-content" >
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >重命名</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="re_docu_form">
                    <input type="hidden" name="docuId" id="docuId">
                    <div class="form-group">
                        <label for="docuRealName" class="col-sm-2 control-label">文件名</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="docuRealName" id="docuRealName">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="reNameDocu()">更新</button>
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

    function addDocu() {

        var formData = new FormData($("#add_docu_form" )[0]);
        $.ajax({
            url: rootPath+"/document/uploadDocu",
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
                tb.load(rootPath + "/document/getList/?catalogId="+'${catalogId}')
            }
        })
    }

    function deleteDocu(id) {
        $.post(rootPath+"/document/deteleDocu",{"docuId":id},function (data) {
            if (data == "1"){
                alert("下架成功");
            } else{
                alert("下架失败")
            }
            var tb = $("#fileList");
            tb.load(rootPath + "/document/getList/?catalogId="+'${catalogId}')
        })
    }

    function editName(id) {
        $.post(rootPath+"/document/editDocu",{"docuId":id},function (data) {
            $("#docuId").val(data.docuId);
            $("#docuRealName").val(data.docuRealName)
        })
    }

    function reNameDocu() {
        alert($("#re_docu_form").serialize())
        $.post(rootPath+"/document/reNameDocu",$("#re_docu_form").serialize(),function (data) {
            if(data=="1"){
                alert("更新成功")
            }else{
                alert("更新失败")
            }
            var tb = $("#fileList");
            tb.load(rootPath + "/document/getList/?catalogId="+'${catalogId}')
        })
    }


</script>