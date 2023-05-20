package infrastructure.models.person.admi;

import java.time.LocalDate;

import domain.person.Person;
import infrastructure.models.person.common.MaritalStatusType;

public class Admi extends Person {

	
	public Admi(String document, String name, String lastName, LocalDate birth, MaritalStatusType estadoCivil,
			String password, String gmail) {
		super(document, name, lastName, birth, estadoCivil, password, gmail);
		
	}

}
