<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="vertical-box ">
    <!-- begin vertical-box-column -->
    <div class="vertical-box-column width-300">
        <!-- begin wrapper -->
        <div class="wrapper" >
            <ul class="nav nav-pills nav-stacked nav-sm timeline" style="border: solid 1px gainsboro;border-radius:5px;background: honeydew" >
                <c:forEach var="item" items="${list.myApprovals}">
                    <li style="margin: 10px">
                        <p style="margin: 0px">
                            <font size="3px">
                            <c:forEach var="key" items="${allStaffInfo}">
                                <c:if test="${item.prStaffId == key.staffId}">
                                    ${key.staffName}&emsp;${item.prTypeName}

                                </c:if>
                            </c:forEach>
                                <c:if test="${item.prStatus == 0}"><font color="#ff8c00">未审批</font></c:if>
                            <c:if test="${item.prStatus == 1}"><font color="green">通过</font></c:if>
                            <c:if test="${item.prStatus == 2}"><font color="red">未审批</font></c:if>
                            </font>
                        </p>
                        <p style="margin: 0px"><font size="3px">${item.prDealTime}</font></p>
                    </li>
                </c:forEach>

            </ul>
        </div>
        <!-- end wrapper -->
    </div>

    <div class="vertical-box-column">

        <div class="wrapper">
            <div class="p-30 bg-white">
                <table style="height: 100%" align="center" >
                    <tr>
                        <td colspan="6" align="center"><h2>入职申请单</h2></td>
                    </tr>
                    <tr style="height: 2%;" align="right">
                        <td colspan="2" style="border:none;">编号:${list.enNum}</td>
                    </tr>
                </table>

                <table style="width: 100%;height: 70%" align="center" border="1px">
                    <tr align="center">
                        <td bgcolor="#dcdcdc">姓名</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffName" value="${list.staffName}"></td>
                        <td bgcolor="#dcdcdc">性别</td>
                        <td>
                            <select style="width: 100%;height: 100%" name="staffSex">
                                <c:if test="${list.staffSex==1}">
                                    <option value="1">男</option>
                                </c:if>
                                <c:if test="${list.staffSex==0}">
                                    <option value="0">女</option>
                                </c:if>
                            </select>
                        </td>
                        <td bgcolor="#dcdcdc">入职日期</td>
                        <td>
                            <div class="input-group date" id="datepicker-disabled-past1" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffInDate" value="${list.staffInDate}"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">分配部门</td>
                        <td>

                            <select style="width: 100%;height: 100%" name="staffDepartId">
                                <c:forEach var="item" items="${depart}">
                                    <c:if test="${item.departId==list.staffDepartId}">
                                        <option>${item.departName}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </td>

                        <td bgcolor="#dcdcdc">拟聘岗位</td>
                        <td>
                            <select style="width: 100%;height: 100%" name="staffPosiId">
                                <c:forEach var="item" items="${posi}">
                                    <c:if test="${item.posiId == list.staffPosiId}">
                                        <option> ${item.posiName}</option>
                                    </c:if>

                                </c:forEach>
                            </select>
                        </td>
                        <td bgcolor="#dcdcdc">员工类型</td>
                        <td>
                            <select style="width: 100%;height: 100%"><option>请选择</option></select>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">毕业院校</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffSchool" value="${list.staffSchool}"></td>
                        <td bgcolor="#dcdcdc">学历</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffFormal" value="${list.staffFormal}"></td>
                        <td bgcolor="#dcdcdc">专业</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffMajor" value="${list.staffMajor}"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">毕业时间</td>
                        <td>
                            <div class="input-group date" id="datepicker-disabled-past2" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffGraduDate" value="${list.staffGraduDate}"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                        <td bgcolor="#dcdcdc">实习开始日</td>
                        <td>
                            <div class="input-group date"  id="datepicker-disabled-past3" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffInternshipStartDate" value="${list.staffInternshipStartDate}"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                        <td bgcolor="#dcdcdc">实用截止日</td>
                        <td>
                            <div class="input-group date" id="datepicker-disabled-past4" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffInternshipEndDate" value="${list.staffInternshipEndDate}"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">原单位</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffOringinPart" value="${list.staffOringinPart}"></td>
                        <td bgcolor="#dcdcdc">户口所在地</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffResidencePart" value="${list.staffResidencePart}"></td>
                        <td bgcolor="#dcdcdc">私人邮件</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="privateEmail" value="${list.privateEmail}"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">办公电话</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="officeTel" value="${list.officeTel}"></td>
                        <td bgcolor="#dcdcdc">移动电话</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="mobilePhone" value="${list.mobilePhone}"></td>
                        <td bgcolor="#dcdcdc">公司邮件</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="companyEmail" value="${list.companyEmail}"></td>
                    </tr>



                    <tr align="center" >
                        <td bgcolor="#dcdcdc">住址</td>
                        <td colspan="5"><input type="text" style="width: 100%;height: 100%" name="staffNowPart" value="${list.staffNowPart}"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">准备</td>
                        <td colspan="2">
                            工号：<input type="text" name="staffNum" value="${list.staffNum}">
                        </td>
                        <td colspan="3">
                            OA账号：<input type="text" name="oaNum" value="${list.oaNum}">
                        </td>
                    </tr>

                    <tr align="center">
                        <td bgcolor="#dcdcdc">个人简介</td>
                        <td colspan="5">${list.personalProfile}</td>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">成本信息</td>
                        <td colspan="5">
                            <table style="width: 100%;height: 100%" border="1px">
                                <tr>
                                    <td>工资开户行</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="staffBankName" value="${list.staffBankName}"></td>
                                    <td>工资账号</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="staffBankNum" value="${list.staffBankNum}"></td>
                                </tr>
                                <tr>
                                    <td>社保缴纳地</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="socialInsurancePart" value="${list.socialInsurancePart}"></td>
                                    <td>社保号</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="socialInsuranceNum" value="${list.socialInsuranceNum}"></td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <c:if test="${list.staffSignType == 0}">
                                            <input type="radio" value="0" name="staffSignType" checked>劳动合同/保密协议书
                                            <input type="radio" value="1" name="staffSignType">签字的《公司员工手册》
                                        </c:if>
                                        <c:if test="${list.staffSignType == 1}">
                                            <input type="radio" value="0" name="staffSignType" >劳动合同/保密协议书
                                            <input type="radio" value="1" name="staffSignType" checked>签字的《公司员工手册》
                                        </c:if>

                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr align="center" >
                        <td bgcolor="#dcdcdc">审批人意见</td>
                        <td colspan="7">
                            <input type="text" style="height: 100%;width: 100%" value="${list.enOpinion}" id="enOpinion">
                        </td>
                    </tr>
                </table>
                <table style="width: 80%" align="center">
                    <tr align="right" >
                        <td colspan="8">
                            <button type="button" class="btn btn-success m-r-5 m-b-5" onclick="dealStatus('${1}')">同意</button>
                            <button type="button" class="btn btn-success m-r-5 m-b-5" onclick="dealStatus('${2}')">不同意</button>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>

</div>

<script type="text/javascript">
    function dealStatus(result) {
        var enId = '${list.enId}'
        var en = $("#enOpinion").val()
        $.post(rootPath+"/approval/dealApp",{enId:enId,myapId:'${myapId}',result:result,enOpinion:en},function (data) {
            if (data == "1"){
                alert("处理成功");
            } else {
                alert("处理失败")
            }
        })
    }
</script>

<script>
    Timeline.init();
</script>

