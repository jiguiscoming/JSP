<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티</title>
</head>
<body>

<!-- 제목 -->
<span><h1>커뮤니티</h1></span>
<!-- 글등록 버튼 -->
<c:choose>
<c:when test="${empty sessionScope.account.id}">
<div>회원만 리뷰가 가능합니다</div>
</c:when>
<c:otherwise>
<div><button onclick="location.href='ComunityRegController'">리뷰쓰기</button></div>
</c:otherwise>
</c:choose>

<div id="img_box">
	<div class="img_content">
		img
		<div>title</div>
	</div>
	<div class="img_content">
		img
		<div>title</div>
	</div>
	<div class="img_content">
		img
		<div>title</div>
	</div>
	<div class="img_content">
		img
		<div>title</div>
	</div>
	<div class="img_content">
		img
		<div>title</div>
	</div>
	<div class="img_content">
		img
		<div>title</div>
	</div>
</div>
</body>
</html>