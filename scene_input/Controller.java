package scene_input;

import java.io.IOException;
import global.Global;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private TextField input_field;

    @FXML
    private Button save;

    @FXML
    void on_save(ActionEvent event) throws IOException {
        Global.setData(input_field.getText());

        var stage = (Stage) input_field.getScene().getWindow();
        var view_main = getClass().getResource("/scene_main/view.fxml");
        var controller_main = new scene_main.Controller();

        var loader = new javafx.fxml.FXMLLoader(view_main);
        loader.setController(controller_main);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

}
