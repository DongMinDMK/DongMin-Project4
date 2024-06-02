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
	}else if(document.inquiryForm.radio1.value==''){
		 var radios = document.getElementsByName('radio1');
    	 var formValid = false;
    	 
	    	 for (var i = 0; i < radios.length; i++) {
	        	if (radios[i].checked) {
	            formValid = true;
	            break;
       		}
    	}
    	
	    	if (!formValid) {
	        window.alert("문의종류 중 하나를 선택해주세요.");
	        return false; 
    	}	
	}else if(document.inquiryForm.inquirytitle.value==''){
		window.alert("문의할 제목을 먼저 입력해주세요...");
		document.inquiryForm.inquirytitle.focus();
		return false;
	}else if(document.inquiryForm.inquirycontent.value==''){
		window.alert("문의할 내용을 먼저 입력해주세요...");
		document.inquiryForm.inquirycontent.focus();
		return false;
	}else if(document.getElementById("checkColor").style.display === "none"){
		window.alert("이용약관에 동의해주세요.");
        return false; // 알림 창을 띄운 후 페이지 이동을 막음
	}else{
		return true;
	}
}

document.addEventListener("DOMContentLoaded", function(){
	// 클릭 이벤트를 추가할 요소를 찾습니다.
	var checkbox = document.querySelector('.bott-img-check-box');
	
	//클릭 이벤트 추가
	checkbox.addEventListener('click', function(){
		// 이미지 요소를 찾습니다.
		var checkimages = checkbox.querySelectorAll('img');
		
		
		checkimages.forEach(function(image){
			if(image.style.display === 'none'){
				image.style.display = 'inline-block';
			}else{
				image.style.display = 'none'
			}
		});
	});
});


