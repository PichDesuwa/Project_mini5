package scene_output;

import global.Global;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button button_close;

    @FXML
    private Label output_data;

    @FXML
    private TextField text_field;

    @FXML
    void initialize() {
        text_field.setText(Global.getData());
    }

    @FXML
    void on_close(ActionEvent event) {
        Platform.exit();
    }

}
