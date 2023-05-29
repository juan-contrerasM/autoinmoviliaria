package infrastructure.models.principal;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import infrastructure.models.person.emp.*;
import domain.person.enumm.TipoUsuario;
import domain.person.enumm.UserType;
import infrastructure.models.person.emp.*;

import infrastructure.models.person.admi.*;



public class Automoviliaria {
	//donde se guardan los objetos de cada tipo
	
		
		private ArrayList<Admi>listAdministradores= new ArrayList<>();
		private ArrayList<Emp>listEmpleados= new ArrayList<>();
		
		
		
		
		
		//constructor
		public Automoviliaria() {
			
		}
		
		public Emp guardarEmpleado(String documento, String nombre, String apellido, LocalDate nacimiento,  String email, String contrasenia,String telefono, UserType userType) throws IOException { 
			Emp nn= new Emp();
			nn.setDocument("12");
			nn.setName("hi");
			nn.setUserTyPe(UserType.EMPLEADO);
			listEmpleados.add(nn);
			
			
			Emp emp= null;
			boolean existeEmpleado=verificadorEmpleado(documento, userType);
			if( existeEmpleado) {
				System.out.println("ya existe");
				
			}
			else {
				emp = new Emp();
				emp.setDocument(documento);
				emp.setName(nombre);
				emp.setLastName(apellido);
				emp.setBirth(nacimiento);
				emp.setGmail(email);
				emp.setPassword(contrasenia);
				
				getListEmpleados().add(emp);
				
				
			
				
			}
			return emp;
			
		}
		//metodo para verificar si un empleado ya fue guardado
		public Boolean verificadorEmpleado(String documento, UserType userType) throws IOException {
			Emp emp=null;
			boolean existeEmpleado=false;
			if(userType==UserType.EMPLEADO) {
				emp= obtenerEmpleado(documento);
				if(emp!=null) {
					existeEmpleado=true;
				}
			}
			return existeEmpleado;
		}
		//busca el empleado y lo retorna
		public Emp obtenerEmpleado(String documento) throws IOException {
			Emp emp=null;
			System.out.println(listEmpleados.get(0).getDocument()+ "hola");
			
			for (Emp empleado : listEmpleados) {
			
				if( empleado.getDocument().equals(documento)) {
					emp= empleado;
					break;
				}
			}
			return emp;
		}

		public ArrayList<Emp> getListEmpleados() {
			return listEmpleados;
		}

		public void setListEmpleados(ArrayList<Emp> listEmpleados) {
			this.listEmpleados = listEmpleados;
		}

		public ArrayList<Admi> getListAdministradores() {
			return listAdministradores;
		}

		public void setListAdministradores(ArrayList<Admi> listAdministradores) {
			this.listAdministradores = listAdministradores;
		}
		
		

}
