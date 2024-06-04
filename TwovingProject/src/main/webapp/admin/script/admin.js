function loginCheck(){
	if( document.loginForm.userid.value == "" ){
		alert("아이디를 입력하세요");
		document.loginForm.userid.focus();
		return false;
	}else if(document.loginForm.pwd.value == ""){
		alert("패스워드를 입력하세요");
		document.loginForm.pwd.focus();
		return false;
	}else{
		return true;
	}
}



function go_search( command ){
	var url = "twoving.do?command=" + command + "&page=1";
	document.frm.action = url;
	document.frm.submit();
}


function go_detail( pseq ){
	location.href="twoving.do?command=adminProductDetail&pseq=" + pseq;
}

function go_detail2( nseq ){
	location.href="twoving.do?command=adminNoticeDetail&nseq=" + nseq;
}

function go_detail3( qseq ){
	location.href="twoving.do?command=adminFaqDetail&qseq=" + qseq;
}

function go_detail4( ciseq ){
	location.href="twoving.do?command=adminCustomerInquiryDetail&ciseq=" + ciseq;
}

function deleteProduct(pseq){
	var ans = confirm("정말로 삭제 할까요?");
	if(ans){
		var url = "twoving.do?command=adminProductDelete&pseq=" + pseq;
		location.href=url;
	}
}

function deleteNotice(nseq){
	var ans = confirm("정말로 삭제 할까요?");
	if(ans){
		var url = "twoving.do?command=adminNoticeDelete&nseq=" + nseq;
		location.href=url;
	}
}

function deleteFaq(qseq){
	var ans = confirm("정말로 삭제 할까요?");
	if(ans){
		var url = "twoving.do?command=adminFaqDelete&qseq=" + qseq;
		location.href=url;
	}
}

function go_wrt(){
	location.href="twoving.do?command=adminProductWriteForm";
}

function go_wrt2(){
	location.href="twoving.do?command=adminNoticeWriteForm";
}

function go_wrt3(){
	location.href="twoving.do?command=adminFaqWriteForm";
}

function cals(){
	var value1 = document.productWriteFrm.price1.value;
	var value2 = document.productWriteFrm.price2.value
	
	if( value1=="" || value2==""){
		return;
	}else{
		document.productWriteFrm.price3.value = value2 - value1;
	}
}


function go_save(){
	var theForm = document.productWriteFrm;
	if( theForm.kind.value==""){   
		alert('구분을 선택하세요'); 				theForm.kind.focus();
	}else if (theForm.genre.value == "") {
		alert('장르를 선택하세요.'); 				theForm.genre.focus();
	} else if (theForm.useyn.value == "") {
		alert('사용 유무를 선택하세요.'); 			theForm.useyn.focus();
	} else if (theForm.newyn.value == "") {
	alert('New 시리즈/영화를 선택하세요.'); 				theForm.newyn.focus();	
	} else if (theForm.bestyn.value == "") {
	alert('Best 시리즈/영화를 선택하세요.'); 				theForm.bestyn.focus();	
	} else if (theForm.age.value == "") {
		alert('관람 나이 제한을 선택하세요.'); 				theForm.age.focus();	
	} else if (theForm.year.value == "") {
		alert('년도를 입력하세요.'); 							theForm.year.focus();	
	} else if (theForm.time.value == "") {
		alert('영상 시간을 입력하세요.'); 							theForm.time.focus();	
	} else if (theForm.title.value == "") {
		alert('시리즈/영화명을 입력하세요.'); 				theForm.title.focus();	
	} else if (theForm.content.value == "") {
		alert('상세설명을 입력하세요.'); 		theForm.content.focus();
	} else if (theForm.image.value == "") {
		alert('상품이미지를 입력하세요.');		theForm.image.focus();	
	} else if (theForm.image2.value == "") {
		alert('상품이미지(디테일)를 입력하세요.');		theForm.image2.focus();	
	} else{
		theForm.action = "twoving.do?command=adminProductWrite";
		theForm.submit();
	}
}
		/*if ($("input[name='useyn']").is(":checked")) {
			$("input[name='useyn']").val("Y");
		} else {
			$("input[name='useyn']").val("N");
		}*/

function go_save2(){
	var theForm = document.noticeWriteFrm;
	if( theForm.title.value==""){   
		alert('제목을 입력하세요'); 				theForm.title.focus();
	}else if (theForm.content.value == "") {
		alert('내용을 입력하세요.'); 				theForm.content.focus();
	} else if (theForm.noticeyn.value == "") {
		alert('공지 유무를 선택하세요.'); 			theForm.noticeyn.focus();
	} else{
		theForm.action = "twoving.do?command=adminNoticeWrite";
		theForm.submit();
	}
}

function go_save3(){
	var theForm = document.faqWriteFrm;
	if( theForm.inquirylist.value==""){   
		alert('분류를 선택하세요'); 				theForm.inquirylist.focus();
	}else if (theForm.subject.value == "") {
		alert('제목을 입력하세요.'); 				theForm.subject.focus();
	} else if (theForm.content.value == "") {
		alert('내용을 입력하세요.'); 			theForm.content.focus();
	} else{
		theForm.action = "twoving.do?command=adminFaqWrite";
		theForm.submit();
	}
}



