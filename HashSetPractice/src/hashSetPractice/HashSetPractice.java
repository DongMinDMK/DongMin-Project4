package hashSetPractice;
import java.util.*;

class Person {
	int personId;
	String personName;
	
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public int hashCode() { // hashcode() 메소드를 Object 조상 클래스에서 오버라이딩 하여 객체의 고유 id를 반환
		return personId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) { // 비교 대상 객체가 Member 클래스 이면
			Person per =(Person) obj; // Object의 obj 객체를 Person 클래스의 객체로 강제 형 변환
			
			if(this.personId == per.personId) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
		
	}
	
	
}

public class HashSetPractice {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setPersonId(1);
		person1.setPersonName("DMK");
		
		person2.setPersonId(1);
		person2.setPersonName("DMK");
		
		// Set을 통해 제네릭타입으로 생성
		// Set은 중복을 허용하지 않음.
		
		Set<Person> list = new HashSet<Person>(); 
		
		list.add(person1);
		list.add(person2); //중복을 허용하지 않는 것을 확인하기 위해 똑같은 데이터를 객체만 다르게 하여 list에 넣음.
		
		
		System.out.println("현재 Set에 들어있는 리스트 크기는 : " + list.size()); // 중복이면 크기가 2가 되어야 함. 하지만 실행한 결과는 1
		
		
		
		
		

	}

}
