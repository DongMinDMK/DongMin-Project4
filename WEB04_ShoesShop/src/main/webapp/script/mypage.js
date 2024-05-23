function go_cart(){
	if(document.formm.quantity.value == ''){
		window.alert("수량을 입력하세요....");
		document.formm.quantity.focus();
		return false;
	}else{
		return true;
	}
}

function go_cart_delete(){
	
	var count = 0;
	
	if(document.cartForm.cseq.length == undefined){ //체크박스에 체크가 1개라면?
		if(document.cartForm.cseq.checked==true){
			count++;
		}
	}else{ //체크박스에 체크가 2개이상 이라면?
		for(var i=0; i<document.cartForm.cseq.length; i++){
			if(document.cartForm.cseq[i].checked == true){
				count++;
			}
		}
	}
	
	// 아무것도 체크를 하지 않고 삭제하기 버튼을 클릭할 시 ?
	if(count == 0){
		window.alert("삭제하시려면 삭제할 항목을 체크 해주세요.");
		return;
	}else{
		var ans = window.confirm("정말로 삭제할까요?");
		if(ans){
			document.cartForm.action='shop.do?command=cartDelete';
			document.cartForm.submit();
		}else{
			window.alert("삭제를 원하시지 않으시기에 돌아갑니다.");
			return;
		}
	}
}

function go_order_insert(){
	var count = 0;
	
	if(document.cartForm.cseq.length == undefined){ //체크박스에 체크가 1개라면?
		if(document.cartForm.cseq.checked==true){
			count++;
		}
	}else{ //체크박스에 체크가 2개이상 이라면?
		for(var i=0; i<document.cartForm.cseq.length; i++){
			if(document.cartForm.cseq[i].checked == true){
				count++;
			}
		}
	}
	
	// 아무것도 체크를 하지 않고 삭제하기 버튼을 클릭할 시 ?
	if(count == 0){
		window.alert("주문할 항목을 선택하세요...");
		return;
	}else{
		var ans = window.confirm("선택한 상품을 주문할까요?");
		if(ans){
			document.cartForm.action='shop.do?command=orderInsert';
			document.cartForm.submit();
		}else{
			window.alert("상품 주문을 원하시지 않으시기에 돌아갑니다.");
			return;
		}
	}
}

function go_order(){
	var ans = window.confirm("현재 상품을 주문할까요?");
	
	if(ans){
		document.formm.action="shop.do?command=orderInsertOne";
		document.formm.submit();
	}else{
		window.alert("주문을 하지 않지 않으셨습니다.");
		return;
	}
}

function go_updateMember(){
	if(document.joinForm.pwd.value== ''){
		window.alert("비밀번호를 입력하세요...");
		document.joinForm.pwd.focus();
	}else if(document.joinForm.pwd.value != document.joinForm.pwdCheck.value){
		window.alert("비밀번호와 비밀번호 확인이 일치하지 않습니다...");
		document.joinForm.pwd.focus();
	}else if(document.joinForm.name.value==''){
		window.alert("이름을 입력하세요...");
		document.joinForm.name.focus();
	}else if(document.joinForm.phone.value==''){
		window.alert("휴대폰번호를 입력하세요...");
		document.joinForm.phone.focus();
	}else if(document.joinForm.email.value==''){
		window.alert("이메일주소를 입력하세요...");
		document.joinForm.email.focus();
	}else{
		document.joinForm.submit();
	}
}
