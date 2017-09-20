<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
    <%@ page import="pojo.TestItems"%>
<%@ page import="java.util.*"%>
<%String path = request.getContextPath();%>
<% String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script type="text/javascript" src="js/back.js"></script> 
<link rel="stylesheet" type="text/css" href="css/001.css" />
<title>修改</title>
</head>
<body >
<form  action="/machine.test/DoUpdateServlet" method="post" id="mainform" class="form" >
			<div class="right">
				<div class="current">当前位置：<a  style="color:#6E6E6E;">修改信息</div>
				<div class="rightCont">
					<c:forEach items="${itemslist1}" var="item" varStatus="status">
					<table  class="gridtable" >
					   <tr>
							<td colspan="2">ID：</td>
							<td><input type="text" name="updateid" readonly="ture" value="${item.id}"/></td>
						</tr>
						<tr>
							<td colspan="2">产线名称：</td>
							<td><select id="s1" onChange="move()" name="updatepline">
								<option  selected  value="${item.pline}">${item.pline}</option>
								  <!--默认选中-->
								   <c:forEach items="${listpline}" var="plist" varStatus="status">
								  <option   value="${plist}">${plist}</option>
								  </c:forEach>
									</select>
							</td>
								<!-- 根据id获取value，onchange（）触发函数move（）修改二级select的text值实现联动 -->
						</tr>
						<tr>
							<td colspan="2">机种名称：</td>
							<td><input type="text" name="updatemname"  value="${item.mname}"/></td>
						</tr>	
						<tr>
							<td colspan="2">订单号码：</td>
							<td><input type="text" name="updateordernumber" value="${item.ordernumber}" /></td>
						</tr>
						<tr>
							<td colspan="2">测试仪器：</td>
							<td><select id="s2" name="updatetestm">
							   <option selected>${item.testm}</option>
							     <c:forEach items="${listtestm}" var="flist" varStatus="status">
								  <option   value="${flist}">${flist}</option>
								  </c:forEach>
							   <!--默认选中，动态生成option -->
							  </select></td>
						</tr>
						<tr>
							<td colspan="2">生产数量：</td>
							<td><input type="text" name="updatepnumber" value="${item.pnumber}"/></td>
						</tr>
						<tr>
							<td colspan="2">资料收集时间点：</td>
							<td><input type="text" id="test1" name="updatetime" value="${item.time}">
								<script src="laydate/laydate.js"></script> <!-- 改成你的路径 -->
								<script>
								//执行一个laydate实例
								laydate.render({
								 elem: '#test1' //指定元素
								});
								</script></td>
						</tr>
						<tr>
							<td colspan="2">良品：</td>
							<td><input type="number" name="updategood"  id="good"  value="${item.good}"/></td>
						</tr>
						<tr>
							<td colspan="2">不良品：</td>
							<td><input type="number" name="updateng"  id="ng" value="${item.ng}"/></td>
						</tr>						
					    <tr>
							<td  rowspan="3">测试专案bad数量：</td>
							<td>CLIO--SPC:</td>
							<td><input type="text" name="updatespc" value="${item.spc}"/></td>
						</tr>
						<tr>
							<td>CLIO--THD:</td>
							<td><input type="text" name="updatethd" value="${item.thd}"/></td>
						</tr>
						<tr>
							<td>CLIO--OTH</td>
							<td><input type="text" name="updateoth" value="${item.oth}"/></td>
						</tr>
				   		<td  colspan="4"><input type="submit" value="提交"> 
				   		 <input type="reset"  value="清空"></td>
				   		 
				    	<hr />
				    	</table>
				    </c:forEach>
	    			</div>
	    </div>
	    </form>
	</body>
</body>
</html>