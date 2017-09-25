<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/001.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户信息添加</title>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/back.js"></script>  
<script type="text/javascript" src="js/jquery.validate.min.js"></script>  
<script type="text/javascript" src="js/messages_zh.js"></script> 
<script>

$().ready(function() {
	// 在键盘按下并释放及提交后验证提交表单
	  $("#mainform").validate({
		  rules: {
			  khzah: "required",
	    	mname: "required",
	    	mstandard: "required"
	     
	    },
	    messages: {
	    	khzah: "客户专案号不能为空！",
	    	mname: "机种名称不能为空！",
	    	mstandard:"测试标准不能为空！"
	    }
	});
});
</script>
<style>
.error{
	color:red;
}
</style>
</head>
<body>
<h2>测试信息添加</h2>
<hr>
<form action="/machine.test/CSRTEST_DoInsertServlet" method="post" name="mainform" id="mainform" class="form" >
				<div class="current">当前位置:内容列表</div>
					<table  class="gridtable" >
					<tr>
							<td colspan="2">项目</td>
							<td colspan="2">填入数据</td>
						</tr>
						<tr>
							<td colspan="2">客户专案号：</td>
							<td colspan="2"><input type="text" name="khzah" /></td>
						</tr>
						<tr>
							<td colspan="2">机种名称：</td>
							<td colspan="2"><input type="text" name="mname" /></td>
						</tr>
							<tr>
							<td colspan="2">测试标准：</td>
							<td colspan="2"><input type="text" name="mstandard"></td>
						</tr>
						<tr>
							<td colspan="4"><input type="submit" name="submit" value="提交" /></td>
						</tr>	
						</table>
						</form>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="btn03" href="/machine.test/CSRTEST_ToAllServlet" >返回</a><br>
						<a color="red" > ${msg}</a>		

</body>
</html>