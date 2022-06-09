function loginValid(){
	
	let id = document.loginForm.id;
	let pw = document.loginForm.pw;
	
	/*아이디 : 필수*/
	if(mustInput(id)){
		alert('id를 입력하세요');
		id.focus();
		return false;
	}

	/*비밀번호 : 필수*/
	if(mustInput(pw)){
		alert('pw를 입력하세요');
		pw.focus();
		return false;
	}
}
