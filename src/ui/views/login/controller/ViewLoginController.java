package ui.views.login.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class ViewLoginController {
	Main main= new Main();
	

	

	    @FXML
	    private Text txtSingup;

	    @FXML
	    private ImageView imgCandado;

	    @FXML
	    private ImageView imgPerson;

	    @FXML
	    private TextField txtEmail;


	    @FXML
	    private Button btnRegistrarse;

	    @FXML
	    private ImageView imgLogo;

	    @FXML
	    private Pane pane2;

	 

	    @FXML
	    private ComboBox<?> comboTipoUsuario;

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

	}

	@FXML
	void registrarse(ActionEvent event) {
		main.carcarVentanaRegistro();
		
		

	}

	@FXML
	void entrar(ActionEvent event) {

	}
	 

}
