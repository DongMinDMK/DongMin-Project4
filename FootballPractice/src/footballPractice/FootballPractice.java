package footballPractice;

interface Football{
	public abstract void positionMethod();
	public abstract void mainPlayerMethod();
}

class Forward implements Football {
	String poistion;
	String mainPlayerName;
	
	public Forward() {
		
	}
	
	public Forward(String position, String mainPlayerName) {
		this.poistion = position;
		this.mainPlayerName = mainPlayerName;
	}

	public void introduceMethod() {
		System.out.println("축구라는 스포츠 종목에는 공격수라는 포지션이 있습니다.");
		System.out.println("공격수는 상대 팀의 골문에 골을 넣는 득점자 포지션입니다.");
	}
	
	@Override
	public void positionMethod() {
		System.out.println("공격수는 크게 " + this.poistion + " 포지션이 있습니다.");
	}

	@Override
	public void mainPlayerMethod() {
		System.out.println("스트라이커는 우리나라 선수 중 가장 대표적인 선수가 " + this.mainPlayerName + " 등을 예를 들 수 있습니다.");
	}
}

class Midfielder implements Football {
	String poistion;
	String mainPlayerName;
	
	public Midfielder() {
		
	}
	
	public Midfielder(String position, String mainPlayerName) {
		this.poistion = position;
		this.mainPlayerName = mainPlayerName;
	}
	
	public void midfielderMethod() {
		System.out.println("축구에서 포지션 중에 미드필더라는 포지션이 존재합니다.");
		System.out.println("이 포지션은 수비수와 공격수 사이에 위치하는 중간 매개체 역할로 수비수로부터 볼을 받고 득점 포지션인 공격수에게 패스를 찔러주는 역할을 하는 포지션이라고 할 수 있습니다.");
	}

	@Override
	public void positionMethod() {
		System.out.println("미드필더의 상세 포지션으로는 " + this.poistion + " 등이 존재합니다.");
	}

	@Override
	public void mainPlayerMethod() {
		System.out.println("우리나라에 선수 중에서 미드필더의 가장 적합하고 대표적인 선수는 " + this.mainPlayerName + "선수가 있습니다.");
	}
}

class Defender implements Football {
	String poistion;
	String mainPlayerName;
	
	public Defender() {
		
	}
	
	public Defender(String position, String mainPlayerName) {
		this.poistion = position;
		this.mainPlayerName = mainPlayerName;
	}
	
	public void defenderMethod() {
		System.out.println("추구라는 종목에는 수비수라는 포지션이 존재합니다.");
		System.out.println("수비수는 말 그대로 상대팀의 공격수들을 자신의 수비력, 몸싸움, 피지컬, 스피드 등을 통해 반칙 없이 공을 빼앗는 중요한 포지션입니다.");
	}

	@Override
	public void positionMethod() {
		System.out.println("수비수 상세 포지션은 " + this.poistion + " 등이 존재합니다.");
	}

	@Override
	public void mainPlayerMethod() {
		System.out.println("우리나라에서 제일 유명하고 대표적인 월드클래스 수비수는 " + this.mainPlayerName + "가 있습니다.");
		
	}
	
	
}

public class FootballPractice {

	public static void main(String[] args) {
		Forward forward = new Forward();
		forward.introduceMethod();
		
		Football fb = new Forward("스트라이커(ST), 스트라이커 옆을 보조하면서 발이 빠르고 크로스가 중요한 포지션인 윙어(LW,RW)", "조규성, 주민규 선수이고, 윙어는 월드스타 손흥민 선수와 황희찬 선수");
		fb.positionMethod();
		fb.mainPlayerMethod();
		
		System.out.println();
		
		
		Midfielder mf = new Midfielder();
		mf.midfielderMethod();
		
		fb = new Midfielder("공격형 미드필더(CAM), 중앙형 미드필더(CM), 수비형 미드필더(CDM)", "공격형 미드필더로는 이강인 선수, 중앙형 미드필더로는 이재성 선수, 수비형 미드필더로는 백승호 ");
		fb.positionMethod();
		fb.mainPlayerMethod();
		
		System.out.println();
		
		Defender df = new Defender();
		df.defenderMethod();
		
		fb = new Defender("센터백(CB), 좌우풀빽(LB/RB)", "김민재 선수");
		fb.positionMethod();
		fb.mainPlayerMethod();
		
	}

}
