package JavaFxBi.lesson8_group;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class gropu02 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("group监听");
        stage.setHeight(800);
        stage.setWidth(800);
        Group g=new Group();
        Scene s1=new Scene(g);
        stage.setScene(s1);

        Button b1=new Button("1");
        b1.setLayoutY(300);
        Button b2=new Button("2");
        g.getChildren().addAll(b1,b2);
        //监听事件
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button b4=new Button("4)");
                b4.setPrefWidth(300);
                b4.setPrefHeight(100);
                g.getChildren().add(b4);

            }
        });
        g.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> change) {
                System.out.println("当前组件数量"+change.getList().size());
            }
        });


        stage.show();
    }
}
