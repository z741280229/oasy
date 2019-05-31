<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="vertical-box">
    <div class="vertical-box-column width-200">
        <div class="vertical-box" style="margin: 15px;float: left">
            <div class="wrapper bg-black-darker text-white" style="height: 40px">
               档案目录
            </div>
            <div class="vertical-box-row bg-white text-white">
                <div class="vertical-box-cell">
                    <div class="vertical-box-inner-cell">
                        <div data-scrollbar="true" data-height="100%" class="wrapper">
                                <a href="#" class="btn btn-xs btn-inverse" data-toggle="modal" data-target="#catAddDialog"><i class="fa fa-plus m-r-5"></i>新建文件夹</a>
                            <div class="st_tree" id="catalog"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="vertical-box-column">
        <div class="vertical-box">
            <div class="vertical-box-row">
                <div class="vertical-box-cell">
                    <div class="vertical-box-inner-cell">
                        <div data-scrollbar="true" data-height="100%" class="wrapper">
                            <div class="row" id="fileList"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 新建文件夹对话框 -->
<div class="modal fade" id="catAddDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >新建文件夹</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="add_cat_form">
                    <input type="hidden" name="distinguish" value="${distinguish}">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">目录名</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="目录名" name="catalogName">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="addCatalog()">添加</button>
            </div>
        </div>
    </div>
</div>



<script type="text/javascript">
    $(document).ready(function() {
        var cat = $("#catalog");
        cat.load(rootPath + "/file/catalog/?distinguish="+'${distinguish}')

        var tb = $("#fileList");
        tb.load(rootPath + "/file/details")
    });
</script>
<script>
    function addCatalog() {
        $.post(rootPath+"/document/addCat",$("#add_cat_form").serialize(),function (data) {
            if (data == "1"){
                alert("添加成功")
            } else{
                alert("添加失败");
            }
            var cat = $("#loadhtml");
            cat.load(rootPath + "/file/list/?distinguish="+'${distinguish}')
        })
    }
</script>



