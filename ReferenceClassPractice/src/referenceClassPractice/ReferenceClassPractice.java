package referenceClassPractice;

class ReferenceClass {
	int r;
}

public class ReferenceClassPractice {
	
	public static void function(ReferenceClass rc) {
		rc.r = rc.r * 3;
		System.out.println("전달 받은 rc의 주소 번지의 값의 결과는 " + rc.r);
	}

	public static void main(String[] args) {
		ReferenceClass c = new ReferenceClass();
		c.r = 10;
		
		function(c);  //메소드를 호출할 때 값이 아닌 클래스의 객체를 넘긴다. 즉 값이 아니라 주소를 넘긴다.
		System.out.println("function() 메소드를 실행 한 후 리턴으로 돌아와서 결과값 : " + c.r);

	}

}
