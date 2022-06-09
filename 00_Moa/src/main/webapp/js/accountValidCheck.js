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

/*최소자리(적으면 true)*/
function lessThan(input, length){
	if(input.value.length < length){
		return true;
	}
}


/*반드시 포함(포함 안되면 true)*/
function contain(input, set){
	for(let i = 0; i < set.length; i++){
		if(input.value.indexOf(set[i]) != -1){
			return false;
		}
	}return true;
}


/*숫자(숫자 아니면 true)*/
function number(input){
	return isNaN(input.value);
}