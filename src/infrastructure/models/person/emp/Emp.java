package infrastructure.models.person.emp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import domain.person.*;
import domain.person.enumm.*;

public class Emp extends Person {

	private StateType stateType;

	@JsonCreator
	public Emp(@JsonProperty("document") String document, @JsonProperty("name") String name,
			@JsonProperty("lastName") String lastName, @JsonProperty("birth") String birth,
			@JsonProperty("password") String password, @JsonProperty("gmail") String gmail,
			@JsonProperty("userTyPe") UserType userTyPe, @JsonProperty("recoverPassword")TypeRecoverPassword recoverPassword ) {
		super(document, name, lastName, birth, password, gmail, userTyPe);
		this.stateType = StateType.ACTIVE;
	}

	public StateType getStateType() {
		return stateType;
	}

	public void setStateType(StateType stateType) {
		this.stateType = stateType;
	}

}
