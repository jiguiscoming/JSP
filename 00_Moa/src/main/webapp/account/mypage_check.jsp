<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AccountController" method="post" name="mypageForm" onsubmit="return mypageValid()">
		<div class="mypage_check_box">
			<span>비밀번호 확인</span>
			<div class="mypage_check_content"><input name="pwCheck"></div>
			<input type="hidden" name="pw" value="${sessionScope.account.pw }">
			<div class="mypage_check_content"><button>입력</button></div>
		</div>
	</form>
</body>
</html>