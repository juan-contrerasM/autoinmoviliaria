package infrastructure.models.person.client;

import java.time.LocalDate;

import domain.person.Person;
import infrastructure.models.person.common.MaritalStatusType;

public class Client extends Person {

	public Client(String document, String name, String lastName, LocalDate birth, MaritalStatusType estadoCivil,
			String password, String gmail) {
		super(document, name, lastName, birth, estadoCivil, password, gmail);
		
	}

}
