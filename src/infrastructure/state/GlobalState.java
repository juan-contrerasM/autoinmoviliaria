package infrastructure.state;

import java.util.ArrayList;
import infrastructure.models.person.admi.*;
import java.util.List;

import domain.person.Person;
import domain.vehicle.Car;
import infrastructure.models.person.emp.*;
import infrastructure.models.vehicle.car.Bus;

public class GlobalState {
	// Static variable reference of single_instance
	// of type Singleton
	private static GlobalState single_instance = null;
	private List<Emp> allEmployees = new ArrayList<Emp>();
	private List<Admi> allManagers = new ArrayList<Admi>();
	private List<Bus> allCars = new ArrayList<Bus>();
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

	public List<Admi> getAllManagers() {
		return allManagers;
	}

	public void setAllManagers(List<Admi> allManagers) {
		this.allManagers = allManagers;
	}
	
	public List<Bus> getAllCars() {
		return allCars;
	}

	public void setAllCars(List<Bus> allCars) {
		this.allCars = allCars;
	}
	
}
