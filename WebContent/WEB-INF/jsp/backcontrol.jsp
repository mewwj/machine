<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<script type="text/javascript" src="js/back.js"></script>  
<link rel="stylesheet" type="text/css" href="css/back.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/machine.test/DoInsertServlet" method="post" class="form" >
			产线名称：<select id="s1" onChange="move()" name="plinename">
		<!-- 根据id获取value，onchange（）触发函数move（）修改二级select的text值实现联动 -->
		  <option selected value="plinename">-- 请选择 --</option>
		  <!--默认选中-->
		  <option  value="SC">SC</option>
		  <option   value="BJ">BJ</option>
		  <option   value="TJ">TJ</option>
		</select>
		<br />
		机种名称：<input type="text" name="mname" /> <br />
	        订单号码：<input type="text" name="ordernumber"  /><br />
	        机种测试标准：<input type="text" name="mtandard" /> <br />
	       
		测试仪器：<select id="s2" name="testm">
		   <option selected>-- 请选择 --</option>
		   <!--默认选中，动态生成option -->
		</select><br />
		 生产数量：<input type="text" name="pnumber" /> <br />
	        资料收集时间点：<input type="date" name="time" /> <br />
	        良品：  <input type="number" name="good" min="0" id="good" onchange="calc()"/> <br /> 
	        不良品：  <input type="number" name="ng" min="0" id="ng" onchange="calc()"/> <br /> 
	        良率：  <input type="text" name="goodrate" min="0" readonly= "true " id="goodrate"/> <br /> 
	       不良率：   <input type="text" name="ngrate" min="0" readonly= "true " id="ngrate"/> <br /> 
	       测试专案bad数量：<br />
	    CLIO--SP:<input type="text" name="spc" /> <br />
	    CLIO--THD:<input type="text" name="thd" /> <br />
	    CLIO--OTH:<input type="text" name="oth" /> <br />
	    <input type="submit" value="提交"> 
	    <input type="reset"  value="清空">
	    <hr />
	    </form>
</body>
</html>