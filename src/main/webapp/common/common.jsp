<%
	String fullPath= request.getScheme()+ "://"+ request.getServerName()+ ":"+ request.getServerPort()+ request.getContextPath()+ "/";
%>
<script type="text/javascript" src="<%=fullPath%>js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="<%=fullPath%>js/jquery-easyui-1.3.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=fullPath%>js/jquery.form_3.46.0.js"></script>
<script type="text/javascript" src="<%=fullPath%>js/jquery.pagController.js"></script>
<script type="text/javascript" src="<%=fullPath%>js/jquery.valid.js"></script>
<link type="text/css" rel="stylesheet" href="<%=fullPath%>css/css.css">
<link type="text/css" rel="stylesheet" href="<%=fullPath%>js/jquery-easyui-1.3.2/themes/default/easyui.css">
<link type="text/css" rel="stylesheet" href="<%=fullPath%>js/jquery-easyui-1.3.2/themes/icon.css">
