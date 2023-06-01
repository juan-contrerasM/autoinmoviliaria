package ui.views.report.controller;

import javafx.event.ActionEvent;
import ui.start.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ViewReportController {
	Main main = new Main();
	@FXML
    private Pane paneFondo;

    @FXML
    private ImageView imgLogo;

    @FXML
    private Label lblTitle;

    @FXML
    private TextArea txtAreaShowReport;
    @FXML
    private Button btnClose;
    @FXML
    void close(ActionEvent event) {
    //	main.closeWimdow(btnClose);
    	main.carcarVentanaPrincipal();

    }

}
