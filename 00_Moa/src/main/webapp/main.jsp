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
<script type="text/javascript" src="js/accountValidCheck.js"></script>
</head>
<body>
<div id = "title_box">
	<div class="title"><a href="HomeController">Moa</a></div>
	<c:choose>
		<c:when test="${empty param.id}">
		<div class="login">
			<form action="AccountController">
				<button class="login_btn" name="account" value="login">로그인</button>
			</form>
		</div>
		<div class="join">
			<form action="AccountController">
				<button class="join_btn" name="account" value="join">회원가입</button>
			</form>
		</div>
		</c:when>
		<c:otherwise>
			<div class="account_info"><jsp:include page="account/account_info.jsp"></jsp:include> </div>
			<div class="logout">
				<form action="AccountController">
					<button class="logout_btn" name="account" value="logout">로그아웃</button>
				</form>
			</div>
		</c:otherwise>
	</c:choose>
	<div class="research"><span>검색창</span> <input name="research"></div>
</div>

<div class="menu_bar">
	<ul class="menu_content">
		<li class="menu_country">국가별</li>
			<ul class="menu_s">
				<li>한국</li>
				<li>중국</li>
				<li>일본</li>
				<li>미국</li>
				<li>영국</li>
				<li>유럽</li>
				<li>동남아시아</li>
			</ul>
		<li class="menu_genre">장르별</li>
			<ul class="menu_s">
				<li>로맨스</li>
				<li>코미디</li>
				<li>드라마</li>
				<li>스릴러</li>
			</ul>
		<li class="menu_comunity">커뮤니티</li>
		<li class="menu_music">음악</li>
	</ul>
</div>
<hr>
<div class="content_box"> <jsp:include page="${content_page}"></jsp:include> </div>




</body>
</html>