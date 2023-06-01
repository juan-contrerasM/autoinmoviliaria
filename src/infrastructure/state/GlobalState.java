package infrastructure.state;

import java.util.ArrayList;
import java.util.List;

import domain.person.Person;
import infrastructure.models.person.emp.*;

public class GlobalState {
	// Static variable reference of single_instance
	// of type Singleton
	private static GlobalState single_instance = null;
	private List<Emp> allEmployees = new ArrayList<Emp>();
	private Person currentUser = null;

	// Constructor
	// Here we will be creating private constructor
	// restricted to this class itself
	private GlobalState() {
	}

	// Static method
	// Static method to create instance of Singleton class
	public static synchronized GlobalState getInstance() {
		if (single_instance == null)
			single_instance = new GlobalState();

		return single_instance;
	}

	public List<Emp> getAllEmployees() {
		return allEmployees;
	}

	public void setAllEmployees(List<Emp> allEmployees) {
		this.allEmployees = allEmployees;
	}
	
	public Person getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(Person currentUser) {
		this.currentUser = currentUser;
	}

}
