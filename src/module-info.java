module automoviliaria {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.fasterxml.jackson.databind;
	
	opens ui.start to javafx.graphics, javafx.fxml;
	opens ui.views.login.controller;
	opens ui.views.register.controller;
}
