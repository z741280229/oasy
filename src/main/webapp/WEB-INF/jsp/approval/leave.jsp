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
                <table style="width: 80%;" align="center">
                    <tr>
                        <td colspan="8" align="center"><h2>请假申请单</h2></td>
                    </tr>
                    <tr style="height: 2%">
                        <td colspan="4" style="border:none">编号</td>
                        <td colspan="4" style="border:none;" align="right">申请日期:<input type="date"/></td>
                    </tr>
                </table>
                <table style="width: 80%;height: 55%" align="center" border="1px">
                    <tr align="center" style="height: 10%">
                        <td bgcolor="#dcdcdc">申请人</td>
                        <td>管理员</td>
                        <td bgcolor="#dcdcdc">部门</td>
                        <td>办公室</td>
                        <td bgcolor="#dcdcdc">岗位</td>
                        <td>管理者</td>
                        <td bgcolor="#dcdcdc">工号</td>
                        <td>F00001</td>
                    </tr>
                    <tr align="center" style="height: 10%">
                        <td bgcolor="#dcdcdc">请假类型</td>
                        <td>
                            <select style="width: 100%">
                                <option>请选择</option>
                            </select>
                        </td>
                        <td colspan="6"></td>
                    </tr>
                    <tr align="center" style="height: 10%">
                        <td bgcolor="#dcdcdc">请假时间</td>
                        <td colspan="7" align="left">
                            <input type="date"/>
                            <span>-</span>
                            <input type="date"/>
                        </td>

                    </tr>
                    <tr align="center" style="height: 35%">
                        <td bgcolor="#dcdcdc">事由</td>
                        <td colspan="7"><textarea style="height: 100%;width: 100%"></textarea></td>
                    </tr>
                    <tr align="center" style="height: 35%">
                        <td bgcolor="#dcdcdc">审批意见</td>
                        <td colspan="7"><textarea style="height: 100%;width: 100%"></textarea></td>
                    </tr>
                </table>
                <table style="width: 80%" align="center">
                    <tr align="right" >
                        <td colspan="8" ><input type="button" class="btn btn-primary" value="提交"/></td>
                    </tr>
                </table>
            </div>
        </div>
        <!-- end panel -->
    </div>
    <!-- end col-12 -->
</div>
<!-- end row -->
