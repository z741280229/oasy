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
                </h2>
            </div>
            <table id="data-table" class="table table-email">
                <thead>
                <tr>
                    <th>序号</th>
                    <th>主题</th>
                    <th>申请时间</th>
                    <th>流水号</th>
                    <th>处理状态</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="key" items="${mylist}" varStatus="status">
                    <tr>
                        <td class="email-select">${status.index+1}</td>
                        <td class="email-subject">
                            <a href="#" class="btn-link m-b-5" onclick="getAppDetails('${key.apId}','${key.myapId}')">${key.entryWithBLOBs.enName}-${key.prTypeName}</a>
                        </td>
                        <td class="email-sender">${key.entryWithBLOBs.enDate}</td>
                        <td class="email-date">${key.entryWithBLOBs.enNum}</td>
                        <td class="email-date">
                            <c:if test="${key.prStatus==0}"><font color="#ff8c00">未审批</font></c:if>
                            <c:if test="${key.prStatus==1}"><font color="green">以审批</font></c:if>
                            <c:if test="${key.prStatus==2}"><font color="red">已驳回</font></c:if>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <!-- end row -->
    </div>
</div>

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
        Inbox.init();
    });
</script>

<script>
    function getAppDetails(id,myapId) {
        var tb = $("#loadhtml");
        tb.load(rootPath + "/approval/entryById/?enId="+id+"&myapId="+myapId)
    }
</script>


