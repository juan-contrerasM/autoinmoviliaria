package ui.views.changePassword.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ui.start.*;

public class ViewChangePasswordController {
	Main main= new Main();
    @FXML
    private Label lblText;

    @FXML
    private Button btnChange;

    @FXML
    private TextField lblPassword;

    @FXML
    private Pane panelFondo;

    @FXML
    void Change(ActionEvent event) {
    	//main.closeWimdow(btnChange);

    }

}
