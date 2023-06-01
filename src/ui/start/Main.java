package ui.start;

import java.io.IOException;

import infrastructure.database.*;

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

public class Main extends Application {

	private Stage primaryStage;
	DataBase b = new DataBase();

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		try {
			AnchorPane root = (AnchorPane) FXMLLoader
					.load(getClass().getResource("/ui/views/login/view/ViewLogin.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Login");
			primaryStage.setScene(scene);
			primaryStage.show();

			DataBase b = new DataBase();
			// b.readJson("employee.json");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// cargar ventana registro

	public void carcarVentanaRegistro() {

		try {
			FXMLLoader load = new FXMLLoader(Main.class.getResource("/ui/views/register/view/ViewRegistro.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();
			stage.setResizable(false);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana de resgistro");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void carcarVentanaPrincipal() {

		try {
			FXMLLoader load = new FXMLLoader(Main.class.getResource("/ui/views/principal/view/ViewPrincipal2.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();
			stage.setResizable(false);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana de resgistro");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void chargeWindowAddCar() {
		try {
			FXMLLoader load = new FXMLLoader(Main.class.getResource("/ui/views/addCar/view/ViewAddCar.fxml"));
			Parent root = load.load();
			Scene escena = new Scene(root);
			Stage stage = new Stage();

			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(escena);
			stage.setTitle("ventana de resgistro");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

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
			stage.setTitle("ventana de resgistro");
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
			stage.setTitle("ventana de resgistro");
			stage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void closeWimdow(Button btn) {
		Stage stage = (Stage) btn.getScene().getWindow();
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
