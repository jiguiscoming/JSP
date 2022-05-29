<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/fileStudy.css">
<script type="text/javascript" src="login.js"></script>
<script type="text/javascript" src="validCheck.js"></script>
</head>
<body>

	<div id="home_title"><a href="C" >JS'Home</a></div>
	
	<div class="home_menu"><a href="SC">sign</a></div>
	
	<div class="home_content"><jsp:include page="${contentPage}"></jsp:include> </div>

	
</body>
</html>