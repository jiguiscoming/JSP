<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AccountController" name="joinForm" onsubmit="return joinValid()" method="post">
	<h3>이름</h3><span><input name="name"></span> 
	<h3>생년월일</h3> 
	<span>
	<input name="byear" placeholder="출생년도" maxlength="4">
	<select name="bmonth" >
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
		<option value="11">11</option>
		<option value="12">12</option>
	</select>
	<input name="bday" placeholder="일" maxlength="2">
	</span>
	<h3>아이디</h3> <span><input name="id" maxlength="20"></span>
	<h3>비밀번호</h3> <span><input name="pw" maxlength="16"></span>
	<h3>비밀번호 확인</h3> <span><input name="pw_check"></span> 
	<h3>이메일</h3> <span><input name="email"></span>
	<h3>성별</h3> 
	<span>
	<select name="gender">
		<option value="m">남</option>
		<option value="w">여</option>
	</select>
	</span>
	<h3>주소</h3>
	<span>
	<select name="addr">
		<option value="seoul">서울시</option>
		<option value="gyeonggi">경기도</option>
		<option value="gangwondo">강원도</option>
		<option value="chungcheongdo">충청도</option>
		<option value="jeonrado">전라도</option>
		<option value="gyeongsangdo">경상도</option>
		<option value="jeju">제주시</option>
	</select>
	</span>
	<h3>전화번호</h3>	
	<span><input name="phone"></span>
	
	<div><button>회원가입</button></div>
</form>
	
</body>
</html>