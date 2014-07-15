<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ include file="/common/common.jsp"%>
		<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.5&ak=8261c4a00ba9e82d1a1a9b287cde69ea"></script>
		<script type="text/javascript">
			$(document).ready(function () {
				var map = new BMap.Map('divMap');
				map.centerAndZoom('上海',15);
				var markerRecommend = new BMap.Marker(new BMap.Point(116.384, 39.925));
				map.addOverlay(markerRecommend);
				var labelRecommend = new BMap.Label("推荐成功",{offset:new BMap.Size(20,-10)});
				markerRecommend.setLabel(labelRecommend);				
			});
		</script>
		<style type="text/css">
			body, html,#divMap {height: 100%;}
			#l-map{height:100%;width:78%;float:left;border-right:2px solid #bcbcbc;}
			#r-result{height:100%;width:20%;float:left;}		
		</style>
	</head>
<body>
	<div id="divContainer">
		<div id="divMap"></div>
	</div>
</body>
</html>