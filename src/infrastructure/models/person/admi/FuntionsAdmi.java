package infrastructure.models.person.admi;

import java.util.List;

import domain.person.enumm.StateType;
import domain.person.enumm.UserType;
import infrastructure.models.person.emp.Emp;

public class FuntionsAdmi {
	// metodo para verificar si un empleado ya fue guardado
	public Boolean verificadorAdmi(String documento, UserType userType, List<Admi> listAdmi) {
		Admi manager = null;
		boolean existEmployee = false;
		if (userType == UserType.ADMINISTRADOR) {
			manager = getAdmi(documento, listAdmi);
			if (manager != null) {
				existEmployee = true;
			}
		}
		return existEmployee;
	}

	public Admi checkLoginAdmi(String document, String password, List<Admi> listAdmi) {

		Admi manager = listAdmi.stream()
				.filter(admi -> document.equals(admi.getDocument()) && password.equals(admi.getPassword())).findAny()
				.map(encontrado -> encontrado).orElse(null);
		return manager;
	}

	
	
	// busca el empleado y lo retorna
	public Admi getAdmi(String documento, List<Admi> listAdmi) {
		Admi manager = null;
		for (Admi admi : listAdmi) {
			if (admi.getDocument().equals(documento)) {
				manager = admi;
				break;
			}
		}
		return manager;
	}

	public void changeStateManager(StateType stateType, String documento, List<Admi> listAdmi) {
		Admi currentAdmi = getAdmi(documento, listAdmi);
		
	}

}
