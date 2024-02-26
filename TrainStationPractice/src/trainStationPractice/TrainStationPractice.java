package trainStationPractice;

interface TrainStation {
	public abstract void stationMethod();
}

class DongDaeMun implements TrainStation{
	String number;
	String introduction;
	
	public DongDaeMun(String number, String introduction) {
		this.number = number;
		this.introduction = introduction;
	}

	@Override
	public void stationMethod() {
		System.out.println("동대문역사문화공원역은 " + this.number + "들이 다니고 갈아탈 수 있는 역입니다.");
	}
	
	public void introMethod() {
		System.out.println(this.introduction);
	}
}

class ZamSil implements TrainStation {
	String number;
	String introduction;
	
	public ZamSil(String number, String introduction) {
		this.number = number;
		this.introduction = introduction;
	}

	@Override
	public void stationMethod() {
		System.out.println("잠실역은 " + this.number + "이 다니는 역입니다.");
	}
	
	public void introMethod() {
		System.out.println(this.introduction);
	}
	
	public void zamsilMethod() {
		System.out.println("잠실역은 또한 어린이들과 학생들이 좋아할만한 롯데월드가 있어 인기가 많은 역입니다.");
	}
}

public class TrainStationPractice {

	public static void main(String[] args) {
		TrainStation ts = new DongDaeMun("2호선, 4호선, 5호선", "3개의 호선이 다니므로 출근길이나 퇴근길때 이 역은 매우 혼잡한 역 중 하나입니다.");
		ts.stationMethod();
		
		DongDaeMun ddm = (DongDaeMun) ts;
		ddm.introMethod();
		
		ts = new ZamSil("2호선, 8호선", "2개의 호선이 다니며 잠실역은 워낙 사람이 많아 출근, 퇴근 길 뿐만 아니라 주말에도 항상 사람이 분비는 핫플레이스입니다.");
		ts.stationMethod();
		
		ZamSil zs = (ZamSil) ts;
		zs.introMethod();
		zs.zamsilMethod();
	}

}
