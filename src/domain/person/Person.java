package domain.person;

import java.time.LocalDate;
import domain.person.enumm.*;


public abstract class Person {
	
	private String document;
	private String name; 
	private String lastName;
	private String birth;
	private String password;
	private String gmail;
	private UserType userTyPe;
	
	
	public Person(String document, String name, String lastName, String birth,
			String password, String gmail,UserType userTyPe ) {
		this.document = document;
		this.name = name;
		this.lastName = lastName;
		this.birth = birth;
		this.password = password;
		this.gmail = gmail;
		this.userTyPe= userTyPe;
	}

	

	public UserType getUserTyPe() {
		return userTyPe;
	}

	public void setUserTyPe(UserType userTyPe) {
		this.userTyPe = userTyPe;
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

	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
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
