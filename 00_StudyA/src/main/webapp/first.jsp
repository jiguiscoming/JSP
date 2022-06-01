<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="HC"><h1>HELLO WORLD</h1></a>
<hr>
<h4>회원정보</h4> 
<c:choose>
<c:when test="${param.user_id}!=null">
${param.user_id }님 안녕하세요
</c:when>
<c:otherwise>
<a href="LC">로그인을 하세요</a>
</c:otherwise>
</c:choose>
<hr>
<a href="JC">Join in</a>
<a href="LC">Login</a>
<hr>
<jsp:include page="${contents }"></jsp:include>



</body>
</html>