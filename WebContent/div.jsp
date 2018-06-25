<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>实时参数</title>
	<style type="text/css">
		.show{
			background:#7cd2f8;
			width:300px;
			height:180px;
			text-align:center;
			position:absolute;
			z-index:1;
			left:100px;
			top:100px;
		}
		.show input{
			width:100px;
		}
	</style>
	<meta http-equiv="content-type" content="text/html;charset=utf-8"/>
	<script type="text/javascript" src="js/jscharts.js" ></script>
	<script type="text/javascript" src="js/jscharts_mb.js" ></script>
	<script type="text/javascript" src="js/highcharts.js"></script> 
	<script type="text/javascript" src="js/jquery-1.4.3.js"></script>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script> 
	<link href="style.css" rel="stylesheet" type="text/css" />

	<script type="text/javascript">
		$(document).ready(function()
		{
			$(".show").mousedown(function(e)//e鼠标事件
			{
				$(this).css("cursor","move");//改变鼠标指针的形状
				
				var offset = $(this).offset();//DIV在页面的位置
				var x = e.pageX - offset.left;//获得鼠标指针离DIV元素左边界的距离
				var y = e.pageY - offset.top;//获得鼠标指针离DIV元素上边界的距离
				$(document).bind("mousemove",function(ev)//绑定鼠标的移动事件，因为光标在DIV元素外面也要有效果，所以要用doucment的事件，而不用DIV元素的事件
				{
					$(".show").stop();//加上这个之后
					
					var _x = ev.pageX - x;//获得X轴方向移动的值
					var _y = ev.pageY - y;//获得Y轴方向移动的值
					
					$(".show").animate({left:_x+"px",top:_y+"px"},10);
				});
				
			});
			
			$(document).mouseup(function()
			{
				$(".show").css("cursor","default");
				$(this).unbind("mousemove");
			});
		});
	</script>

	<script  type="text/javascript">
		function showDiv(){
		document.getElementById('div2').style.display='block';
		}
		function closeDiv(){
		document.getElementById('div2').style.display='none';
		}
	</script>
	
</head>
<body>

<!--  	<div class="show"> -->
<!-- 		用户名：<input type="text" name="username" /><br /> -->
<!-- 		密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" /><br /> -->
<!-- 		<input type="button" value="提交" onclick="javascript:window.location.href='http://www.163.com';" /> -->
<!-- 	</div> -->
	
	  <div style="height:1400px;">
		<a href="javascript:showDiv()">点我,弹出层</a></div>

	  <div id="div2" class="show"  style="display:none;">
	  		<a href="javascript:closeDiv()"><img src="http://www.codefans.net/jscss/demoimg/200903/close3.gif" hspace="6" border=0></a>
	  </div>
	
	
	  
</body>
</html>