module automoviliaria {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.fasterxml.jackson.databind;
	requires java.logging;
	requires java.desktop;
	
	exports domain.person;
	exports infrastructure.models.person.emp;
	
	opens ui.start to javafx.graphics, javafx.fxml;
	opens ui.views.login.controller;
	opens ui.views.register.controller;
	opens ui.views.principal.controller;
	opens ui.views.addCar.controller;
	opens ui.views.catalogue.controller;
	opens ui.views.report.controller;
	opens ui.views.registerCustomer.controller;
	exports ui.views.principal.controller;
	exports ui.views.addCar.controller;
	exports ui.views.catalogue.controller;
	exports ui.views.report.controller;
	exports ui.views.registerCustomer.controller;
	

}
