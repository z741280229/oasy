<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- begin row -->
<div class="row">
    <!-- begin col-12 -->
    <div class="col-md-12">
        <!-- begin panel -->
        <div class="panel panel-inverse">
            <div class="panel-heading">
                <h4 class="panel-title">起草审批</h4>
            </div>
            <div class="panel-body">
                    <div id="wizard">
                        <ol>
                        <c:forEach items="${parents}" var="key">
                                <li>${key.alTitle}</li>
                        </c:forEach>
                        </ol>
                        <!-- begin wizard step-1 -->
                        <c:forEach items="${parents}" var="key">
                        <div>
                            <fieldset>
                                <!-- begin row -->
                                <div class="row" >
                                    <c:forEach items="${key.subs}" var="sub">
                                        <div class="col-md-2">
                                            <a href="#" onclick="toAppJsp('${sub.alLink}','${sub.alType}')"><img src="${ctx}/oasy/${sub.alImg}" style="width:78px;height: 78px"></a>
                                            <p style="width: 100%;"><font size="3px">${sub.alTitle}</font></p>
                                        </div>
                                    </c:forEach>
                                </div>
                                <!-- end row -->
                            </fieldset>
                        </div>
                        </c:forEach>
                    </div>
            </div>
        </div>
        <!-- end panel -->
    </div>
    <!-- end col-12 -->
</div>
<!-- end row -->



<script>
    $(document).ready(function() {
        FormWizard.init();
    });
</script>

<script type="text/javascript">
    function toAppJsp(name,typeId) {
        var tb = $("#loadhtml");
        //tb.load(rootPath + "/approval/toJsp")
        tb.load(rootPath + "/approval/toJsp/?linkName="+name+"&typeId="+typeId)
    }
</script>