function go_mod( pseq ){
	var url = "twoving.do?command=adminProductUpdateForm&pseq=" + pseq;
	location.href=url;
}

function go_mod2( nseq ){
	var url = "twoving.do?command=adminNoticeUpdateForm&nseq=" + nseq;
	location.href=url;
}

function go_mod3( qseq ){
	var url = "twoving.do?command=adminFaqUpdateForm&qseq=" + qseq;
	location.href=url;
}

function go_update(){
	var theForm = document.productUpdateFrm;
	if( theForm.kind.value==""){   
		alert('구분을 선택하세요'); 				theForm.kind.focus();
	}else if (theForm.genre.value == "") {
		alert('장르를 선택하세요.'); 				theForm.genre.focus();
	} else if (theForm.useyn.value == "") {
		alert('사용 유무를 선택하세요.'); 			theForm.useyn.focus();
	} else if (theForm.newyn.value == "") {
	alert('New 시리즈/영화를 선택하세요.'); 				theForm.newyn.focus();	
	} else if (theForm.bestyn.value == "") {
	alert('Best 시리즈/영화를 선택하세요.'); 				theForm.bestyn.focus();	
	} else if (theForm.age.value == "") {
		alert('관람 나이 제한을 선택하세요.'); 				theForm.age.focus();	
	} else if (theForm.year.value == "") {
		alert('년도를 입력하세요.'); 							theForm.year.focus();	
	} else if (theForm.time.value == "") {
		alert('영상 시간을 입력하세요.'); 							theForm.time.focus();	
	} else if (theForm.title.value == "") {
		alert('시리즈/영화명을 입력하세요.'); 				theForm.title.focus();	
	} else if (theForm.content.value == "") {
		alert('상세설명을 입력하세요.'); 		theForm.content.focus();
	} else{
		theForm.action = "twoving.do?command=adminProductUpdate";
		theForm.submit();
	}
}

function go_update2(){
	var theForm = document.noticeUpdateFrm;
	if( theForm.title.value==""){   
		alert('제목을 입력하세요'); 				theForm.title.focus();
	}else if (theForm.content.value == "") {
		alert('내용을 입력하세요.'); 				theForm.content.focus();
	} else if (theForm.noticeyn.value == "") {
		alert('공지 유무를 선택하세요.'); 			theForm.noticeyn.focus();
	} else{
		theForm.action = "twoving.do?command=adminNoticeUpdate";
		theForm.submit();
	}
}

function go_update3(){
	var theForm = document.faqWriteFrm;
	if( theForm.kind.value==""){   
		alert('구분을 선택하세요'); 				theForm.kind.focus();
	}else if (theForm.genre.value == "") {
		alert('장르를 선택하세요.'); 				theForm.genre.focus();
	} else if (theForm.useyn.value == "") {
		alert('사용 유무를 선택하세요.'); 			theForm.useyn.focus();
	} else if (theForm.newyn.value == "") {
	alert('New 시리즈/영화를 선택하세요.'); 				theForm.newyn.focus();	
	} else if (theForm.bestyn.value == "") {
	alert('Best 시리즈/영화를 선택하세요.'); 				theForm.bestyn.focus();	
	} else if (theForm.age.value == "") {
		alert('관람 나이 제한을 선택하세요.'); 				theForm.age.focus();	
	} else if (theForm.year.value == "") {
		alert('년도를 입력하세요.'); 							theForm.year.focus();	
	} else if (theForm.time.value == "") {
		alert('영상 시간을 입력하세요.'); 							theForm.time.focus();	
	} else if (theForm.title.value == "") {
		alert('시리즈/영화명을 입력하세요.'); 				theForm.title.focus();	
	} else if (theForm.content.value == "") {
		alert('상세설명을 입력하세요.'); 		theForm.content.focus();
	} else {
		theForm.action = "twoving.do?command=adminFaqUpdate";
		theForm.submit();
	}
}


/*function go_order_save(){
	var count=0;
	if( document.frm.result.length == undefined ){   
		if( document.frm.result.checked == true ) count++;
	}else{  
		for( var i=0; i<document.frm.result.length ; i++)
			if( document.frm.result[i].checked==true)
				count++;
	}
	
	if (count == 0) {
	    alert("주문처리할 항목을 선택해 주세요.");
	}else{
		document.frm.action = "twoving.do?command=adminOrderSave";
		document.frm.submit();
	}
}*/



function go_rep(){
	if( document.inquiryViewFrm.reply.value==""){
		alert("답변내용을 입력하세요");
		document.inquiryViewFrm.reply.focus();
	}else{
		document.inquiryViewFrm.action = "twoving.do?command=adminCustomerInquiryReplyUpdateAction";
		document.inquiryViewFrm.submit();
	}
}



















