<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ page import="java.util.*"%>
<%String path = request.getContextPath();%>
<% String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/maindiv.css" />
	<link rel="stylesheet" href="css/001.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>信息修改</h1>
<hr>
<div id="khxxall">
		<div id="allright">
			<h3 align="left">客户信息展示</h3>
			<form action="CSRTEST_UpdateServlet">
				<table class="gridtable">
					<tr>
			    <th>序号</th>
			    <th>客户专案号</th>
			    <th>仪器名称</th>
			    <th>测试标准</th>
			    <th>操作</th>
			    </tr>
			     <c:forEach items="${listcsr}" var="item" varStatus="status">
			     <tr>
			    	<td><input type="text" readonly="true" value="${item.id}"  name="csrid"></td>
			    	<td><input type="text"  value="${item.khzah}"  name="csrkhzah"></td>
			    	<td><input type="text"  value="${item.mname}"  name="csrmname"></td>
			    	<td><input type="text"  value="${item.mstandard}"  name="mstandard"></td>
			    	<td>
			    	<input type="submit" value="提交">
			    	</td>
			    </tr>
			    </c:forEach>
				</table>
				
			</form>
		</div>
		<div id="allleft">
		<form action="CSRTEST_UpdateServlet">
			<h3 align="left">测试信息展示</h3>
			<table class="gridtable">
					<tr>
			    <th>序号</th>
			    <th>产线名称</th>
			    <th>测试仪器</th>
			     <th>操作</th>
			    </tr>
			      <c:forEach items="${listtest}" var="item" varStatus="status">
			    <tr>
			    	<td><input type="text"  readonly="true" value="${item.id }" name="testid"></td>
			    	<td><input type="text"  value="${item.pline}" name="testpline"></td>
			    	<td><input type="text"  value="${item.testm}" name="testtestm"></td>
			    	<td>
			    	<input type="submit" value="提交">
			    	</td>
			    </tr>
			    </c:forEach>
			</table>
			</form>
		</div>
		</div>
</body>
</html>