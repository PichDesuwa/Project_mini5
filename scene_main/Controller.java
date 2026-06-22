package scene_main;

import global.Global;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button go_input;

    @FXML
    private Button go_output;

    @FXML
    private Label label_data;

    @FXML
    void initialize() {
        label_data.setText("Data: " + Global.getData());
    }

    @FXML
    void on_go_input(ActionEvent event) {
        try {
            var viewInput = getClass().getResource("/scene_input/view.fxml");
            FXMLLoader loader = new FXMLLoader(viewInput);
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void on_go_output(ActionEvent event) {
        try {
            var viewOutput = getClass().getResource("/scene_output/view.fxml");
            FXMLLoader loader = new FXMLLoader(viewOutput);
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
