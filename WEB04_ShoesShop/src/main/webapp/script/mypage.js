function go_cart(){
	if(document.formm.quantity.value == ''){
		window.alert("수량을 입력하세요....");
		document.formm.quantity.focus();
		return false;
	}else{
		return true;
	}
}