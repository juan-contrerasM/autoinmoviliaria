package ui.views.principal.controller;

import domain.person.enumm.UserType;
import infrastructure.state.GlobalState;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import ui.start.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewPrincipalControllerView {
	
	//Main main = new Main();
	private Stage stage;
	GlobalState globalState = GlobalState.getInstance();

	@FXML
	private ImageView imgLogo;

	@FXML
	private Button btnRegisterClient;

	@FXML
	private Label lblUsername;

	@FXML
	private Button btnCatalogue;

	@FXML
	private Button btnReport;

	@FXML
	private Label lblNameUser;

	@FXML
	private Pane panelFondo;

	@FXML
	private Button btnAddCar;

	@FXML
	void Report(ActionEvent event) {
		System.out.println("Actual usuario -> " + globalState.getCurrentUser().getName());
		
		//main.closeWimdow(btnReport);
		//main.chargeWindowReport();
	}

	@FXML
	void RegisterCutomer(ActionEvent event) {
		//main.closeWimdow(btnReport);
		//main.chargeWindowRegisterCustomer();
	}

	@FXML
	void openWindowCatalogue(ActionEvent event) {
		//main.closeWimdow(btnReport);
		//main.chargeWindowCatalogue();
	}

	@FXML
	void addCar(ActionEvent event) {
		//main.closeWimdow(btnReport);
		//main.chargeWindowAddCar();
	}
	
	public void changeLabelButton(UserType nose) {
		if(nose == UserType.EMPLEADO) {
			btnRegisterClient.setText("Create client");
			btnRegisterClient.setOnAction(e -> hola());
			
		}
		if(nose == UserType.ADMINISTRADOR) {
			btnRegisterClient.setText("Create employee");
		}
	}
	
	void hola() {
		System.out.println("JOXPDFODF HIZO ESTOOO");
	}

}
