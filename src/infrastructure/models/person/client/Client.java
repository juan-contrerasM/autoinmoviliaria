package infrastructure.models.person.client;
import domain.person.enumm.*;
import java.time.LocalDate;

import domain.person.Person;

public class Client extends Person {

	public Client(String document, String name, String lastName, LocalDate birth, String password, String gmail) {
		super(document, name, lastName, birth, password, gmail);
		
	}

	

}
