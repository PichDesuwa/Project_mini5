import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button button_close;

    @FXML
    private Label output_data;

    @FXML
    private TextField text_field;

    @FXML
    void on_close(ActionEvent event) throws IOException {

        var stage = (Stage) output_data.getScene().getWindow();

        var view_output = getClass().getResource("scene_output/view.fxml");
        var controller_output = new scene_main.Controller();

        var loader = new javafx.fxml.FXMLLoader();
        loader.setController(controller_output);
        loader.setLocation(view_output);

        var scene = new Scene(loader.load());
        stage.setScene(scene); 
        stage.show();
    }

}
