<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Moa</title>
<link rel="stylesheet" href="css/main.css">
<script type="text/javascript" src="js/joinCheck.js"></script>
<script type="text/javascript" src="js/loginCheck.js"></script>
<script type="text/javascript" src="js/mypage.js"></script>
<script type="text/javascript" src="js/accountValidCheck.js"></script>
</head>
<body>
<div id = "title_box">
	<div class="title"><a href="HomeController">Moa</a></div>
	<div class="login_content"><jsp:include page="${login_page }"></jsp:include></div>
	<div class="research"><span>검색창</span> <input name="research"></div>
</div>

<div class="menu">
		<div class="menu_content">
		<span><a href="#">국가별</a></span>
			<div class="menu_s">
				<a href="#">한국</a>
				<a href="#">중국</a>
				<a href="#">일본</a>
				<a href="#">미국</a>
				<a href="#">영국</a>
				<a href="#">유럽</a>
				<a href="#">동남아시아</a>
			</div>
		</div>
		<div class="menu_content">
		<span><a href="#">장르별</a></span>
			<div class="menu_s">
				<a href="#">로맨스</a>
				<a href="#">코미디</a>
				<a href="#">드라마</a>
				<a href="#">스릴러</a>
			</div>
		</div>
		<div class="menu_content">
		<span><a href="#">커뮤니티</a></span>
		</div>
		<div class="menu_content">
		<span><a href="#">음악</a></span>
		</div>
</div>
<hr>
<div class="content_box"> <jsp:include page="${content_page}"></jsp:include> </div>




</body>
</html>