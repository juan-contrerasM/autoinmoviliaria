package infrastructure.models.person.client;
import domain.person.enumm.*;
import java.time.LocalDate;

import domain.person.Person;

public class Client extends Person {

	public Client(String document, String name, String lastName, String birth, String password, String gmail, UserType userTyPe) {
		super(document, name, lastName, birth, password, gmail, userTyPe);
		
	}

	

}
