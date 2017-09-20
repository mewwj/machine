<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
    <%@ page import="pojo.TestItems"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="css/001.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>展示</title>
<!-- 
<style type="text/css">
input{ border:none; }
</style>
 -->
</head>
<body>
<h1>所有信息</h1>
<hr>
   <form action="/machine.test/DoListAllServlet" method="post">
   <table><tr> <td colspan="3"></td> 
   <td colspan="3">
   <input type="text" id="time" name="listalltime" class="allInput" value="${time}">
  <script src="laydate/laydate.js"></script> <!-- 改成你的路径 -->
				<script>
				//执行一个laydate实例
			  laydate.render({
				 elem: '#time' //指定元素
					});
		</script></td>
    <td></td> 
    <td>
   <input type="submit" value="查询"> 
   </td>
   </tr>
   </table>
   </form>
<form action="/DoListAllServlet">
		  <table class="gridtable">
		 <tr>
		     <th rowspan="2">产线名称</th>
		     <th rowspan="2">机种名称</th>
			 <th rowspan="2">订单号码</th>
			 <th rowspan="2">测试仪器</th>
			 <th rowspan="2">生产数量</th>
			 <th rowspan="2">资料收集时间点</th>
			 <th rowspan="2">良品</th>
			 <th rowspan="2">不良品</th>
			 <th rowspan="2">良率</th>
			 <th rowspan="2">不良率</th>
			 <th colspan="3">bad数量</th>
			 <th rowspan="2">总数量</th>
		     <th rowspan="2">良品</th>
			 <th rowspan="2">不良品</th>
			 <th rowspan="2">良率</th>
			 <th rowspan="2">不良率</th>
			 <th colspan="3">bad数量</th>
			 <th rowspan="2">总数量</th>
			 <th rowspan="2">总良品</th>
			 <th rowspan="2">总不良品</th>
			 <th colspan="3">bad数量</th>
		</tr>	
		<tr>
			<td >SPL</td>
			<td >THD</td>
			<td >OTH</td>
			<td >SPL</td>
			<td >THD</td>
			<td >OTH</td>
			<td >SPL</td>
			<td >THD</td>
			<td >OTH</td>
		</tr>
		<c:forEach items="${allitemslist}" var="item" varStatus="status">
		  <tr>
			<td>${item.pline}</td>
			<td>${item.mname}</td>
			<td>${item.ordernumber}</td>
			<td>${item.testm}</td>
			<td>${item.pnumber}</td>
			<td>${item.time}</td>
			<td>${item.good}</td>
			<td>${item.ng}</td>
			<td>${item.goodrate}</td>
			<td>${item.ngrate}</td>
			<td>${item.spc}</td>
			<td>${item.thd}</td>
			<td>${item.oth}</td>
			<td>${item.psum}</td>
			<td>${item.psumgood}</td>
			<td>${item.psumng}</td>
			<td>${item.pgoodrate}</td>
			<td>${item.pngrate}</td>
			<td>${item.psumspc}</td>
			<td>${item.psumthd}</td>
			<td>${item.psumoth}</td>
			<td>${item.dsum}</td>
			<td>${item.dsumgood}</td>
			<td>${item.dsumng}</td>
			<td>${item.dsumspc}</td>
			<td>${item.dsumthd}</td>
			<td>${item.dsumoth}</td>
		    </tr>
		</c:forEach>
		</table>
		</form>
</body>
</html>