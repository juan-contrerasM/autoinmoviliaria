package ui.views.login.controller;

import java.awt.HeadlessException;
import ui.views.recoverPassword.controller.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import infrastructure.models.person.admi.Admi;
import infrastructure.models.person.admi.FuntionsAdmi;
import infrastructure.models.person.emp.*;
import domain.person.Person;
import domain.person.enumm.UserType;
import infrastructure.models.principal.Automoviliaria;
import infrastructure.state.GlobalState;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import ui.start.Main;
import ui.views.principal.controller.ViewPrincipalControllerView;
import ui.views.register.controller.ViewRegistroController;

public class ViewLoginController implements Initializable {

	// Main main = new Main();
	Automoviliaria automoviliaria = new Automoviliaria();
	GlobalState globalState = GlobalState.getInstance();
	FunctionsEmp functionsEmp = new FunctionsEmp();
	FuntionsAdmi funtionsAdmi= new FuntionsAdmi();

	private ObservableList<UserType> listUserType = FXCollections.observableArrayList();
	private Stage stage;
	private Parent root;
	private Scene scene;
	// Stage stage = new Stage();

	@FXML
	private Text txtSingup;

	@FXML
	private ImageView imgCandado;

	@FXML
	private ImageView imgPerson;

	@FXML
	private TextField txtDocument;

	@FXML
	private Button btnRegistrarse;

	@FXML
	private ImageView imgLogo;

	@FXML
	private Pane pane2;

	@FXML
	private ComboBox<UserType> comboUserType;

	@FXML
	private AnchorPane pane;

	@FXML
	private Label txtUserType;

	@FXML
	private TextField txtContrasenia;

	@FXML
	private Button btnEntrar;

	@FXML
	void recuperarClave(MouseEvent event) throws HeadlessException, IOException {
		Person currentUser = getFieldsEmp();
		sendToRecoverPasswordView(event, currentUser );
	}

	@FXML
	void registrarse(ActionEvent event) {
		// main.closeWimdow(btnEntrar);
		// main.carcarVentanaRegistro();
	}

	@FXML
	void entrar(ActionEvent event) throws HeadlessException, IOException {
		Person currentUser = getFieldsEmp();
		if (currentUser != null) {
			sendToMainView(event, currentUser);
			return;
		}
		else {
			 currentUser = getFieldsAdmi();
			 if (currentUser != null) {
					sendToMainView(event, currentUser);
					return;
				}
			
		}
		JOptionPane.showMessageDialog(null, "credenciales incorrectas");
		
	}

	public Person getFieldsEmp() {
		String document = txtDocument.getText();
		String password = txtContrasenia.getText();
		UserType userType = (UserType) comboUserType.getSelectionModel().getSelectedItem();

		List<Emp> employees = globalState.getAllEmployees();
		Emp currentUser = functionsEmp.checkLoginEmployee(document, password, employees);

		if (currentUser != null) {
			System.out.println("debrioeod entar");
			globalState.setCurrentUser(currentUser);
		}
		

		return currentUser;

	}
	public Person getFieldsAdmi() {
		String document = txtDocument.getText();
		String password = txtContrasenia.getText();
		UserType userType = (UserType) comboUserType.getSelectionModel().getSelectedItem();

		List<Admi> managers = globalState.getAllManagers();
		Admi currentUserAdmi = funtionsAdmi.checkLoginAdmi(document, password, managers);

		if (currentUserAdmi != null) {
			System.out.println("debrioeod entar");
			globalState.setCurrentUser(currentUserAdmi);
		}
		return currentUserAdmi;
	}
//open window
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
	void sendToRecoverPasswordView(MouseEvent event, Person currentClient) throws HeadlessException, IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/views/recoverPassword/view/ViewRecoverPassword.fxml"));
		root = loader.load();

		ViewRecoverPasswordController scene2Controller = loader.getController();
		

		// root =
		// FXMLLoader.load(getClass().getResource("/ui/views/principal/view/ViewPrincipal2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void cargarTipoUsuaurio() {
		listUserType.add(UserType.ADMINISTRADOR);
		listUserType.add(UserType.EMPLEADO);
		comboUserType.setItems(listUserType);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cargarTipoUsuaurio();

	}

}
