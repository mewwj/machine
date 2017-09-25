<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/001.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试信息添加</title>
</head>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/back.js"></script>  
<script type="text/javascript" src="js/jquery.validate.min.js"></script>  
<script type="text/javascript" src="js/messages_zh.js"></script> 
<script>
$().ready(function() {
	// 在键盘按下并释放及提交后验证提交表单
	  $("#mainform").validate({
		  rules: {
			testm: "required",
			pline: "required"
	    },
	    messages: {
	    	pline:"产线名称不能为空！",
	    	testm: "信息不能为空！"
	    }
	});
});
</script>
<style>
.error{
	color:red;
}
</style>
<body>
<h2>测试信息添加</h2>
<hr>

<form action="/machine.test/CSRTEST_DoInsertServlet" method="post" id="mainform" class="form" >
				<div class="current">当前位置:内容列表</div>
					<table  class="gridtable" >
					<tr>
							<td colspan="2">项目</td>
							<td colspan="2">填入数据</td>
						</tr>
						<tr>
							<td colspan="2">类别：</td>
							<td colspan="2"><select id="s1"  name="pline">
								<option selected disabled="disabled">-- 选择类别 --</option>
								  <!--默认选中-->
								  <option   value="产线名称">产线名称</option>
								  <option   value="测试仪器">测试仪器</option>
								</select></td>
						</tr>
						<tr>
							<td colspan="2">信息：</td>
							<td colspan="2"><input type="text" name="testm" /></td>
						</tr>
						<tr>
							<td colspan="4"><input type="submit" name="submit" value="提交" /></td>
						</tr>	
						</table>
						</form>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="btn03" href="/machine.test/CSRTEST_ToAllServlet" >返回</a>	
						<br><a color="red" > ${msg}</a>			

</body>
</html>