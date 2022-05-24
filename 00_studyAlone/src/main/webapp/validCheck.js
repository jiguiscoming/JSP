	/*필수정보*/
	function mustInfo(input){
			return !input.value;
	}
	
	/*최소 글자 수*/
	function lessThan(input,int){
		return input.value.length < int;
	} 

function contains(input, set){
	for(let i = 0; i < set.length; i++){
		if(input.value.indexOf(set[i]) != -1){
			return false;
		}
	} return true;
}
	
	/*비밀번호 재확인*/
	function check(pw,input){
		if(pw.value != input.value){
			return ture;
		}return false;
	}