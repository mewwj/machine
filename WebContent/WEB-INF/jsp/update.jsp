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
<meta charset="UTF-8">
<title>修改</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script type="text/javascript" src="js/back.js"></script> 
<link rel="stylesheet" type="text/css" href="css/001.css" />
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>  
<script type="text/javascript" src="js/messages_zh.js"></script> 
<script type="text/javascript">
<script>
$.validator.addMethod("sum",function(value,element,params){  
	var a=$("input[ name='spc'] ").val();
	var b=$("input[ name='thd'] ").val();
	var c=$("input[ name='oth'] ").val();
	var d=$("input[ name='ng'] ").val();
	var sum=parseInt(a)+parseInt(b)+parseInt(c);
    if(sum==ng){
        return true;
    }else{
        return false;
    }
},"SPC THD OTH数量与不良品数量不想等");
$().ready(function() {
	// 在键盘按下并释放及提交后验证提交表单
	  $("#mainform").validate({
		  rules: {
			  updatepline: "required",
			  updatemname: "required",
			  updateordernumber: "required",
			  updatetestm:"required",
			  updatepnumber: {
	        required: true,
	    	number:true	   
	    	},
	    	updatetime: {
	        required: true,
	        dateISO:true
	      },
	      updategood: "required",
	      updateng:{ 
	    	  number:true,	   
	    	  required:true,
	    	  
	        },
	        updatetestm: {number:true,	
				required: true,
				 },
				 updatespc: {
			 required: true,
			 number:true,
			
			 },
			 updatethd: {
	    	number:true,
			  required: true,
			  sum:true
				 },
		updateoth: {
				 number:true,
			 required: true,
				 sum:true
				 }
	    },
	    messages: {
	    	insertpline: "不能为空！",
	    	mname: "不能为空",
	    	ordernumber:"不能为空！",
	      inserttestm: "不能为空！",
	      pnumber: {
	        required: "不能为空！",
	    	number:"必须为数字！"	   
	    	},
	      inserttime: {
	        required:  "不能为空！",
	        dateISO: "日期格式不正确！"
	      },
	      good: "不能为空!",	   
	      ng:{ 
	    	  number: "必须为数字!",	   
	    	  required:"不能为空!"
	      },
	     spc: {
	    	 number:"必须为数字!",	
			required: "不能为空!",
				 },
		thd: {
			 required: "不能为空!",
			 number: "必须为数字!" },
	    oth: {
	    	number: "必须为数字!",
			  required: "不能为空!"
				 },
		updateoth: {
					 number:"必须为数字!",
				 required: "不能为空!",
					 sum:"bad数据与不良品不相符！"
					 }
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
<body >
<form  action="/machine.test/DoUpdateServlet" method="post" id="mainform" class="form" >
			<div class="right">
				<div class="current">当前位置：<a  style="color:#6E6E6E;">修改信息</div>
				<div class="rightCont">
					<c:forEach items="${itemslist1}" var="item" varStatus="status">
					<table  class="gridtable" >
				 <tr>
							<td colspan="2">ID：</td>
							<td><input type="text" name="updateid" readonly="true" value="${item.id}"/></td>
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
							<td>CLIO--OTH:</td>
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