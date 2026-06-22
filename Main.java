import javafx.application.Application;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(javafx.stage.Stage stage) throws Exception {
    var view_main = getClass().getResource("scene_main/view.fxml");
    var controller_main = new scene_main.Controller();
    var loader = new javafx.fxml.FXMLLoader(view_main);
    loader.setController(controller_main);
    loader.setLocation(view_main);

    // 
    var scene = new javafx.scene.Scene(loader.load());

    //
    stage.setScene(scene);
    stage.show();

    }
}