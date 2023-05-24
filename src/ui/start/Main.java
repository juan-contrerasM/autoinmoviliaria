package ui.start;

	
import java.io.IOException;

import infrastructure.database.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
	this.primaryStage = primaryStage;
	try {
	AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/ui/views/login/view/ViewLogin.fxml"));
	Scene scene = new Scene(root);
	primaryStage.setTitle("Login");
	primaryStage.setScene(scene);
	primaryStage.show();

	
	DataBase b= new DataBase();
	//b.readJson("employee.json");
	
	
	//Persistencia.guardaRegistroLog(MensajesInformationConstants.LANZAR_APLICACION, 1, "Cargar Aplicacion");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	//cargar ventana registro
	
	public void carcarVentanaRegistro() {
		
		try {
			FXMLLoader load= new FXMLLoader(Main.class.getResource("/ui/views/register/view/ViewRegistro.fxml"));
			Parent root= load.load();
			Scene escena= new Scene(root);
			Stage stage= new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana de resgistro");
			stage.showAndWait();
		
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
