function emailSelect(){
	var emailList = document.getElementById('emailList');
	var option = emailList.options[emailList.selectedIndex];
	
	document.getElementById('email-datail2').value = option.value;
}

function inquiryCheck(){
	if(document.inquiryForm.emailid.value=='' && document.inquiryForm.emailid2.value==''){
		window.alert("이메일을 먼저 입력해주세요...");
		document.inquiryForm.emailid.focus();
		return false;
	}else if(document.inquiryForm.phone1.value=='' && document.inquiryForm.phone2.value == ''){
		window.alert("연락처를 먼저 입력해주세요...");
		document.inquiryForm.phone1.focus();
		return false;
	} else if(document.inquiryForm.radio1.value==''){
		window.alert("문의종류에서 하나를 무조건 선택하셔야 합니다...");
		document.inquiryForm.radio1.focus();
		return false;
	}else if(document.inquiryForm.inquirytitle.value=''){
		window.alert("문의할 제목을 먼저 입력해주세요...");
		document.inquiryForm.inquirytitle.focus();
		return false;
	}else if(document.inquiryForm.inquirycontent.value==''){
		window.alert("문의할 내용을 먼저 입력해주세요...");
		document.inquiryForm.inquirytitle.focus();
		return false;
	}else{
		return true;
	}
}


