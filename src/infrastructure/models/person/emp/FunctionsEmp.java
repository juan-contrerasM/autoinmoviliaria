package infrastructure.models.person.emp;

import java.util.List;

import domain.person.enumm.StateType;
import domain.person.enumm.UserType;

public class FunctionsEmp {

	public FunctionsEmp() {
	}

	// metodo para verificar si un empleado ya fue guardado
	public Boolean verificadorEmpleado(String documento, UserType userType, List<Emp> listEmpleados) {
		Emp emp = null;
		boolean existEmployee = false;
		if (userType == UserType.EMPLEADO) {
			emp = getEmployee(documento, listEmpleados);
			if (emp != null) {
				existEmployee = true;
			}
		}
		return existEmployee;
	}

	public Emp checkLoginEmployee(String document, String password, List<Emp> listEmployee) {
	
		for (Emp empleado : listEmployee) {
			System.out.println(empleado.getName() + "nos jodimos");
		}
		Emp employee = listEmployee.stream()
				.filter(empl -> document.equals(empl.getDocument()) && password.equals(empl.getPassword())).findAny()
				.map(encontrado -> encontrado).orElse(null);
		return employee;
	}

	// busca el empleado y lo retorna
	public Emp getEmployee(String documento, List<Emp> listEmpleados) {
		Emp emp = null;
		for (Emp empleado : listEmpleados) {
			if (empleado.getDocument().equals(documento)) {
				emp = empleado;
				break;
			}
		}
		return emp;
	}

	public void changeStateEmployee(StateType stateType, String documento, List<Emp> listEmpleados) {
		Emp currentEmployee = getEmployee(documento, listEmpleados);
		currentEmployee.setStateType(stateType);
	}
}
