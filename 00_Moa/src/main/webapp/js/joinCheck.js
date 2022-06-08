function joinValid(){
	let name = document.joinForm.name;
	let byear = document.joinForm.byear;
	let bmonth = document.joinForm.bmonth;
	let bday = document.joinForm.bday;
	let id = document.joinForm.id;
	let pw = document.joinForm.pw;
	let pw_check = document.joinForm.pw_check;
	let email = document.joinForm.email;
	let gender = document.joinForm.gender;
	let addr = document.joinForm.addr;
	let phone = document.joinForm.phone;
	
	/*이름정보 : 필수정보*/
	if(mustInput(name)){
		alert('이름을 입력하세요');
		name.focus();
		return false;
	}
	
	/*출생년도 필수*/
	if(mustInput(byear)){
		alert('출생년도를 입력하세요');
		byear.focus();
		return false;
	}
	
	/*출생년도 4자리*/
	if(lessThan(byear, 4) || number(byear)){
		alert('출생년도 4자리를 확인하세요');
		byear.focus();
		return false;
	}
	
	/*출생일 필수 , 출생일 숫자*/
	if(mustInput(bday) || number(bday)){
		alert('출생일을 입력하세요');
		bday.focus();
		return false;
	}

	/*아이디 필수*/
	if(mustInput(id)){
		alert('아이디를 입력하세요');
		id.focus();
		return false;
	}
	
	/*아이디 : 5~20 영문 소문자 숫자*/
/*	if(lessThan(id, 5) || contain(id, "qwertyuiopasdfghjklzxcvbnm") || contain(id, "1234567890")){
		alert('아이디는 5~20자 영문 소문자, 숫자 포함');
		id.focus();
		return false;
	}*/
		
	/*비밀번호 : 필수*/
	if(mustInput(pw)){
		alert('비밀번호를 입력하세요');
		pw.focus();
		return false;
	}
	/*비밀번호 : 8~16 영문 대소문자 숫자 특수문자*/
/*	if(lessThan(pw, 8) || contain(pw, "qwertyuiopasdfghjklzxcvbnm" || contain(pw, "QWERTYUIOPASDFGHJKLZXCVBNM") || contain(pw, "~!@#$%^&*") || contain(pw, "1234567890"))){
		alert('비밀번호 8~16자 영문 대소문자, 숫자, 특수문자 포함');
		pw.focus();
		return false;
	}*/
	/*비밀번호 확인 : 필수입력*/
	if(mustInput(pw_check)){
		alert('비밀번호를 입력하세요');
		pw_check.focus();
		return false;
	}
	/*비밀번호 재확인*/
	if(pwCheck(pw,pw_check)){
		alert('비밀번호를 확인하세요');
		pw_check.focus();
		return false;
	}
	
	/*이메일 필수*/
	if(mustInput(email)){
		alert('이메일을 입력하세요');
		email.focus();
		return false;
	}
	
	/*전화번호 필수, - 미포함*/
	if(mustInput(phone) || number(phone)){
		alert('전화번호를 입력하세요(-미포함)');
		phone.focus();
		return false;
	}
}