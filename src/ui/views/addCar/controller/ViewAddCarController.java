package ui.views.addCar.controller;


import java.net.URL;
import java.util.ResourceBundle;

import domain.person.enumm.TypeRecoverPassword;
import domain.vehicle.enums.EstadoVehiculo;
import domain.vehicle.enums.TipoAbs;
import domain.vehicle.enums.TipoCombustible;
import domain.vehicle.enums.TipoTransmision;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import ui.start.*;
import ui.views.principal.controller.ViewPrincipalControllerView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class ViewAddCarController implements Initializable {
	Main main= new Main();
	
	private ViewPrincipalControllerView viewPrincipalController;
	private Stage stage;
	
	private ObservableList< EstadoVehiculo> listVehicleStatus = FXCollections.observableArrayList();
	private ObservableList< TipoCombustible> listFuelType = FXCollections.observableArrayList();
	private ObservableList< TipoAbs > listTypeAbs = FXCollections.observableArrayList();

	
		@FXML
		private Pane panelFondo;


	    @FXML
	    private ComboBox< TipoCombustible > comboFuelType;

	    @FXML
	    private ComboBox<EstadoVehiculo> comboVehicleStatus;

	    @FXML
	    private TextField txtImageUrl;

	    @FXML
	    private Label lblNameUser;

	    @FXML
	    private Button btnAddCar;

	    @FXML
	    private TextField txtModel;

	    @FXML
	    private ImageView imgLogo;

	    @FXML
	    private TextField txtCyilender;

	    @FXML
	    private TextField numPassengers;

	    @FXML
	    private TextField txtTrademark;

	    @FXML
	    private TextField txtTrunkCapacity;

	    @FXML
	    private TextField txtNumclow;

	    @FXML
	    private TextField numMaxiumSpeed;

	    @FXML
	    private TextField txtNumberAirbags;

	    @FXML
	    private ComboBox<TipoAbs > comboTypeAbs;
	    @FXML
	    private Button btnClose;
	    @FXML
	    void close(ActionEvent event) {
	    	//main.closeWimdow(btnAddCar);
	    }

	    @FXML
	    void addCar(ActionEvent event) {
	    	//main.closeWimdow(btnAddCar);
	    	main.carcarVentanaPrincipal();
	    	

	    }
	    public void initializeDates() {
	    	listVehicleStatus.add(EstadoVehiculo.NUEVO);
			listVehicleStatus.add(EstadoVehiculo.USADO);
			comboVehicleStatus.setItems(listVehicleStatus);
			
			listFuelType.add(TipoCombustible.DIESEL);
			listFuelType.add(TipoCombustible.ELECTRICO);
			listFuelType.add(TipoCombustible.GASOLINA);
			listFuelType.add(TipoCombustible.HIBRIDO);
			comboFuelType.setItems(listFuelType);
			
			listTypeAbs.add(TipoAbs.SI);
			listTypeAbs.add(TipoAbs.NO);
			comboTypeAbs.setItems(listTypeAbs);
	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			initializeDates();
			
		}

		public void init(Stage stage, ViewPrincipalControllerView viewPrincipalControllerView) {
			this.viewPrincipalController=viewPrincipalControllerView;
			this.stage= stage; 
		}



	}



