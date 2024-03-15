package webClientServerPractice;

interface Web {
	public abstract void introduceMethod(); //추상 메소드 생성
}

//웹 개발에 필요한 핵심 내용 정리
class WebDevelop implements Web{ // 인터페이스를 상속
	String name;
	String introduce;
	
	public WebDevelop(String name, String introduce) { // 파라미터로 문자열 name, introduce를 받는 생성자 생성
		this.name = name;
		this.introduce = introduce;
	}

	@Override
	public void introduceMethod() {
		System.out.println("웹에서 개발을 진행 할 때는 " + this.name + "가 있습니다.");
		System.out.println("이것을 생각하여 백엔드 서버 개발자는 개발을 진행해야 합니다.");
	}
	
	public void sessionAndCookieMethod() {
		System.out.println(this.introduce);
		System.out.println("세션은 서버에서 관리하는 것이고 사용자가 로그인을 하면 로그인한 정보를 서버에서 관리하고, 랜덤한 세션ID를 클라이언트에 응답헤더를 통해 내려주게 된다.");
		System.out.println("쿠키는 서버가 아닌 클라이언트의 저장소에서 관리하는 것이고, 서버(응답헤더)에서 보낸 세션 ID나 쿠키를 받아 추후 다시 서버에 요청할 때 요청 헤더에 데이터와 함께 실어보내고 서버에서 그것을 인증하여 통과시켜주거나 리턴을 보낸다. ");
		System.out.println("웹 개발에서 세션과 쿠키에 관한 정의는 중요하므로 꼭 알아둘 필요가 있다.");
	}
	
	public void serverExcuteSequenceMethod() {
		System.out.println("서버에서는 대략 큰 틀로 MVC패턴으로 작동하지만 MVC 패턴을 거친다.");
		System.out.println("그렇지만 MVC 패턴을 거치기 전에 클라이언트가 요청을 보내면 일단 Filter를 먼저 거치게 되고 그다음 Intercepter를 통해 Controller에 진입하기 전 인증과 인가를 처리한다.");
		System.out.println("intercepter를 지나고 나서 그제서야 controller에 진입을 하게 되고 서버에서 내부 처리를 진행한다. 진행하다 오류가 발생하거나 예외가 발생하면 Exception Handler를 통해 처리하고, 정상적으로 실행한 결과를 다시 intercepter - filter - response를 통해 클라이언트에게 전달된다.");
		System.out.println("이러한 서버에서 진행하는 작동순서는 중요하다.");
	}
}

public class WebClientServerPractice {

	public static void main(String[] args) {
		Web web = new WebDevelop("사용자 즉 이용자가 직접 입력하여 데이터를 전송하는 클라이언트와 그 접속한 데이터를 받아 관리하고 처리하는 서버", "웹에서는 세션과 쿠키가 존재한다."); //업캐스팅 강제형변환
		web.introduceMethod();
		
		System.out.println();
		
		WebDevelop wd = (WebDevelop) web; // 다운캐스팅 강제형변환
		wd.sessionAndCookieMethod();
		wd.serverExcuteSequenceMethod();
	}

}
