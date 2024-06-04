function updateDefuseCheck(productname){
	if(productname === '광고형 스탠다드'){
		var url="twoving.do?command=updateDefuseCheck&productname=" + productname;
		var opt="toolbar=no, menubar=no, resizable=no, width=600, height=800, scrollbars=yes";
		
		window.open(url, "updateDefuseCheck", opt);
	}else if(productname === '스탠다드'){
		var url="twoving.do?command=updateDefuseCheck&productname=" + productname;
		var opt="toolbar=no, menubar=no, resizable=no, width=600, height=800, scrollbars=yes";
		
		window.open(url, "updateDefuseCheck", opt);
	}else{
		var url="twoving.do?command=updateDefuseCheck&productname=" + productname;
		var opt="toolbar=no, menubar=no, resizable=no, width=600, height=800, scrollbars=yes";
		
		window.open(url, "updateDefuseCheck", opt);
	}
}

function allPassTicketView(productname){
	if(productname === '광고형 스탠다드'){
		var url="twoving.do?command=allPassTicketView&productname=" + productname;
		var opt="toolbar=no, menubar=no, resizable=no, width=600, height=800, scrollbars=yes";
		
		window.open(url, "allPassTicketView", opt);
	}else if(productname === '베이직'){
		var url="twoving.do?command=allPassTicketView&productname=" + productname;
		var opt="toolbar=no, menubar=no, resizable=no, width=600, height=800, scrollbars=yes";
		
		window.open(url, "allPassTicketView", opt);
	}else if(productname === '스탠다드'){
		var url="twoving.do?command=allPassTicketView&productname=" + productname;
		var opt="toolbar=no, menubar=no, resizable=no, width=600, height=800, scrollbars=yes";
		
		window.open(url, "allPassTicketView", opt);
	}else{
		var url="twoving.do?command=allPassTicketView&productname=" + productname;
		var opt="toolbar=no, menubar=no, resizable=no, width=600, height=800, scrollbars=yes";
		
		window.open(url, "allPassTicketView", opt);
	}
}

function hoverEffect(element) {
     element.style.backgroundColor = "red";
     element.style.color = "white";
     
}
    
function resetColor(element) {
     element.style.backgroundColor = "gray";
     element.style.color = "white";
     
}

function colorRedOrGray(element){
	if(element.style.backgroundColor === 'red'){
		element.style.backgroundColor = 'gray';
		element.style.color = 'white';
	}else if(element.style.backgroundColor === 'gray'){
		element.style.backgroundColor = 'red';
		element.style.color = 'white';
	}
}


   