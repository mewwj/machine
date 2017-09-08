<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/all.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>信息展示页面</title>
</head>
<body style="background: #e1e9eb;">
		<form action="" id="mainForm" method="post">
			<div class="right">
				<div class="current">当前位置：<a href="javascript:void(0)" style="color:#6E6E6E;">内容管理</a> &gt; 内容列表</div>
				<div class="rightCont">
					<p class="g_title fix">内容列表 <a class="btn03" href="/jdbc/ToaddServlet">新 增</a>&nbsp;&nbsp;&nbsp;&nbsp;<a class="btn03"  onclick="Function1()">删 除</a></p>
					<table class="tab1">
						<tbody>
							<tr>
								<td width="90" align="right">问题字段1：</td>
								<td>
									<input type="text" name="field1" class="allInput" value="${field1}"/>
								</td>
								<td width="90" align="right">回复字段2：</td>
								<td>
									<input type="text" name="field2" class="allInput" value="${field2}"/>
								</td>
	                            <td width="85" align="right"><input type="submit" class="tabSub" value="查 询" /></td>
	       					</tr>
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
							<tbody>

								<tr>
								    <th><input type="checkbox"  onclick="" value="#"/></th>
								    <th>序号</th>
								    <th>演示字段1</th>
								    <th>演示字段2</th>
								    <th>操作</th>
								</tr>
                               <c:forEach items="${list}" var="item" varStatus="status">
							              <c:if test="${status.index%2==0}">
								    <tr style="background-color:#ECF6EE;">
								</c:if>
									<td><input name="id"  type="checkbox"  value="${item.id}"/></td>
									<td>${status.index+1}</td>
									<td>${item.field1 }</td>
									<td>${item.field2}</td>
									<td>
										<a href="">修改</a>&nbsp;&nbsp;&nbsp;
										<a href="" onclick="return Function1();" >删除</a>
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