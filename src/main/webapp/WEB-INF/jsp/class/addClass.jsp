<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>




<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<script type="text/javascript" src="../js/jquery11.js"></script>
<script type="text/javascript">
$(function(){
	$("#classtypeid").load("../getState/5/3");
	$("#teachertypeid").load("../getTeacher/1/1");
	$("#guideid1").load("../getGuide/1/1");
	$("#guideid2").load("../getGuide/1/1");
	
	//提交表单
	$("#btn_submit").click(function(){
		var flag=confirm("请确认提交");
		if(flag){
			$("form").submit();
		}
		
	})
})
</script>

<!--
<script type="text/javascript">
	$(function() {
		$("#teacherId").load("../teacher/getAllforGson");
		$("#classGuideId").load("../guide/getClassGuidesforGson");
		$("#jobGuideId").load("../guide/getJobGuidesforGson");
	
		$("#classTypeId").load("../common/getStatesById", {
			type : 5,
			stateId:0
		});
		$("#btn_submit").click(function(){
			if($("#txt_className").val().length<5){
				$("#span_className").html("班级名称不合法".fontcolor("red"));
				return;
			}else{
				$("#span_className").html("");
			}
			var reg_date=/^\w{4}-\w{1,2}-\w{1,2}$/;
			if(!reg_date.test($("#txt_createdDate").val())){
				$("#span_createdDate").html("日期格式不合法".fontcolor("red"));
				return;
			}else{
				$("#span_createdDate").html("");
			}
			$("form").submit();
		});
	});
</script>  
-->

<link href="../css/table.css" rel="stylesheet" type="text/css">

</head>
<body>
	<form action="save" method="post">
		<table border="1" align="center">
			<caption>班级信息管理</caption>
			<tr>
				<td>班号</td>
				<td><input type="text" name="classname" id="txt_className"><span id="span_className"></span></td>
				
			<tr>
			<tr>
				<td>班级类型</td>
				<td><select name="classtypeid" id="classtypeid" style="width: 100px">
				</select></td>
			<tr>
			<tr>
				<td>讲师</td>
				<td><select name="teacherid" id="teachertypeid"
					style="width: 100px"></select></td>
			<tr>
			<tr>
				<td>教务班主任</td>
				<td><select name="classGuideid" id="guideid1"
					style="width: 100px"></select></td>
			<tr>
			<tr>
				<td>就业班主任</td>
				<td><select name="jobGuideid" id="guideid2"
					style="width: 100px"></select></td>
			<tr>
			
			<tr>
				<td>开班时间</td>
				<td><input type="text" name="createddate" id="txt_createdDate"><span id="span_createdDate"></span></td>
			<tr>
			
			<tr>
				<td>备注</td>
				<td><textarea name="comment" rows="4" cols="20"></textarea></td>
			<tr>
			
			<tr align="right">
				<td colspan="2"><input type="button" value="创建" id="btn_submit"></td>
			<tr>
		</table>

	</form>
</body>
</html>