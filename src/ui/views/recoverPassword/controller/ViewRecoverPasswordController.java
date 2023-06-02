package ui.views.recoverPassword.controller;

import java.awt.HeadlessException;
import ui.views.changePassword.controller.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import domain.person.Person;
import domain.person.enumm.TypeRecoverPassword;
import domain.person.enumm.UserType;
import infrastructure.state.GlobalState;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.start.*;
import ui.views.login.controller.ViewLoginController;
import ui.views.principal.controller.ViewPrincipalControllerView;

public class ViewRecoverPasswordController implements Initializable {
	Main main= new Main();
	ViewLoginController loginController = new ViewLoginController();
	private GlobalState globalState = GlobalState.getInstance();
	private Stage stage;
	private Parent root;
	private Scene scene;
	private ObservableList<TypeRecoverPassword> listRecoverPassword = FXCollections.observableArrayList();
	@FXML
    private ImageView imgLogo;

    
	@FXML
    private Label lblRecoverPassword;

    @FXML
    private ComboBox<TypeRecoverPassword > comoboRecoverPassword;

    @FXML
    private Pane panelFondo;

    @FXML
    private Button btnConitune;
    @FXML
    void openWindowPassword(ActionEvent event) throws HeadlessException, IOException {
    
    	//main.closeWimdow(btnConitune);
    	//main.chargeWindowChangePassword();
    	sendToCHangePasswordView(event, null);
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listRecoverPassword.add(TypeRecoverPassword.CHEVROLET);
		listRecoverPassword.add(TypeRecoverPassword.METALCARSS);
		listRecoverPassword.add(TypeRecoverPassword.NISSAN);
		comoboRecoverPassword.setItems(listRecoverPassword);
		
	
	}
	
	
	
	
	void sendToCHangePasswordView(ActionEvent event, Person currentClient) throws HeadlessException, IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/views/changePassword/view/ViewChangePassword.fxml"));
		root = loader.load();

		ViewChangePasswordController scene2Controller = loader.getController();
		

		// root =
		// FXMLLoader.load(getClass().getResource("/ui/views/principal/view/ViewPrincipal2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
    public ObservableList<TypeRecoverPassword> getListRecoverPassword() {
		return listRecoverPassword;
	}
	public void setListRecoverPassword(ObservableList<TypeRecoverPassword> listRecoverPassword) {
		this.listRecoverPassword = listRecoverPassword;
	}
    

}
