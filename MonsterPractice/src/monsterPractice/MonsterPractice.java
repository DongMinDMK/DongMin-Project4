package monsterPractice;

class Monster {
	private String name; //객체지향의 원칙 중 캡슐화에 대해 보여주기 위해 접근제한자를 private으로 설정
	private int age;
	
	public Monster() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	public void monsterMethod() {
		System.out.println(this.name + "의 나이는 " + this.age + "살 입니다.");
	}
}

public class MonsterPractice {

	public static void main(String[] args) {
		Monster monster = new Monster();
		
		// monster.name = "피카츄";
		// monster.age = 13;
		// 접근제한자가 private 인 Monster 클래스의 멤버 변수를 직접 접근할 수 없음.
	
		//그렇기 때문에 getter(), setter() 메소드를 통해 값을 입력받고 출력해야함.
		
		monster.setName("피카츄");
		monster.setAge(3);
		
		monster.monsterMethod();
		
		System.out.println();
		
		monster.setName("라이츄");
		monster.setAge(5);
		
		monster.monsterMethod();
		
		System.out.println();
		
		monster.setName("파이리");
		monster.setAge(7);
		
		monster.monsterMethod();
		
		System.out.println();
		
		monster.setName("꼬부기");
		monster.setAge(2);
		
		monster.monsterMethod();
	}

}
