package ui.views.register.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.fasterxml.jackson.core.JsonProcessingException;

import infrastructure.models.person.emp.*;
import infrastructure.database.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ViewRegistroController {
	DataBase b= new DataBase();
	 @FXML
	    private ComboBox<?> ComboUserType;

	    @FXML
	    private DatePicker dateBirthy;

	    @FXML
	    private AnchorPane panelPrincipal;

	    @FXML
	    private Button bthRegistrar;

	    @FXML
	    private TextField txtName;

	    @FXML
	    private Label lblText;

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
	 void RegistrarUsuario(ActionEvent event) throws JsonProcessingException {
		 
    	registrarUsuario();
	 }
    
    public void registrarUsuario() throws JsonProcessingException {
    	String documento= txtDocument.getText();
    	String nombre= txtName.getText();
    	String apellido=txtLastName.getText();
    	LocalDate nacimiento= dateBirthy.getValue();
    	String telefono=txtCell.getText();
    	String email= txtEmail.getText();
    	String contrasenia=txtPassword.getText();
    	
    	Emp  e= new Emp(documento,nombre,apellido,nacimiento,contrasenia,email);
    	b.convertClassAndSaveJason(e);
 			
	}
}
