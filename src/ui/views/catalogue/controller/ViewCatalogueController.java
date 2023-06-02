package ui.views.catalogue.controller;

import javafx.event.ActionEvent;
import ui.start.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ViewCatalogueController {
	Main main = new Main();

    @FXML
    private ImageView imgLogo;

    @FXML
    private Label lblShowName;
    @FXML
    private Button btnClose;
    @FXML
    private Label lblUser;

    @FXML
    private Pane panelfondo;
    @FXML
    private GridPane carGrid;
    @FXML
     void close (ActionEvent event ) {
    	//main.closeWimdow(btnClose);
    	main.carcarVentanaPrincipal();
    	
    }

}
