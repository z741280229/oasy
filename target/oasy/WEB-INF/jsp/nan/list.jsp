<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<div style="width: 100%">
    <div class="p-20">
        <!-- begin row -->
        <div class="row email-content">
            <div class="col-md-12" style="margin-bottom:5px">
                <h2 class="text-center">
                    <c:if test="${distinguish==1}">
                        通知公告
                    </c:if>
                    <c:if test="${distinguish==0}">
                        新闻
                    </c:if>
                </h2>
            </div>


            <div class="col-sm-1">
                <a href="#" class="btn btn-sm btn-inverse" data-toggle="modal" data-target="#nanAddDialog"><i class="fa fa-plus m-r-5"></i>新建</a>
            </div>

                <table id="data-table" class="table table-email">
                    <thead>
                        <tr>
                            <th class="email-select"><a href="email_inbox.html#" data-click="email-select-all"><i class="fa fa-square-o fa-fw"></i></a></th>
                            <th>发送者</th>
                            <th>内容</th>
                            <th>时间</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${allNoticeAndNews}">
                        <tr>
                            <td class="email-select"><a href="email_inbox.html#" data-click="email-select-single"><i class="fa fa-square-o fa-fw"></i></a></td>
                            <td class="email-sender">${key.nSenderName}</td>
                            <td class="email-subject">
                                <%--<a href="#" class="email-btn" data-click="email-archive"><i class="fa fa-folder-open"></i></a>--%>
                                <a href="#" class="email-btn" data-click="email-remove" onclick="deleteNaN('${key.nId}')"><i class="fa fa-trash-o"></i></a>
                                <a href="#" class="email-btn" data-click="email-highlight" data-toggle="modal" data-target="#nanEditDialog" onclick="editNaN('${key.nId}')"><i class="fa fa-edit"></i></a>
                                <a href="#" class="btn-link m-b-5" onclick="getNanDetails('${key.nId}')">${key.nTitle}</a>
                            </td>
                            <td class="email-date">
                                    ${key.nSendTime}
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
        </div>
        <!-- end row -->
    </div>
</div>




<!-- 消息编辑对话框 -->
<div class="modal fade" id="nanEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">修改消息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="edit_nan_form">
                    <input type="hidden" name="nId" id="nId">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">主题</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" id="nTitle" placeholder="主题" name="nTitle">
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">类别</label>
                        <div class="col-sm-2">
                            <select	class="form-control"  placeholder="类别" name="nType" id="nType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${types}" var="item">
                                    <option value="${item.dictId}" <c:if test="${item.dictId == nType}"> selected</c:if> >${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-sm-2">
                            <span class="btn btn-primary  fileinput-button">
                                    <i class="fa fa-plus"></i>
                                    <span>重新上传</span>
                                    <input type="file" name="nFile">
                            </span>

                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">内容</label>
                        <div class="col-sm-10">
                            <textarea id="editor_edit" style="width: 100%;height: 150px" name="nSendContent"></textarea>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="updateNaN()">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->


<!-- 消息添加对话框 -->
<div class="modal fade" id="nanAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" style="overflow:auto">
    <div class="modal-dialog" role="document" >
        <div class="modal-content" style="width: 850px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >添加消息发布</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_nan_form">
                    <input type="hidden" name="distinguish" value="${distinguish}">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">主题</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="主题" name="nTitle">
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">类别</label>
                        <div class="col-sm-2">
                            <select	class="form-control"  placeholder="类别" name="nType">
                                <option value="">--请选择--</option>
                                <c:forEach items="${types}" var="item">
                                    <option value="${item.dictId}" <c:if test="${item.dictId == nType}"> selected</c:if> >${item.dictTypeDetails }</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="col-sm-2">
                            <span class="btn btn-primary  fileinput-button">
                                    <i class="fa fa-plus"></i>
                                    <span>上传文件</span>
                                    <input type="file" name="nFile" id="nFile">
                            </span>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label">内容</label>
                        <div class="col-sm-10">
                            <textarea id="editor_add" style="width: 100%;height: 150px" name="nSendContent"></textarea>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addNaN()">保存</button>
            </div>
        </div>
    </div>
</div>
<!-- /#wrapper -->

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
        Inbox.init();
        UE.delEditor('editor_add');
        var ue1 = UE.getEditor('editor_add');

        UE.delEditor('editor_edit');
        var ue2 = UE.getEditor('editor_edit');
    });
</script>

<script>
    function addNaN() {
        if(getContent("editor_add") == null){
            $("#editor_add").val("&nbsp")
        }else{
            $("#editor_add").val(getContent("editor_add"));
        }
        var formData = new FormData($("#add_nan_form" )[0]);
        $.ajax({
            url: rootPath+"/nan/add",
            type: 'POST',
            data:formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data == "1"){
                    alert("发布成功！");
                }else{
                    alert("发布失败");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/nan/getAll/?distinguish="+'${distinguish}')
            }
        });
    }


    function deleteNaN(id) {
        $.post(rootPath+"/nan/delete",{"nId":id})
    }

    function getNanDetails(id) {
        var tb = $("#loadhtml");
        tb.load(rootPath + "/nan/details/?nId="+id)
    }

    function editNaN(id) {
        $.ajax({
            type:"post",
            url:rootPath+"/nan/edit",
            data:{"nId":id},
            success:function(data) {
                $("#nId").val(data.nId);
                $("#nTitle").val(data.nTitle);
                $("#nType").val(data.nType);
                if(data.nSendContent == null){
                    setContent("&nbsp",false)
                }else{
                    setContent(data.nSendContent,false)
                }
            }
        });
    }

    function updateNaN() {
        $("#editor_edit").val(getContent("editor_edit"));
        var formData = new FormData($("#edit_nan_form" )[0]);
        $.ajax({
            url: rootPath+"/nan/update",
            type: 'POST',
            data:formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data == "1"){
                    alert("修改成功！");
                }else{
                    alert("修改失败");
                }
                var tb = $("#loadhtml");
                tb.load(rootPath + "/nan/getAll/?distinguish="+'${distinguish}')
            }
        });
    }


    function getContent(editor) {
        var arr = [];
        arr.push(UE.getEditor(editor).getContent());
        var content = arr.join("\n");
        return content;
    }

    function setContent(html,isAppendTo) {
        UE.getEditor('editor_edit').setContent(html,isAppendTo);
    }

</script>
