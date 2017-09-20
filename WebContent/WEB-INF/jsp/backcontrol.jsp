<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
    <%@ page import="pojo.TestItems"%>
<%@ page import="java.util.*"%>
<!DOCTYPE >
<html>
<head>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/back.js"></script>  
<link href="css/001.css" rel="stylesheet" type="text/css" />
<script  src="laydate/laydate.js"></script>                   
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
</head>
<script>

    	function checkForm(){ 
		    var spc = document.getElementById('spc').value;
		    var thd = document.getElementById('thd').value;
		    var oth = document.getElementById('oth').value;
		    var ng = document.getElementById('ng').value;
		    var sum1 = parseInt(spc)+parseInt(thd)+parseInt(oth);
    		 var form=document.getElementById("mainform"); 
		    if(ng != sum1 ) {
    		 alert("bad数量与不良品不匹配 ！"); 
    		 return false; 
    		 } 
    		 form.submit();
    		 } 


</script>
	<body>
		<form action="/machine.test/DoInsertServlet" method="post" id="mainform" class="form" >
				<div class="current">当前位置:内容列表</div>
					<table  class="gridtable" >
					<tr>
							<td colspan="2">项目</td>
							<td colspan="2">填入数据</td>
						</tr>
						<tr>
							<td colspan="2">产线名称：</td>
							<td colspan="2"><select id="s1" onChange="move()" name="insertpline">
								<option selected value="pline">-- 请选择 --</option>
								  <!--默认选中-->
								  <c:forEach items="${listmname}" var="item" varStatus="status">
								  <option   value="${item}">${item}</option>
								  </c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td colspan="2">机种名称：</td>
							<td colspan="2"><select id="s2" name="inserttestm">
							   <option selected>-- 请选择 --</option>
							    <c:forEach items="${listtestm}" var="item" varStatus="status">
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
							   <option selected>-- 请选择 --</option>
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
							<td colspan="1">CLIO--SP:</td>
							<td colspan="2"><input type="text" name="spc" id="spc"/></td>
						</tr>
						<tr>
							<td>CLIO--THD:</td>
							<td colspan="2"><input type="text" name="thd" id="thd"/></td>
						</tr>
						<tr>
							<td>CLIO--OTH</td>
							<td colspan="2"><input type="text" name="oth" id="oth"/></td>
						</tr>
						<tr>
				   		<td  colspan="4">
				   		  <input type="button" onclick="checkForm()" value="添加">
				   		 <input type="reset"  value="清空"></td>
				    		</tr>
				    	</table>
	    </form>
	</body>
</html>