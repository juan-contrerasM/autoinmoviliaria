package ui.views.recoverPassword.controller;

import java.net.URL;
import java.util.ResourceBundle;

import domain.person.enumm.TypeRecoverPassword;
import domain.person.enumm.UserType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import ui.start.*;

public class ViewRecoverPasswordController implements Initializable {
	Main main= new Main();
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
    public ObservableList<TypeRecoverPassword> getListRecoverPassword() {
		return listRecoverPassword;
	}
	public void setListRecoverPassword(ObservableList<TypeRecoverPassword> listRecoverPassword) {
		this.listRecoverPassword = listRecoverPassword;
	}
    

}
