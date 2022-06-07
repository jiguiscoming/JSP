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
	
	/*비밀번호 확인*/
	if(pwCheck(pw,pw_check)){
		alert('비밀번호를 확인하세요');
		pw_check.focus();
		return false;
	}
	
	
}