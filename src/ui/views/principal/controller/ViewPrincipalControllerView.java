package ui.views.principal.controller;

import java.awt.HeadlessException;
import ui.views.registerCustomer.controller.*;
import java.io.IOException;

import domain.person.Person;
import domain.person.enumm.UserType;
import infrastructure.state.GlobalState;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
	
	GlobalState globalState = GlobalState.getInstance();
	private Stage stage;
	private Parent root;
	private Scene scene;

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
	void RegisterCutomer(ActionEvent event) throws HeadlessException, IOException {
		//main.closeWimdow(btnReport);
		System.out.println("hola");
		sendToCreateClientView(event);
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
			btnRegisterClient.setOnAction(e -> {
				try {
					RegisterCutomer(e);
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
		}
		if(nose == UserType.ADMINISTRADOR) {
			btnRegisterClient.setText("Create employee");
		}
	}
	
	
	void sendToCreateClientView(ActionEvent event) throws HeadlessException, IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/views/registerCustomer/view/ViewRegisterCustomer.fxml"));
		root = loader.load();

		ViewRegisterCustomerController scene2Controller = loader.getController();
		

		// root =
		// FXMLLoader.load(getClass().getResource("/ui/views/principal/view/ViewPrincipal2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
