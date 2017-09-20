<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/001.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>测试信息添加</title>
</head>
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
							<td colspan="2">产线名称：</td>
							<td colspan="2"><input type="text" name="pline" /></td>
						</tr>
						<tr>
							<td colspan="2">测试仪器：</td>
							<td colspan="2"><input type="text" name="testm" /></td>
						</tr>
						<tr>
							<td colspan="4"><input type="submit" name="submit" value="提交" /></td>
						</tr>	
						</table>
						</form>

</body>
</html>