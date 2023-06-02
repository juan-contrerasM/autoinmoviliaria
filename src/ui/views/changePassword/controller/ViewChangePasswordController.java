package ui.views.changePassword.controller;

import java.awt.HeadlessException;
import java.io.IOException;

import domain.person.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.start.*;
import ui.views.login.controller.ViewLoginController;
import ui.views.principal.controller.ViewPrincipalControllerView;

public class ViewChangePasswordController {
	Main main= new Main();
	private Stage stage;
	private Parent root;
	private Scene scene;
    @FXML
    private Label lblText;

    @FXML
    private Button btnChange;

    @FXML
    private TextField lblPassword;

    @FXML
    private Pane panelFondo;

    @FXML
    void Change(ActionEvent event) throws HeadlessException, IOException {
    	//main.closeWimdow(btnChange);
    	sendToMainView(event, null);

    }
    void sendToMainView(ActionEvent event, Person currentClient) throws HeadlessException, IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/views/login/view/ViewLogin.fxml"));
		root = loader.load();

		ViewLoginController scene2Controller = loader.getController();
		
		// root =
		// FXMLLoader.load(getClass().getResource("/ui/views/principal/view/ViewPrincipal2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
