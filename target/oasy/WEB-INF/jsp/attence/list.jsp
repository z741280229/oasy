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
                        <th>工号</th>
                        <th>姓名</th>
                        <th>部门</th>
                        <th>应签到（月）</th>
                        <th>实际签到（月）</th>
                        <th>应签退（月）</th>
                        <th>实际签退（月）</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${list}" varStatus="count">
                        <tr class="gradeA">
                            <td>${count.index + 1}</td>
                            <td>${key.staffNum}</td>
                            <td>${key.staffName}</td>
                            <td>
                                <c:forEach var="item" items="${departs}">
                                    <c:if test="${key.staffDepart == item.departId}">
                                        ${item.departName}
                                    </c:if>
                                </c:forEach>
                            </td>

                            <td>${key.factCheckIn + key.notCheckIn}</td>
                            <td>${key.factCheckIn}</td>
                            <td>${key.factSigning + key.notSigning}</td>
                            <td>${key.factSigning}</td>
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

