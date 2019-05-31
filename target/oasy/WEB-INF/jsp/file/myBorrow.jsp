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
                <table id="data-table" class="table table-striped table-bordered">
                    <thead>
                    <tr>
                        <th>档案编号</th>
                        <th>档案命</th>
                        <th>借阅者</th>
                        <th>应还时间</th>
                        <th>归还时间</th>
                        <th>归还状态</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="key" items="${myAll}">
                        <tr class="gradeA">
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