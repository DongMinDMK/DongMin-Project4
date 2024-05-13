function idCheck(){
	if(document.join.userid.value == ''){
		window.alert("아이디를 먼저 입력하세요...");
		ocument.join.userid.focus();
		return;
	}
	
	
	var inputid = document.join.userid.value;
	
	var opt = "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=500, height=200";
	
	window.open("board.do?command=idCheck&userid=" + inputid, idCheck, opt);
	
}

function joinCheck(){
	
	if(document.join.userid.value == ''){
		window.alert("아이디를 입력하세요...");
		document.join.userid.focus();
		return false;
	}else if(document.join.pwd.value == ''){
		window.alert("비밀번호를 입력하세요...");
		document.join.pwd.focus();
		return false;
	}else if(document.join.pwd.value != document.join.pwd_check.value){
		window.alert("비밀번호가 서로 일치하지 않습니다...");
		document.join.pwd_check.focus();
		return false;
	}else if(document.join.name.value == ''){
		window.alert("이름을 입력하세요...");
		document.join.name.focus();
		return false;
	}else if(document.join.email.value == ''){
		window.alert("이메일을 입력하세요...");
		document.join.email.focus();
		return false;
	}else if(document.join.phone.value == ''){
		window.alert("전화번호를 입력하세요...");
		document.join.phone.focus();
		return false;
	}else if(document.join.userid.value != document.join.reid.value){
		window.alert("아이디 중복확인을 먼저 진행해주세요...");
		document.join.userid.focus();
		return false;
	}else{
		return true;
	}
}