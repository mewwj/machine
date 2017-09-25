<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ page import="pojo.TestItems"%>
<%@ page import="java.util.*"%>
<%String path = request.getContextPath();%>
<% String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
 <script type="text/javascript" src="js/backlist.js"></script>  
<link href="css/all.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>信息展示页面</title>
</head>
<body style="background: #e1e9eb;">
		<form action="/machine.test/DoListServlet" id="mainForm" method="post">
			<div class="right">
				<div class="current">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">内容列表</div>
				<div class="rightCont">
					<p class="g_title fix">内容列表 <a class="btn03" href="/machine.test/ServletToback" >新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a class="btn03" href="javascript:deleteBatch('<%=basePath%>')"  onclick="" >删 除</a></p>
					<table class="tab1">
						<tbody>
							<tr>
								<td width="90" align="right">时间：</td>
								<td>
									<input type="text" id="time" name="time" class="allInput" >
									<script src="laydate/laydate.js"></script> <!-- 改成你的路径 -->
									<script>
									//执行一个laydate实例
									laydate.render({
									 elem: '#time' //指定元素
									});
									</script>
								</td>
								<td width="90" align="right">产线名称：</td>
								<td>
									<input type="text" name="pline" class="allInput" value=""/>
								</td>
	                            <td width="85" align="right"><input type="submit" class="tabSub" value="查 询" /></td>
	       					</tr>
	       					
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
							<tbody>

								<tr>
								    <th><input type="checkbox" id="selectall" onclick="allSelect()"/></th>
								    <th>序号</th>
								    <th>产线名称</th>
								    <th>机种名称</th>
								    <th>订单号码</th>
								    <th>测试仪器</th>
								    <th>生产数量</th>
								    <th>资料收集时间点</th>
								    <th>良品</th>
								    <th>不良品</th>
								    <th>良率</th>
								    <th>不良率</th>
								    <th>CLIO-SPC</th>
								    <th>CLIO-THD</th> 
								    <th>CLIO-OTH</th>
								    <th>操作</th>
								</tr>
                               <c:forEach items="${itemslist}" var="item" varStatus="status">
							              <c:if test="${status.index%2==0}">
								    <tr style="background-color:#ECF6EE;">
								</c:if>
									<td><input name="id"  type="checkbox"  value="${item.id}"/></td>
									<td>${status.index+1}</td>
									<td>${item.pline}</td>
									<td>${item.mname}</td>
									<td>${item.ordernumber}</td>
									<td>${item.testm}</td>
									<td>${item.pnumber}</td>
									<td>${item.time}</td>
									<td>${item.good}</td>
									<td>${item.ng}</td>
									<td><fmt:formatNumber value="${item.goodrate}" type="percent"  maxFractionDigits="2"/></td>
									<td><fmt:formatNumber value="${item.ngrate}" type="percent" maxFractionDigits="2"/></td>
									<td>${item.spc}</td>
									<td>${item.thd}</td>
									<td>${item.oth}</td>
									<td>
										<a href="${basepath}DoSelectOneServlet?id=${item.id}">修改</a>&nbsp;&nbsp;&nbsp;
										<a href="${basepath}DoDeleteOneServlet?id=${item.id}" onclick="return Function1();" >删除</a>
									</td>
								</tr>
							</c:forEach>
								
								
							</tbody>
						</table>
						<!--  -->
						<div class='page fix'>
							共 <b></b> 条
							<a href='###' class='first'>首页</a>
							<a href='###' class='pre'>上一页</a>
							当前第<span>1/1</span>页
							<a href='###' class='next'>下一页</a>
							<a href='###' class='last'>末页</a>
							跳至&nbsp;<input type='text' value='1' class='allInput w28' />&nbsp;页&nbsp;
							<a href='###' class='go'>GO</a>
						</div>
					</div>
				</div>
			</div>
	    </form>
	</body>
</html>