package jdbc;

import java.util.List;

public class PersonList_Select {

	public static void main(String[] args) {
		PersonDAO personDAO = PersonDAO.getInstance();
		
		List<PersonDTO> list = personDAO.allSelectPersonList();
		
		System.out.println("사람번호\t이름\t나이\t성별\t\t이메일\t\t\t주소");
		System.out.println("---------------------------------------------------------------");
		
		for(PersonDTO personDTO : list) {
			System.out.printf("%d\t%s\t%d\t%s\t%s\t\t%s\n", personDTO.getPerson_num(), personDTO.getName(), personDTO.getAge(), personDTO.getGender(), personDTO.getEmail(), personDTO.getAddress());
		}
		
	}

}
