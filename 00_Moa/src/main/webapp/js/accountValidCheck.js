/*필수 정보*/
function mustInput(input){
	return !input.value;
}

/*비밀번호 확인*/
function pwCheck(pw1, pw2){
	if(pw1.value != pw2.value){
		return true;
	}
		
}