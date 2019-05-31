<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div style="width: 100%">
    <div class="p-20">
        <!-- begin row -->
        <div class="row">
            <!-- begin col-10 -->
            <div class="col-md-12" >
                <div class="email-content">
                    <div>
                        <h1 class="display-1 text-center">${details.nTitle}</h1>
                        <p class="" style="font-size: medium">
                            <strong>发件人:${details.nSenderName}</strong>&emsp;
                            <strong>时间:${details.nSendTime}</strong>&emsp;
                            <strong>类型:${details.nTypeName}</strong>&emsp;
                            <a href="#" class="btn-link m-b-5" id="_return">返回上一级</a>
                        </p>
                    </div>


                    <hr />
                    <div style="height: 100%">
                        ${details.nSendContent}
                    </div>
                    <div class="email-footer clearfix">
                        <form action="${pageContext.request.contextPath }/nan/download" method="post">
                            <input type="hidden" name="fileName" value="${details.nFileNumName}">
                            <input type="hidden" name="fileType" id="${details.nTypeName}">
                            <input type="hidden" name="fileRealName" id="${details.nFileRealName}">
                            附件:<input type="submit" value="${details.nFileRealName}" class="btn btn-link m-b-5">
                        </form>
                    </div>
                </div>
            </div>
            <!-- end col-10 -->
        </div>
        <!-- end row -->
    </div>
</div>

<script type="text/javascript">
    $("#_return").click(function () {
        var tb = $("#loadhtml");
        tb.load(rootPath + "/nan/getAll/?distinguish="+'${details.nDistinguish}')
    })
</script>
