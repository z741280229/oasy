<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style>
    .st_tree {
        padding: 0px;
    }

    /* 超链接 */
    .st_tree a {
        text-decoration: none;
    }

    /* 鼠标经过的超链接 */
    .st_tree a:hover {
        color: #f33;
        text-decoration: underline;
    }

    /* 菜单 */
    .st_tree ul {
        padding: 0 10px;
        margin: 0;
    }

    /* 菜单项 */
    .st_tree ul li {
        font-size: 13px;
        color: #222;
        line-height: 18px;
        cursor: pointer;
        list-style: none;
        background: url(${ctx}/oasy/imgs/st_node.gif);
        background-repeat: no-repeat;
        padding: 0 0 3px 20px;
    }

    /* 子菜单 */
    .st_tree ul li ul {
    }

    /* 子菜单项 */
    .st_tree ul li ul li {
    }

    /* 子菜单的父节点 */
    .st_tree .folder {
        list-style-image: url(${ctx}/oasy/imgs/st_icon.png);
        background: url(${ctx}/oasy/imgs/st_folder.gif);
        background-repeat: no-repeat;
        padding: 0 0 0 15px;
    }

    /* 展开的父节点 */
    .st_tree .open {
        list-style-image: url(${ctx}/oasy/imgs/st_icon_open.png);
        background: url(${ctx}/oasy/imgs/st_folder_open.gif);
        background-repeat: no-repeat;
        padding: 0 0 0 15px;
    }
</style>
<ul>
    <c:forEach items="${catalog}" var="item">
        <li>
            <a href="#" onclick="getList('${item.catId}')">${item.catalogName}</a>
            &emsp;&emsp;
            <a href="#" class="email-btn" data-click="email-highlight" data-toggle="modal" data-target="#catEditDialog" onclick="editName('${item.catId}')"><i class="fa fa-edit"></i></a>
            <a href="#" class="email-btn" data-click="email-remove" onclick="deleteCatalog('${item.catId}')"><i class="fa fa-trash-o"></i></a>
        </li>
        <ul></ul>
    </c:forEach>
</ul>

<!-- 重命名对话框 -->
<div class="modal fade" id="catEditDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" >重命名</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="re_cat_form">
                    <input type="hidden" name="catId" id="catId">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">目录名</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" placeholder="目录名" name="catalogName" id="catName">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" onclick="reNameCat()">修改</button>
            </div>
        </div>
    </div>
</div>


<script>
    // AppCat.init();
    function getList(id) {
        var tb = $("#fileList");
        tb.load(rootPath + "/document/getList/?catalogId="+id)
    }

    function deleteCatalog(id) {
        if (confirm('确实要删除该目录吗?')){
            $.post(rootPath+"/document/deleteCat",{"catId":id},function (data) {
                if (data == "1"){
                    alert("删除成功");
                } else {
                    alert("删除失败")
                }
                var t = $("#catalog");
                t.load(rootPath+"/document/catalog/?distinguish="+'${distinguish}')
            })

        }
    }
    function editName(id) {
        $.post(rootPath+"/document/editCatName",{"catId":id}, function (data) {
            $("#catId").val(data.catId);
            $("#catName").val(data.catalogName);
        })
    }

    function reNameCat() {
        $.post(rootPath+"/document/reNameCat",$("#re_cat_form").serialize(), function (data) {
            if (data == "1"){
                alert("修改成功");
            } else {
                alert("修改失败")
            }
            <%--var t = $("#catalog");--%>
            <%--t.load(rootPath+"/document/catalog/?distinguish="+'${distinguish}')--%>
            var t = $("#loadhtml");
            t.load(rootPath+"/document/list/?distinguish="+'${distinguish}')
        })
    }
</script>
<script type="text/javascript">
    $(function () {
        $.fn.extend({
            SimpleTree: function (options) {
                var option = $.extend({
                    click: function (a) {
                    }
                }, options);
                option.tree = this;	/* 在参数对象中添加对当前菜单树的引用，以便在对象中使用该菜单树 */
                option._init = function () {
                    this.tree.find("ul ul").hide();	/* 隐藏所有子级菜单 */
                    this.tree.find("ul ul").prev("li").removeClass("open");	/* 移除所有子级菜单父节点的 open 样式 */

                    this.tree.find("ul ul[show='true']").show();	/* 显示 show 属性为 true 的子级菜单 */
                    this.tree.find("ul ul[show='true']").prev("li").addClass("open");	/* 添加 show 属性为 true 的子级菜单父节点的 open 样式 */
                }/* option._init() End */

                this.find("a").click(function () {
                    $(this).parent("li").click();
                    return false;
                });

                this.find("li").click(function () {
                    option.click($(this).find("a")[0]);
                    if ($(this).next("ul").attr("show") == "true") {
                        $(this).next("ul").attr("show", "false");
                    } else {
                        $(this).next("ul").attr("show", "true");
                    }
                    option._init();
                });
                this.find("ul").prev("li").addClass("folder");
                this.find("li").find("a").attr("hasChild", false);
                this.find("ul").prev("li").find("a").attr("hasChild", true);
                option._init();
            }
        });
    });
</script>
<script>
    $(function () {
        $(".st_tree").SimpleTree({
            click: function (a) {
                if (!$(a).attr("hasChild"))
                    alert($(a).attr("ref"));
            }
        });
    });
</script>




