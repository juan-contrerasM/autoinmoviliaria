package infrastructure.models.person.admi;
import domain.person.Person;
import domain.person.enumm.UserType;

import java.time.LocalDate;

public class Admi extends Person {

	public Admi(String document, String name, String lastName, LocalDate birth, String password, String gmail,UserType userTyPe) {
		super(document, name, lastName, birth, password, gmail, userTyPe);
		// TODO Auto-generated constructor stub
	}

	

}
