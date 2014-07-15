<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<%@ include file="/common/common.jsp"%>
		<script language="javascript">
			$(document).ready(function(){
				$("#btnSubmmit").bind("click",function(){
				   formPag.goAjax({
					   url:"<%=fullPath%>springMvc/${orm}/operatorInsertSubmmit",
					   type:"POST",
					   data:{
					  	 operatorId:$.trim($("#operatorId").val()),
					  	 operatorName:$.trim($("#operatorName").val()),
					  	 loginCode:$.trim($("#loginCode").val()),
					  	 loginPassword:$.trim($("#loginPassword").val())
				   	   },
				   	   showBusi: true,
			         modal: true,
				   	   message: "插入中，请稍候..",
				   	   success:function(data){
				   	   }
				   });		
				});
			});
		</script>		
	</head>
	<body>
		<p>operatorId: <input type="text" id="operatorId"></p>
		<p>operatorName: <input type="text" id="operatorName"></p>
		<p>loginCode: <input type="text" id="loginCode"></p>
		<p>loginPassword: <input type="text" id="loginPassword"></p>		
		<p><input type="button" id="btnSubmmit" value="提交"></p>	
	</body>
</html>