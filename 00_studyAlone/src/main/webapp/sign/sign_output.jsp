<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>아이디 : ${info.id }</div>
<div>비밀번호 : ${info.pw }</div>
<div>만 나이 : <fmt:formatNumber value="${info.age }" pattern="#.0"></fmt:formatNumber>  </div>
<div><c:if test="${info.age } > 20">
<h1>어른이구만</h1>
</c:if></div>
<div>file</div>
<div><img src="filesaver/${info.fName }"></div>

</body>
</html>