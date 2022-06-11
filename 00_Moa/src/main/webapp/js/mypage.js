let pwCheck = document.mypageForm.pwCheck;
let pw = document.mypageForm.pw;

alert(pwCheck.value);
alert(pw.value);

function mypageValid(){

/*비번 같지 않으면 ture => 경고*/
if(pwCheck != pw){
	alert('비밀번호가 일치하지 않습니다')
	pwCheck.focus; 
}
	return false;s
}