package infrastructure.models.person.admi;
import domain.person.Person;
import domain.person.enumm.UserType;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Admi extends Person {
	@JsonCreator
	public Admi(@JsonProperty("document") String document, @JsonProperty("name") String name,
			@JsonProperty("lastName") String lastName, @JsonProperty("birth") String birth,
			@JsonProperty("password") String password, @JsonProperty("gmail") String gmail,
			@JsonProperty("userTyPe") UserType userTyPe) {
		super(document, name, lastName, birth, password, gmail, userTyPe);
	}
		// TODO Auto-generated constructor stub
	

	

}
