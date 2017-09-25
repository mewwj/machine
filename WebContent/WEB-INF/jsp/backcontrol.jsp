<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
    <%@ page import="pojo.TestItems"%>
<%@ page import="java.util.*"%>
<!DOCTYPE >
<html>
<head>
<link href="css/001.css" rel="stylesheet" type="text/css" />
<script  src="laydate/laydate.js"></script>                   
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>数据添加</title>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/back.js"></script>  
<script type="text/javascript" src="js/jquery.validate.min.js"></script>  
<script type="text/javascript" src="js/messages_zh.js"></script>  
<meta charset="UTF-8">
</head>
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
},"SPC THD OTH数量与不良品数量不等");
$.validator.addMethod("sum2",function(value,element,params){  
	var a=$("input[ name='good'] ").val();
	var b=$("input[ name='ng'] ").val();
	var c=$("input[ name='pnumber'] ").val();
	var sum=parseInt(a)+parseInt(b);
    if(sum==c){
        return true;
    }else{
        return false;
    }
},"生产数量与良品不良品之和不等");
$().ready(function() {
	// 在键盘按下并释放及提交后验证提交表单
	  $("#mainform").validate({
		  rules: {
	    	insertpline: "required",
	    	mname: "required",
	    	ordernumber: "required",
	      inserttestm:"required",
	      pnumber: {
	        required: true,
	    	number:true	   
	    	},
	      inserttime: {
	        required: true,
	        dateISO:true
	      },
	      good: "required",
	      ng:{ 
	    	  number:true,	   
	    	  required:true,
	    	  sum2:true
	        },
	     spc: {number:true,	
				required: true
				 },
		thd: {
			 required: true,
			 number:true
			
			 },
	    oth: {
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
	<body>
		<form action="/machine.test/DoInsertServlet" method="post" id="mainform" class="form" >
		<fieldset>
				<div class="current">当前位置:内容列表</div>
					<table  class="gridtable" >
					<tr>
							<td colspan="2">项目</td>
							<td colspan="2">填入数据</td>
					</tr>
					<tr>
						<td colspan="2">产线名称：</td>
						<td colspan="2"><select id="s1" onChange="move()" name="insertpline">
							<option selected value="pline" disabled="disabled">-- 请选择 --</option>
								  <!--默认选中-->
							<c:forEach items="${listpline}" var="item" varStatus="status">
							<option   value="${item}">${item}</option>
							</c:forEach>
							</select>
						</td>
						</tr>
						<tr>
							<td colspan="2">机种名称：</td>
							<td colspan="2"><select id="s2" name="mname">
							   <option selected  disabled="disabled">-- 请选择 --</option>
							    <c:forEach items="${listmname}" var="item" varStatus="status">
								  <option   value="${item}">${item}</option>
								  </c:forEach>
							</select></td>
						</tr>	
						<tr>
							<td colspan="2">订单号码：</td>
							<td colspan="2"><input type="text" name="ordernumber"  /></td>
						</tr>
						<tr>
							<td colspan="2">测试仪器：</td>
							<td colspan="2"><select id="s2" name="inserttestm">
							   <option selected  disabled="disabled">-- 请选择 --</option>
							    <c:forEach items="${listtestm}" var="item" varStatus="status">
								  <option   value="${item}">${item}</option>
								  </c:forEach>
							</select></td>
						</tr>
						<tr>
							<td colspan="2">生产数量：</td>
							<td colspan="2"><input type="text" name="pnumber" /></td>
						</tr>
						<tr>
							<td colspan="2">资料收集时间点：</td>
							<td colspan="2"><input type="text" id="test1" name="inserttime">
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
							<td colspan="2"><input type="number" name="good"  id="good" onChange="calc()"/></td>
						</tr>
						<tr>
							<td colspan="2">不良品：</td>
							<td colspan="2"><input type="number" name="ng"  id="ng" onChange="calc()"/></td>
						</tr>
						<tr>
							<td colspan="2">良率：</td>
							<td colspan="2"><input type="text" name="goodrate" id="goodrate"/></td>
						</tr>
						<tr>
							<td colspan="2">不良率：</td>
							<td colspan="2"><input type="text" name="ngrate"  id="ngrate"/></td>
						</tr>
					    <tr>
							<td  rowspan="3">测试专案bad数量：</td>
							<td colspan="1">CLIO--SPC:</td>
							<td colspan="2"><input type="text" name="spc" id="spc"/></td>
						</tr>
						<tr>
							<td>CLIO--THD:</td>
							<td colspan="2"><input type="text" name="thd" id="thd"/></td>
						</tr>
						<tr>
							<td>CLIO--OTH:</td>
							<td colspan="2"><input type="text" name="oth" id="oth"/></td>
						</tr>
						<tr>
				   		<td  colspan="4">
				   		   <input class="submit" type="submit"  value="提交">
				   		  <input type="reset"  value="清空"></td>
				    		</tr>
				    	</table>
				    	</fieldset>
	    </form>
	</body>
</html>