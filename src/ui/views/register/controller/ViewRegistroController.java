package ui.views.register.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import ui.start.*;
import domain.person.enumm.TypeRecoverPassword;
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
	
	DataBase b = new DataBase();
	Automoviliaria a = new Automoviliaria();
	Main main= new Main();
	private ObservableList<TypeRecoverPassword> listRecoverPassword = FXCollections.observableArrayList();
	

	@FXML
	private ComboBox<UserType> ComboUserType;
	@FXML
	private ComboBox<TypeRecoverPassword> ComboKeyword;

	@FXML
	private TextField txtCountry;

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

	private ObservableList<UserType> listUserType = FXCollections.observableArrayList();

	@FXML
	void RegistrarUsuario(ActionEvent event) {
		registrarUsuario();
		//main.closeWimdow(bthRegistrar);
    main.carcarVentanaPrincipal();
	}

	public void registrarUsuario() {
		String document = txtDocument.getText();
		String name = txtName.getText();
		String lastName = txtLastName.getText();
		String birth = dateBirthy.getValue().toString();
		String phone = txtCell.getText();
		String email = txtEmail.getText();
		String password = txtPassword.getText();
		UserType userType = (UserType) ComboUserType.getSelectionModel().getSelectedItem();
		
		Emp employee = new Emp(document, name, lastName, birth, password, email, userType);
		
		b.convertClassAndSaveJson(employee, "resources/database/employee.json");
	}

	public void cargarTipoUsuaurio() {
		listUserType.add(UserType.ADMINISTRADOR);
		listUserType.add(UserType.EMPLEADO);
		ComboUserType.setItems(listUserType);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cargarTipoUsuaurio();
		listRecoverPassword.add(TypeRecoverPassword.CHEVROLET);
		listRecoverPassword.add(TypeRecoverPassword.METALCARSS);
		listRecoverPassword.add(TypeRecoverPassword.NISSAN);
		ComboKeyword.setItems(listRecoverPassword);
		
	}
	public ObservableList<TypeRecoverPassword> getListRecoverPassword() {
		return listRecoverPassword;
	}

	public void setListRecoverPassword(ObservableList<TypeRecoverPassword> listRecoverPassword) {
		this.listRecoverPassword = listRecoverPassword;
	}
}
