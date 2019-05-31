<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin col-12 -->
<div class="col-md-12">
    <!-- begin panel -->
    <div class="panel panel-inverse">
        <div class="panel-heading">
            <h4 class="panel-title">出勤记录</h4>
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>序号</th>
                        <th>上班时间</th>
                        <th>签到时间</th>
                        <th>签到状态</th>
                        <th>下班时间</th>
                        <th>签退时间</th>
                        <th>签退状态</th>
                        <th>备注</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${record}" varStatus="count">
                        <tr class="gradeA">
                            <td>${count.index + 1}</td>
                            <td>${key.startWorkTime}</td>
                            <td>${key.checkInTime}</td>
                            <td>
                                <c:if test="${key.checkInStatus == 1}">签到成功</c:if>
                                <c:if test="${key.checkInStatus == 0}"><font style="color: red">未签到<font></c:if>
                            </td>

                            <td>${key.endWorkTime}</td>
                            <td>${key.signingTime}</td>
                            <td>
                                <c:if test="${key.signingStatus == 1}">签退成功</c:if>
                                <c:if test="${key.signingStatus == 0}"><font style="color: red">未签退<font></c:if>
                            </td>
                            <td>
                                ${key.other}
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

<script>
    $(document).ready(function() {
        TableManageDefault.init();
        FormPlugins.init();
    });
</script>

