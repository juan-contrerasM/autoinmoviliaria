package infrastructure.models.person.emp;

import java.time.LocalDate;

import domain.person.*;
import domain.person.enumm.*;

public class Emp extends Person{
	
	
	private StateType stateType; 

	public Emp(String document, String name, String lastName, LocalDate birth, String password, String gmail) {
		super(document, name, lastName, birth, password, gmail);
		this.stateType =  stateType;
		
	}


}
