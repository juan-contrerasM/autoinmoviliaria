package ui.views.recoverPassword.controller;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import domain.person.Person;
import domain.person.enumm.TypeRecoverPassword;
import domain.person.enumm.UserType;
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
import ui.views.principal.controller.ViewPrincipalControllerView;

public class ViewRecoverPasswordController implements Initializable {
	Main main= new Main();
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
    void openWindowPassword(ActionEvent event) {
    	//main.closeWimdow(btnConitune);
    	main.chargeWindowChangePassword();
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listRecoverPassword.add(TypeRecoverPassword.CHEVROLET);
		listRecoverPassword.add(TypeRecoverPassword.METALCARSS);
		listRecoverPassword.add(TypeRecoverPassword.NISSAN);
		comoboRecoverPassword.setItems(listRecoverPassword);
		
	
	}
	
	
	
	
	void sendToMainView(ActionEvent event, Person currentClient) throws HeadlessException, IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/views/principal/view/ViewPrincipal2.fxml"));
		root = loader.load();

		ViewPrincipalControllerView scene2Controller = loader.getController();
		scene2Controller.changeLabelButton(currentClient.getUserTyPe());

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
