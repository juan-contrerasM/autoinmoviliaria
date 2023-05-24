package infrastructure.models.principal;

import java.time.LocalDate;
import java.util.ArrayList;

import domain.person.enumm.TipoUsuario;
import infrastructure.models.person.emp.*;
import infrastructure.models.person.admi.*;



public class Automoviliaria {
	//donde se guardan los objetos de cada tipo
		private ArrayList<Emp>listEmpleados= new ArrayList<>();
		private ArrayList<Admi>listAdministradores= new ArrayList<>();
	

		//constructor
		public Automoviliaria() {
			
		}
		
		public Emp guardarEmpleado(String documento, String nombre, String apellido, LocalDate nacimiento,  String email, String contrasenia,String telefono, TipoUsuario tipoUsuario) { 
			Emp emp= null;
			boolean existeEmpleado=verificadorEmpleado(documento, tipoUsuario);
			if( existeEmpleado) {
				
				
			}
			else {
				emp = new Emp(telefono, telefono, telefono, nacimiento, telefono, telefono);
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
		public Boolean verificadorEmpleado(String documento, TipoUsuario tipoUsuario) {
			Emp emp=null;
			boolean existeEmpleado=false;
			if(tipoUsuario==TipoUsuario.EMPLEADO) {
				emp= obtenerEmpleado(documento);
				if(emp!=null) {
					existeEmpleado=true;
				}
			}
			return existeEmpleado;
		}
		//busca el empleado y lo retorna
		public Emp obtenerEmpleado(String documento) {
			Emp emp=null;
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
