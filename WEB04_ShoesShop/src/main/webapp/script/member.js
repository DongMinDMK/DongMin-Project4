function loginCheck(){
	if(document.loginForm.userid.value == ''){
		window.alert("아이디를 먼저 입력해주세요...");
		document.loginForm.userid.focus();
		return false;
	}else if(document.loginForm.pwd.value == ''){
		window.alert("비밀번호를 먼저 입력해주세요...");
		document.loginForm.pwd.focus();
		return false;
	}else{
		return true;
	}
}

function go_next(){
	if(document.contractForm.okon[1].checked == true){
		window.alert("이용 약관에 동의를 하셔야 회원가입 창으로 이동하실 수 있습니다..");
		
	}else{
		document.contractForm.submit();
	}
}

function idCheck(){
	if(document.joinForm.userid.value == ''){
		window.alert("아이디를 먼저 입력해주세요...");
		document.joinForm.userid.focus();
		return;
	}
	
	var url = "shop.do?command=idCheck&userid=" + document.joinForm.userid.value;
	var opt = "toolbar=no, menubar=no, resizable=no, width=500, height=250, scrollbars=no";

	window.open(url, "idCheck", opt);
}

function isOk(userid){
	opener.joinForm.userid.value = userid;
	opener.joinForm.reid.value = userid;
	self.close();
}

function post_zip(){
	var url = "shop.do?command=findZipNum";
	var opt = "menubar=no, width=550, height=300, top=300, scrollbars=no";
	
	window.open(url, "post_zip", opt);
	
}

function addressOK(zip_num, sido, gugun, dong){
	opener.joinForm.zip_num.value = zip_num;
	opener.joinForm.address1.value = sido + " " + gugun + " " + dong;
	self.close();
}