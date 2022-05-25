<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

%>	
</head>
<body>

<div>아이디 <p><%=id %></div>
<div>비밀번호<p><%=pw %></div>

</body>
</html>