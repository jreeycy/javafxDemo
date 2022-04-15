package JavaFxBi.lesson6_Platform;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class platform1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("run方法");
                System.out.println("执行顺序");
            }
        });
    }
}
