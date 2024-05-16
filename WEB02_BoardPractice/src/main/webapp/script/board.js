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

function loginCheck(){
	if(document.login.userid.value == ''){
		window.alert("아이디를 입력하세요...");
		document.login.userid.focus();
		return false;
	}else if(document.login.pwd.value == ''){
		window.alert("비밀번호를 입력하세요...");
		document.login.pwd.focus();
		return false;
	}else {
		return true;
	}
}

function withDraw(){
	var ans = window.confirm("정말로 삭제할까요?");
	
	if(ans){
		location.href="board.do?command=deleteMember"
		
	}else {
		window.alert("삭제를 원하시지 않으시기에 다시 메인으로 돌아갑니다.");
		return;
	}
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

function updateCheck(){
	if(document.update.pwd.value == ''){
		window.alert("비밀번호를 입력하세요...");
		document.update.pwd.focus();
		return false;
	}else if(document.update.pwd.value != document.update.pwd_check.value){
		window.alert("비밀번호가 서로 일치하지 않습니다...");
		document.update.pwd_check.focus();
		return false;
	}else if(document.update.name.value == ''){
		window.alert("이름을 입력하세요...");
		document.update.name.focus();
		return false;
	}else if(document.update.email.value == ''){
		window.alert("이메일을 입력하세요...");
		document.update.email.focus();
		return false;
	}else if(document.update.phone.value == ''){
		window.alert("전화번호를 입력하세요...");
		document.update.phone.focus();
		return false;
	}else{
		return true;
	}
}

function boardCheck(){
	if(document.insertBoard.pass.value == ''){
		window.alert("비밀번호를 입력하세요...");
		document.insertBoard.pass.focus();
		return false;
	}else if(document.insertBoard.email.value == ''){
		window.alert("이메일을 입력하세요...");
		document.insertBoard.email.focus();
		return false;
	}else if(document.insertBoard.title.value == ''){
		window.alert("제목을 입력하세요...");
		document.insertBoard.title.focus();
		return false;
	}else if(document.insertBoard.content.value == ''){
		window.alert("내용을 입력하세요...");
		document.insertBoard.content.focus();
		return false;
	}else{
		return true;
	}
}

function updateBoardCheck(pass){
	if(document.insertBoard.pass.value == ''){
		window.alert("비밀번호를 입력하세요...");
		document.insertBoard.pass.focus();
		return false;
	}else if(document.insertBoard.email.value == ''){
		window.alert("이메일을 입력하세요...");
		document.insertBoard.email.focus();
		return false;
	}else if(document.insertBoard.title.value == ''){
		window.alert("제목을 입력하세요...");
		document.insertBoard.title.focus();
		return false;
	}else if(document.insertBoard.content.value == ''){
		window.alert("내용을 입력하세요...");
		document.insertBoard.content.focus();
		return false;
	}else if(document.insertBoard.pass.value != pass){
		window.alert("비밀번호가 일치하지 않아 수정할 수 없습니다.");
		document.insertBoard.pass.focus();
		return false;
	}else{
		return true;
	}
}

function deleteBoard(pass, num){
	var inputpass = window.prompt("삭제할 게시물의 비밀번호를 입력해주세요", '');
	
	if(inputpass != pass){
		window.alert("패스워드가 달라 삭제를 진행하실 수 없습니다.");
		return;
	}else{
		location.href = "board.do?command=deleteBoard&num=" + num;
	}
}

function replyCheck(){
	if(document.reply.content.value == ''){
		window.alert("댓글을 입력하세요...");
		document.reply.content.focus();
		return false;
	}
	
	return true;
	
}