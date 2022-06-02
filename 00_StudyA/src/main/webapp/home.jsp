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
<jsp:include page="${loginPage }"></jsp:include>
<hr>
<a href="JC">Join in</a>
<a href="LC">Login</a>
<hr>
<jsp:include page="${contentPage }"></jsp:include>



</body>
</html>