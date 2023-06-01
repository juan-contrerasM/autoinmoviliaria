package infrastructure.models.person.emp;

import java.time.LocalDate;
import domain.person.enumm.*;
import domain.person.*;
import domain.person.enumm.*;

public class Emp extends Person {

	private StateType stateType;
	private UserType userType;

	public Emp(String document, String name, String lastName, String birth, String password, String gmail,
			UserType userTyPe) {
		super(document, name, lastName, birth, password, gmail, userTyPe);
		this.stateType = stateType;

	}

}
