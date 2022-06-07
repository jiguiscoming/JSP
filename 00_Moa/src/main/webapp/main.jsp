<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Moa</title>
<script type="text/javascript" src="js/joinCheck.js"></script>
<script type="text/javascript" src="js/accountValidCheck.js"></script>
</head>
<body>
<div>
	<div><a href="HomeController">Moa</a></div>
	<c:choose>
		<c:when test="${empty param.id}">
			<form action="AccountController">
				<button name="account" value="login">로그인</button>
			</form>
			<form action="AccountController">
				<button name="account" value="join">회원가입</button>
			</form>
		</c:when>
		<c:otherwise>
			<div><jsp:include page="account/account_info.jsp"></jsp:include> </div>
		</c:otherwise>
	</c:choose>
	<div>검색창 <input name="research"></div>
</div>

<div>
	<div>국가별</div>
	<div>장르별</div>
	<div>커뮤니티</div>
	<div>음악</div>
</div>
<hr>
<div> <jsp:include page="${content_page}"></jsp:include> </div>




</body>
</html>