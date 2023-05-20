package domain.person;

import java.time.LocalDate;

import infrastructure.models.person.common.MaritalStatusType;



public abstract class Person {
	
	private String document;
	private String name; 
	private String lastName;
	private LocalDate birth;
	private MaritalStatusType estadoCivil;
	private String password;
	private String gmail;
	
	
	public Person(String document, String name, String lastName, LocalDate birth, MaritalStatusType estadoCivil,
			String password, String gmail) {
		this.document = document;
		this.name = name;
		this.lastName = lastName;
		this.birth = birth;
		this.estadoCivil = estadoCivil;
		this.password = password;
		this.gmail = gmail;
	}

	

	public String getDocument() {
		return document;
	}


	public void setDocument(String document) {
		this.document = document;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LocalDate getBirth() {
		return birth;
	}


	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}


	public MaritalStatusType getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(MaritalStatusType estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	
	
	
	

	
}
