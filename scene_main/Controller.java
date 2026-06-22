package scene_main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Controller {

    @FXML
    private Button go_input;

    @FXML
    private Button go_output;

    @FXML
    private Label label_data;

    @FXML
    void on_go_input(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(new File("scene_input/view.fxml").toURI().toURL());
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
            FXMLLoader loader = new FXMLLoader(new File("scene_output/view.fxml").toURI().toURL());
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
