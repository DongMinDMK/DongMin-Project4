/*function go_search(){
	
document.getElementById("link").addEventListener("click", function(){
	// 여기에 원하는 조건을 설정하여 링크 주소를 결정합니다.
	var inquirylist=""; // inquirylist를 설정할 필요가 있는 경우 여기에 값을 설정.
	
	// 각각의 링크 주소
    var urls = {
        "memberCustomerLogin": "twoving.do?command=memberCustomerLogin&inquirylist=회원/로그인&page=1",
        "passTicket": "twoving.do?command=passTicket&inquirylist=이용권/결제&page=1",
        "loadingError": "twoving.do?command=loadingError&inquirylist=재생/오류&page=1",
        "nonpay": "twoving.do?command=nonpay&inquirylist=해지/환불&page=1",
        "servicerun": "twoving.do?command=servicerun&inquirylist=서비스 이용&page=1"
    };
	
	// 여러 조건을 설정하여 inquirylist에 맞는 링크를 결정합니다.
	
	var href="";
	if(inquirylist === "회원/로그인"){
		href= urls["memberCustomerLogin"];
	}else if(inquirylist === "이용권/결제"){
		href= urls["passTicket"];
	}else if(inquirylist === "재생/오류"){
		href= urls["loadingError"];
	}else if(inquirylist === "해지/환불"){
		href= urls["nonpay"];
	}else if(inquirylist === "서비스 이용"){
		href= urls["servicerun"];
	}
	
	// 최종적으로 링크 설정
	this.href = href;
	
	//페이지 이동 방지
	return true;
))};*/
