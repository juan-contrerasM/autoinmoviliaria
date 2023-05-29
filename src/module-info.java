module automoviliaria {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.fasterxml.jackson.databind;
	requires java.logging;
	requires java.desktop;
	
	opens ui.start to javafx.graphics, javafx.fxml;
	opens ui.views.login.controller;
	opens ui.views.register.controller;
	exports ui.views.principal.controller;

}
