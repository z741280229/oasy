function getContent(editor) {
    var arr = [];
    arr.push(UE.getEditor(editor).getContent());
    var content = arr.join("\n");
    return content;
}

function setContent(html,isAppendTo) {
    UE.getEditor('editor_edit').setContent(html,isAppendTo);
}

function deleteStaff(id) {
    if(confirm('确实要删除该员工吗?')) {
        $.post(rootPath+"/staff/delete",{"staffId":id},function(data){
            if(data == "1"){
                alert("员工信息删除成功！");
            }else{
                alert("员工信息删除失败！");
            }
            var tb = $("#loadhtml");
            tb.load(rootPath + "/staff/list")
        });
    }
}


function editstaff(id) {
    $.ajax({
        type:"post",
        url:rootPath+"/staff/edit",
        data:{"staffId":id},
        success:function(data) {
            $("#staffId").val(data.staffId);
            $("#staffName").val(data.staffName);
            $("#staffAccNum").val(data.staffAccNum)
            $("#staffGender").val(data.staffGender)
            $("#staffBirthday").val(data.staffBirthday)
            $("#staffAddress").val(data.staffAddress);
            $("#staffAge").val(data.staffAge);
            $("#staffDepart").val(data.staffDepart);
            $("#staffSal").val(data.staffSal);
            $("#staffHiredate").val(data.staffHiredate)
            $("#staffLeavedate").val(data.staffLeavedate)
            $("#staffTel").val(data.staffTel);
            $("#stmail").val(data.stmail);
            //$("#editor_edit").val(data.staffOther);
            $("#staffPosi").val(data.staffPosi);
            $("#staffStatus").val(data.staffStatus);
            $("#staffGrade").val(data.staffGrade)
            if(data.staffOther == null){
                setContent("&nbsp",false)
            }else{
                setContent(data.staffOther,false)
            }
        }
    });
}

function updateStaff() {
    $("#editor_edit").val(getContent("editor_edit"));
    $.post(rootPath+"/staff/update",$("#edit_staff_form").serialize(),function(data){
        if(data == "1"){
            alert("员工信息更新成功！");
        }else{
            alert("员工更新失败！");
        }
        var tb = $("#loadhtml");
        tb.load(rootPath + "/staff/list")
    });
    // var tb = $("#loadhtml");   //放在这里和放在上面的区别
    // tb.load(rootPath + "/staff/list")
}

function addStaff() {
    if(getContent("editor_add") == null){
        $("#editor_add").val("&nbsp")
    }else{
        $("#editor_add").val(getContent("editor_add"));
    }
    $.post(rootPath+"/staff/add",$("#add_staff_form").serialize(),function(data){
        if(data == "1"){
            alert("添加员工信息成功！");
        }else{
            alert(data);
        }
        var tb = $("#loadhtml");
        tb.load(rootPath + "/staff/list")
    });
}
