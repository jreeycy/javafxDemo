package JavaFxBi.lesson73_鼠标动作;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class 拖拽按钮 extends Application {
    double a,b;//鼠标在按钮内的局部坐标

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane an =new AnchorPane();
        stage.setHeight(500);
        stage.setWidth(700);
        Button b1=new Button("b1");
        AnchorPane.setLeftAnchor(b1,100.0);
        AnchorPane.setTopAnchor(b1,100.0);
        an.getChildren().add(b1);


        //拖动按钮
        b1.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                a=mouseEvent.getX();
                b=mouseEvent.getY();
            }
        });
        b1.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                AnchorPane.setTopAnchor(b1,mouseEvent.getSceneY()-b);
                AnchorPane.setLeftAnchor(b1,mouseEvent.getSceneX()-a);
            }
        });


        Scene scene=new Scene(an);
        stage.setScene(scene);
        stage.show();
    }
}
