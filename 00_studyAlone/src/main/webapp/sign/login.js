function call(){
	
	let id = document.set.id;
	let pw = document.set.pw;
	let pwCheck = document.set.pwCheck;
	
	if(mustInfo(id)){
		alert('필수정보입니다');
		id.focus();
		return false;
	}
	
	if(mustInfo(pw)){
		alert('필수정보입니다');
		pw.focus();
		return false;
	}
	
	if(lessThan(pw,8) || 
		contains(pw,'qwertyuiopasdfghjklzxcvbnm')||
		contains(pw,'QWERTYUIOPASDFGHJKLZXCVBNM')||
		contains(pw,'1234567890')||
		contains(pw,'!@#$%^&*')){
		alert('비밀번호는 8~16 영대 소문자, 숫자 , 특수문자를 포함해주세요');
		pw.focus();
		return false;	
	}
	
	if(mustInfo(pwCheck)){
		alert('필수정보입니다');
		pwCheck.focus();
		return false;
	}

	if(check(pw,pwCheck)){
		alert('비밀번호가 일치하지 않습니다');
		pwCheck.focus();
		return false;
	}
	return true;
}