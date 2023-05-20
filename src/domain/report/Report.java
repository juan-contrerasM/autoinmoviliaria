package domain.report;

import java.time.LocalDate;

import domain.vehicle.Vehicle;
import infrastructure.models.person.client.Client;
import infrastructure.models.person.emp.Emp;

public abstract class Report {
	private Client client;
	private LocalDate date;
	private Emp employee;
	private Vehicle car;
	
	public Report(Client client, LocalDate date, Emp employee, Vehicle car) {
		
		this.client = client;
		this.date = date;
		this.employee = employee;
		this.car = car;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Emp getEmployee() {
		return employee;
	}

	public void setEmployee(Emp employee) {
		this.employee = employee;
	}

	public Vehicle getCar() {
		return car;
	}

	public void setCar(Vehicle car) {
		this.car = car;
	}
	
	
	
	
	

}
