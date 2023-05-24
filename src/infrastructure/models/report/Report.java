package infrastructure.models.report;
import java.time.LocalDate;

import infrastructure.models.person.client.Client;
import infrastructure.models.person.emp.Emp;
import domain.person.enumm.*;
import domain.vehicle.*;

public class Report {

	private Client client;
	private LocalDate date;
	private Emp emp;
	private ProcedureType procedureType;
	private Vehicle vehicle;
	
	
	public Report(Client client, LocalDate date, Emp emp, ProcedureType procedureType, Vehicle vehicle) {
		this.client = client;
		this.date = date;
		this.emp = emp;
		this.procedureType= procedureType;
		this.vehicle = vehicle;
	}
	
	
	
	
}
