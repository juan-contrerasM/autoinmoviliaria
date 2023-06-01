package ui.views.registerCustomer.controller;

import java.io.IOException;
import ui.start.*;

import domain.person.enumm.UserType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ViewRegisterCustomerController {
		Main main= new Main();

	  @FXML
	    private ComboBox<?> ComboUserType;

	    @FXML
	    private DatePicker dateBirthy;

	    @FXML
	    private Button bthRegistrar;

	    @FXML
	    private TextField txtName;

	    @FXML
	    private Pane panel2;

	    @FXML
	    private TextField txtEmail;

	    @FXML
	    private TextField txtCell;

	    @FXML
	    private TextField txtLastName;

	    @FXML
	    private TextField txtDocument;

	    @FXML
	    private TextField txtPassword;

	    @FXML
	    void RegistrarUsuario(ActionEvent event) {
	    	//main.closeWimdow(bthRegistrar);
	    	main.carcarVentanaPrincipal();
	  
	    }
    

}
