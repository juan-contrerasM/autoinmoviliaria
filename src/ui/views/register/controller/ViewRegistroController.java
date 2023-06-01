package ui.views.register.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import ui.start.*;
import domain.person.enumm.UserType;
import infrastructure.models.person.emp.*;
import infrastructure.models.principal.Automoviliaria;
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

public class ViewRegistroController implements Initializable {
	DataBase b= new DataBase();
	Automoviliaria a= new Automoviliaria();
	Main main= new Main();
	 @FXML
	    private ComboBox<UserType> ComboUserType;

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
	    
	    private ObservableList<UserType> listUserType= FXCollections.observableArrayList();
	


    
    @FXML
	 void RegistrarUsuario(ActionEvent event) throws IOException {
		 
    	registrarUsuario();
    	main.closeWimdow(bthRegistrar);
    	main.carcarVentanaPrincipal();
    	
    	
	 }
    
    
    public void registrarUsuario() throws IOException {
    	String documento= txtDocument.getText();
    	String nombre= txtName.getText();
    	String apellido=txtLastName.getText();
    	LocalDate nacimiento= dateBirthy.getValue();
    	String telefono=txtCell.getText();
    	String email= txtEmail.getText();
    	String contrasenia=txtPassword.getText();
    	UserType userType= (UserType) ComboUserType.getSelectionModel().getSelectedItem();
    	a.guardarEmpleado(documento, nombre, apellido, nacimiento, email, contrasenia, telefono, userType);
    	
    	//b.convertClassAndSaveJason(e);		
	}
    public void cargarTipoUsuaurio() {
    	listUserType.add(UserType.ADMINISTRADOR);
    	listUserType.add(UserType.EMPLEADO);
    	ComboUserType.setItems(listUserType);
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
		cargarTipoUsuaurio();
    
    }
}
