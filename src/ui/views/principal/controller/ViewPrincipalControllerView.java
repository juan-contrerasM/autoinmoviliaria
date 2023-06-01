package ui.views.principal.controller;



	import javafx.event.ActionEvent;
import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextArea;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.Pane;
	import ui.start.*;
import javafx.scene.text.Text;

	public class ViewPrincipalControllerView {
		Main main = new Main();
		
		@FXML
	    private ImageView imgLogo;

	    @FXML
	    private Button btnRegisterClient;

	    @FXML
	    private Label lblUsername;

	    @FXML
	    private Button btnCatalogue;

	    @FXML
	    private Button btnReport;

	    @FXML
	    private Label lblNameUser;

	    @FXML
	    private Pane panelFondo;

	    @FXML
	    private Button btnAddCar;

	 

	    @FXML
	    void Report(ActionEvent event) {
	    	main.closeWimdow(btnReport);
	    	main.chargeWindowReport();
	    }

	    @FXML
	    void RegisterCutomer(ActionEvent event) {
	    	main.closeWimdow(btnReport);
	    	main.chargeWindowRegisterCustomer();

	    }

	    @FXML
	    void openWindowCatalogue(ActionEvent event) {
	    	main.closeWimdow(btnReport);
	    	main.chargeWindowCatalogue();
	    
	    	
	    }


	    @FXML
	    void addCar(ActionEvent event) {
	    	main.closeWimdow(btnReport);
	    	main.chargeWindowAddCar();
	    	

	    }

	 

	}



