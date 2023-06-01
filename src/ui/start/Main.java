package ui.start;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import infrastructure.database.*;
import infrastructure.models.person.emp.Emp;
import infrastructure.state.GlobalState;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ui.views.register.controller.ViewRegistroController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import com.fasterxml.jackson.core.type.TypeReference;

public class Main extends Application {

	private Stage primaryStage;
	DataBase database = new DataBase();
	GlobalState globalState;
	

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		initializeGlobalState();
		try {
			AnchorPane root = (AnchorPane) FXMLLoader
					.load(getClass().getResource("/ui/views/login/view/ViewLogin.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Login");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// cargar ventana registro

	public void carcarVentanaRegistro() {

		try {
			FXMLLoader load = new FXMLLoader(getClass().getResource("/ui/views/register/view/ViewRegistro.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			primaryStage = new Stage();
			primaryStage.setResizable(false);
			primaryStage.initModality(Modality.APPLICATION_MODAL);
			primaryStage.setScene(escena);
			primaryStage.setTitle("ventana de resgistro");
			primaryStage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void initializeGlobalState() {
		globalState = GlobalState.getInstance();
		List<Emp> employees = new ArrayList<Emp>();
		try {
//			employees = database.jsonArrayToList("resources/database/employee.json", Emp.class);
			employees = database.jsonToObjectList("resources/database/employee.json", new TypeReference<Emp>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		globalState.setAllEmployees(employees);
	}

	public void carcarVentanaPrincipal() {

		try {
			FXMLLoader load = new FXMLLoader(Main.class.getResource("/ui/views/principal/view/ViewPrincipal2.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();
		
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana principal");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
//hiyguyftdrtfytguhjk
	
	public Stage chargeWindowAddCar() {
		try {
			FXMLLoader load = new FXMLLoader(Main.class.getResource("/ui/views/addCar/view/ViewAddCar.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana añadir carro");
			stage.showAndWait();
			return stage;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void chargeWindowCatalogue() {
		try {
			FXMLLoader load = new FXMLLoader(Main.class.getResource("/ui/views/catalogue/view/ViewCatalogue.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana de catalogo");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void chargeWindowReport() {
		try {
			FXMLLoader load = new FXMLLoader(Main.class.getResource("/ui/views/Report/view/ViewReport.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana reporte");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void chargeWindowRegisterCustomer() {
		try {
			
			FXMLLoader load = new FXMLLoader(
					Main.class.getResource("/ui/views/registerCustomer/view/ViewRegisterCustomer.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana registrarUusario");
			stage.showAndWait();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void chargeWindowRecoverPasswors() {
		try {
			FXMLLoader load = new FXMLLoader(
					Main.class.getResource("/ui/views/recoverPassword/view/ViewRecoverPassword.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana palabra clave");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void chargeWindowChangePassword() {
		try {
			FXMLLoader load = new FXMLLoader(
					Main.class.getResource("/ui/views/changePassword/view/ViewChangePassword.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana actualizar clave");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	public void closeWimdow() {
		
		  
	}



	public static void main(String[] args) {
		launch(args);
	}
}
