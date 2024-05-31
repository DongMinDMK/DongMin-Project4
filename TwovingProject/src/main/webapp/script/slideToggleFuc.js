function slideToggleFuc(index){
	var content = document.getElementsByClassName('faq-content')[index];
	content.style.display === 'none' ? content.style.display = "block" : content.style.display = "none";
	
	
	/*$(function(){
		$("#toggleClass" + index).click(function(){
			$(".faq-content").toggle();
		});
	});*/
	/*document.addEventListener("DOMContentLoaded", function() {
        // FAQ 토글 버튼들을 가져옵니다.
        const toggleButtons = document.querySelectorAll(".toggle-btn");

        // 각 토글 버튼에 클릭 이벤트를 추가합니다.
        toggleButtons.forEach(button => {
            button.addEventListener("click", function() {
                // 현재 토글 버튼이 속한 FAQ의 내용 행을 찾습니다.
                const contentRow = button.parentNode.parentNode.nextElementSibling;

                // 내용 행을 토글합니다.
                if (contentRow.style.display === "none") {
                    contentRow.style.display = "table-row";
                } else {
                    contentRow.style.display = "none";
                }
            });
        });
    });*/
}