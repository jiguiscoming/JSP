<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SC" name="login" onsubmit="return call()" method="post" enctype="multipart/form-data">
		<div>
			아이디 <p><input name="id">
		</div>
		<!-- 필수정보 -->
		<div>
			비밀번호<p> <input name="pw">
		</div>
		<!-- 필수정보  8~16 영대소문자, 숫자, 특수문자 -->
		<div>
			비밀번호 재확인 <p><input name="pwCheck">
		</div>
		<!-- 필수정보 일치확인 -->
		<div>
			출생년도 <p> <input name="birth">
		</div>
		<div id="uploadTd">
			사진 <p> <input name="f" type="file" id="upload" >
		</div>
		<button>save</button>
	</form>
</body>
</html>