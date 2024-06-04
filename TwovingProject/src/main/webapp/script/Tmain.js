	var num = 0;	
 		window.onload = function(){changeCss(num);};

 	var ing = window.setInterval(function(){
			for( var i=1; i<=6; i++){ 
            document.getElementById('btn' + i).style.background = 'skyblue';   
            }          
            document.getElementById('btn' + (num+1)).style.background = 'white';
            
            num++;
            if(num>5) num = 0;
                  
            var dist =  - 1890*num;
            document.getElementById("mainmain").style.left = dist + 'px' ;
            
        }, 2000 );



function moveLeft() {
           
            if(num == 0 ) return; 
                       
            num--;
            
            var dist =  - 1890 * num;
            document.getElementById("mainmain").style.left = dist + 'px';
            changeCss(num);          
        }
        
        
function moveRight() {
           
            if(num==5) return;
           
           
          	num++ ;
          	
          	var dist = -1890* num;
           document.getElementById("mainmain").style.left = dist + 'px';
           changeCss(num);
           
           clearInterval(ing);
           
           ing = window.setInterval(function() {
        	for (var i = 1; i <= 6; i++) {
            document.getElementById('btn' + i).style.background = 'skyblue';
        	}
        	document.getElementById('btn' + (num + 1)).style.background = 'white';
				num++;
				
	        if (num > 5) num = 0;
	        
	        var dist = -1890*num;
	         document.getElementById("mainmain").style.left= dist+'px' ;
			}, 2000);
	   }
        
        
function changeCss(num) {
            for( var i=1; i<=6; i++){
            document.getElementById('btn' + i).style.background = 'skyblue';
                
            }
            document.getElementById('btn' + (num+1)).style.background = 'white';           
        }
        


function go_search(command){
	var url = "twoving.do?command=" + command;
	document.form.action = url;
	document.form.submit(); 	
}
  
        
var a =true;   

function steamed(){
    
    if(a ==true){
        document.getElementById("c").style.background = 'red';
       /* document.formm.action='twoving.do?command=steamedInsert';*/
		/*document.formm.submit();*/
     return  a = false;
    } else {
        document.getElementById("c").style.background = 'white';
        /*document.formm.action="twoving.do?command=steamedDelete";*/
      return  a = true;
    }
}


		
        
        
       /* function share(){
			
			
		}*/
		
		
        
        


        
        