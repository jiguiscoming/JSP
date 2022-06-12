function mypageValid(){
	let pw_check = document.mypageForm.pwCheck;
	let pw = document.mypageForm.pw;

	/*비번 같지 않으면 ture => 경고*/
	if(pwCheck(pw_check, pw)){
		alert('비밀번호가 일치하지 않습니다');
		pw_check.focus(); 
		return false;
	}
	return true;
}