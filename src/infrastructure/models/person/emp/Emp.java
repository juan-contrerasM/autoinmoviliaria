package infrastructure.models.person.emp;

import java.time.LocalDate;

import domain.person.Person;
import infrastructure.models.person.common.MaritalStatusType;

public class Emp extends Person{

	public Emp(String document, String name, String lastName, LocalDate birth, MaritalStatusType estadoCivil,
			String password, String gmail) {
		super(document, name, lastName, birth, estadoCivil, password, gmail);
		// TODO Auto-generated constructor stub
	}

}
