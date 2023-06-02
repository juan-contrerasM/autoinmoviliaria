package ui.views.catalogue.controller;

import javafx.event.ActionEvent;
import ui.start.*;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
    private GridPane carGrid;
    
    @FXML
    private Pane panelfondo;
    
    @FXML
    private GridPane carGrid;
    @FXML
     void close (ActionEvent event ) {
    	//main.closeWimdow(btnClose);
    	//main.carcarVentanaPrincipal();
    	panelsss();
    	
    }
    
    void panelsss() {
    	
    	//Stage primaryStage = new Stage();
    	
    	Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");

        //GridPane gridPane = new GridPane();

//        carGrid.add(button1, 0, 0, 1, 1);
//        carGrid.add(button2, 1, 0, 1, 1);
//        carGrid.add(button3, 2, 0, 1, 1);
//        carGrid.add(button4, 0, 1, 1, 1);
//        carGrid.add(button5, 1, 1, 1, 1);
//        carGrid.add(button6, 2, 1, 1, 1);
        
        carGrid.add(button1, 0, 0, 2, 2);

        carGrid.add(button2, 2, 0, 1, 1);
        carGrid.add(button3, 2, 1, 1, 1);
        carGrid.add(button4, 0, 2, 1, 1);
        carGrid.add(button5, 1, 2, 1, 1);
        carGrid.add(button6, 2, 2, 1, 1);

        //Scene scene = new Scene(gridPane, 240, 100);
        //primaryStage.setScene(scene);
        //primaryStage.show();
    }

}
