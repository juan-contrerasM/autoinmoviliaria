module automoviliaria {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.fasterxml.jackson.databind;
	requires java.logging;
	requires java.desktop;
	requires com.fasterxml.jackson.annotation;
	requires java.compiler;
	

	exports domain.person;
	exports domain.person.enumm;
	exports infrastructure.models.person.emp;
	
	opens ui.start to javafx.graphics, javafx.fxml;
	opens ui.views.login.controller;
	opens ui.views.register.controller;
	opens ui.views.principal.controller;
	opens ui.views.addCar.controller;
	opens ui.views.catalogue.controller;
	opens ui.views.report.controller;
	opens ui.views.registerCustomer.controller;
	opens ui.views.recoverPassword.controller;
	opens ui.views.changePassword.controller;
	exports ui.views.changePassword.controller;
	exports ui.views.recoverPassword.controller;
	exports ui.views.principal.controller;
	exports ui.views.addCar.controller;
	exports ui.views.catalogue.controller;
	exports ui.views.report.controller;
	exports ui.views.registerCustomer.controller;
	

}
