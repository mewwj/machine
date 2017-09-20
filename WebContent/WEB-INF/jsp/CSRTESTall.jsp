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
   <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="js/backlist.js"></script>  
	<link rel="stylesheet" href="css/maindiv.css" />
	<link rel="stylesheet" href="css/001.css" />
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>信息展示</title>
		</head>
		<body>
		<script >
		
		
		</script>
		<h1>信息展示</h1>
		<hr />
		<div id="khxxall">
		<div id="allright">
			<h3 align="left">客户信息展示</h3>
			<form action="" id="testmainForm" method="post">
			         <p><a class="btn03" href="/machine.test/CSRTEST_ToInsertServlet?id=1" >新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;
			         <a class="btn03" href="javascript:deleteBatchtest('<%=basePath%>')"  onclick="alert()">删 除</a></p>
				<table class="gridtable">
					<tr>
			    <th>选择</th>
			    <th>序号</th>
			    <th>产线名称</th>
			    <th>机种名称</th>
			    <th>订单号码</th>
			    </tr>
			     <c:forEach items="${infolist2}" var="item" varStatus="status">
			    <tr>
			    	<td><input type="checkbox" name="idcsr"  value="${item.id}"/></td>
			    	<td>${item.mstandard }</td>
			    	<td>${item.khzah }</td>
			    	<td>${item.mname }</td>
			    	<td>
			    	<a href="${basepath}CSRTEST_SelectOneServlet?idcsr=${item.id}">修改</a>&nbsp;&nbsp;&nbsp;
					<a href="${basepath}CSRTEST_DeleteOneServlet?idcsr=${item.id}" onclick="confirmdelete();" >删除</a>
			    	</td>
			    </tr>
			    </c:forEach>
				</table>
				
			</form>
			
		</div>
		<div id="allleft">
			<h3 align="left">测试信息展示</h3>
		<form action="" id="csrmainForm" method="post">
		 <p><a class="btn03" href="/machine.test/CSRTEST_ToInsertServlet?id=2" >新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;
		 <a class="btn03" href="javascript:deleteBatchcsr('<%=basePath%>')"   >删 除</a></p>
			<table class="gridtable">
					<tr>
			    <th><input type="checkbox" id="selectallcsr" onclick="allSelectcsr()"/></th>
			    <th>序号</th>
			    <th>产线名称</th>
			    <th>机种名称</th>
			    <th>操作</th>
			    </tr>
			      <c:forEach items="${infolist1}" var="item" varStatus="status">
			    <tr>
			    	<td><input type="checkbox"  name="idtest" value="${item.id}"/></td>
			    	<td>${status.index+1 }</td>
			    	<td>${item.pline }</td>
			    	<td>${item.testm }</td>
			    	<td>
			    	<a href="${basepath}CSRTEST_SelectOneServlet?idtest=${item.id}">修改</a>&nbsp;&nbsp;&nbsp;
					<a href="${basepath}CSRTEST_DeleteOneServlet?idtest=${item.id}">删除</a>
			    	</td>
			    </tr>
			    </c:forEach>
			</table>
			</form>
		</div>
		</div>
	</head>
	</body>
</html>