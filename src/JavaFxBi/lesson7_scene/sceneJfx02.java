package JavaFxBi.lesson7_scene;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class sceneJfx02 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("跳转到百度");
        Scene s=new Scene(new Group());

        HostServices h1=getHostServices();
        h1.showDocument("www.baidu.com");


        stage.show();
    }
}
