package JavaFxBi.lesson11密码框;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class 密码框2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("常用控件");
        Group root=new Group();
        Scene s=new Scene(root);
        stage.setScene(s);
        stage.setHeight(500);
        stage.setWidth(500);

        //密码框
        PasswordField p1=new PasswordField();
        p1.setLayoutX(100);
        p1.setLayoutY(200);
        p1.setPrefWidth(200);
        p1.setPrefHeight(50);
        root.getChildren().add(p1);







        stage.show();
    }
}
