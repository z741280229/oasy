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
                <form id="entry_form">
                <table style="width: 80%;" align="center" >
                    <tr>
                        <td colspan="6" align="center"><h2>入职申请单</h2></td>
                    </tr>
                    <tr style="height: 2%">
                        <td colspan="2" style="border:none">编号</td>
                    </tr>
                </table>

                <table style="width: 80%;height: 70%" align="center" border="1px">
                    <tr align="center">
                        <td bgcolor="#dcdcdc">姓名</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffName"></td>
                        <td bgcolor="#dcdcdc">性别</td>
                        <td>
                            <select style="width: 100%;height: 100%" name="staffSex">
                                <option value="1">男</option>
                                <option value="0">女</option>
                            </select>
                        </td>
                        <td bgcolor="#dcdcdc">入职日期</td>
                        <td>
                            <div class="input-group date" id="datepicker-disabled-past1" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffInDate"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">分配部门</td>
                        <td>

                            <select style="width: 100%;height: 100%" name="staffDepartId">
                                <c:forEach var="item" items="${allDepartments}">
                                    <option value="${item.departId}">${item.departName}</option>
                                </c:forEach>
                            </select>
                        </td>

                        <td bgcolor="#dcdcdc">拟聘岗位</td>
                        <td>
                            <select style="width: 100%;height: 100%" name="staffPosiId">
                                <c:forEach var="item" items="${allPosi}">
                                    <option value="${item.posiId}">${item.posiName}</option>
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
                        <td><input type="text" style="width: 100%;height: 100%" name="staffSchool"></td>
                        <td bgcolor="#dcdcdc">学历</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffFormal"></td>
                        <td bgcolor="#dcdcdc">专业</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffMajor"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">毕业时间</td>
                        <td>
                            <div class="input-group date" id="datepicker-disabled-past2" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffGraduDate"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                        <td bgcolor="#dcdcdc">实习开始日</td>
                        <td>
                            <div class="input-group date"  id="datepicker-disabled-past3" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffInternshipStartDate"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                        <td bgcolor="#dcdcdc">实用截止日</td>
                        <td>
                            <div class="input-group date" id="datepicker-disabled-past4" data-date-format="yyyy-mm-dd" data-date-start-date="Date.default" style="width: 100%;height: 100%">
                                <input type="text" style="height: 100%;width: 100%" name="staffInternshipEndDate"/>
                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                            </div>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">原单位</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffOringinPart"></td>
                        <td bgcolor="#dcdcdc">户口所在地</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="staffResidencePart"></td>
                        <td bgcolor="#dcdcdc">私人邮件</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="privateEmail"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">办公电话</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="officeTel"></td>
                        <td bgcolor="#dcdcdc">移动电话</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="mobilePhone"></td>
                        <td bgcolor="#dcdcdc">公司邮件</td>
                        <td><input type="text" style="width: 100%;height: 100%" name="companyEmail"></td>
                    </tr>



                    <tr align="center" >
                        <td bgcolor="#dcdcdc">住址</td>
                        <td colspan="5"><input type="text" style="width: 100%;height: 100%" name="staffNowPart"></td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">准备</td>
                        <td colspan="2">
                            工号：<input type="text" name="staffNum">
                        </td>
                        <td colspan="3">
                            OA账号：<input type="text" name="oaNum">
                        </td>
                    </tr>

                    <tr align="center">
                        <td bgcolor="#dcdcdc">个人简介</td>
                        <td colspan="5"><textarea style="height: 100%;width: 100%" name="personalProfile"></textarea></td>
                        </td>
                    </tr>

                    <tr align="center" >
                        <td bgcolor="#dcdcdc">成本信息</td>
                        <td colspan="5">
                            <table style="width: 100%;height: 100%" border="1px">
                                <tr>
                                    <td>工资开户行</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="staffBankName"></td>
                                    <td>工资账号</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="staffBankNum"></td>
                                </tr>
                                <tr>
                                    <td>社保缴纳地</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="socialInsurancePart"></td>
                                    <td>社保号</td>
                                    <td><input type="text" style="width: 100%;height: 100%" name="socialInsuranceNum"></td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <input type="radio" value="0" name="staffSignType">劳动合同/保密协议书
                                        <input type="radio" value="1" name="staffSignType">签字的《公司员工手册》
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr align="center" >
                        <td bgcolor="#dcdcdc">审批人意见</td>
                        <td colspan="7"><textarea style="height: 100%;width: 100%" name="enOpinion"></textarea></td>
                    </tr>

                    <input type="hidden" value="${typeId}" name="prId">

                </table>


                <table style="width: 80%" align="center">
                    <tr align="right" >
                        <td colspan="8" ><input type="button" class="btn btn-primary" onclick="addEntry()" value="提交"/></td>
                    </tr>
                </table>
                </form>
            </div>

        </div>
        <!-- end panel -->
    </div>
    <!-- end col-12 -->
</div>
<!-- end row -->

<script>
    $(document).ready(function() {
        FormPlugins.init();
    });
</script>

<script type="text/javascript">
    function addEntry() {
        $.post(rootPath+"/approval/addEntry",$("#entry_form").serialize(),function (data) {
            if(data == "1"){
                alert("提交成功")
            }else {
                alert("提交失败")
            }
        })
    }
</script>
