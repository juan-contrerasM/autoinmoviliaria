package ui.views.login.controller;


import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import domain.person.enumm.UserType;
import infrastructure.models.principal.Automoviliaria;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
import ui.views.register.controller.ViewRegistroController;

public class ViewLoginController implements Initializable{
	Main main= new Main();
	Automoviliaria automoviliaria= new Automoviliaria();
	
	
	private ObservableList<UserType> listUserType= FXCollections.observableArrayList();
		
	 Stage stage = new Stage();

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
	void recuperarClave(MouseEvent event) {
		main.chargeWindowRecoverPasswors();

	}

	@FXML
	void registrarse(ActionEvent event) {
		//main.closeWimdow(btnEntrar);
		main.carcarVentanaRegistro();
		
	}

	@FXML
	void entrar(ActionEvent event) throws HeadlessException, IOException {
		//	main.closeWimdow(btnEntrar);
			main.carcarVentanaPrincipal();
			
			
		
		   
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
