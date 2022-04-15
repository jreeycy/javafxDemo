package JavaFxBi.lesson9_button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class button01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root=new Group();
        Scene s=new Scene(root);
        stage.setScene(s);
        stage.setWidth(500);
        stage.setHeight(500);

        Button b1=new Button("b1");
        root.getChildren().add(b1);
        b1.setLayoutY(100);
        b1.setLayoutX(100);
        b1.setPrefHeight(100);
        b1.setPrefWidth(100);
        Button b2=new Button("b1");
        root.getChildren().add(b2);
        b2.setLayoutY(200);
        b2.setLayoutX(300);
        b2.setPrefHeight(100);
        b2.setPrefWidth(100);

        b1.setText("你好");
        b2.setText("nihao2");
        b2.setTextFill(Paint.valueOf("#8FBC8F"));
        b1.setFont(Font.font("sans-serif",20));

        //背景设置：颜色+圆角+边框内边距
        BackgroundFill bgf=new BackgroundFill(Paint.valueOf("#8FBC8F"),new CornerRadii(30),new Insets(1));//Insets.EMPTY
        Background g1=new Background(bgf);
        b1.setBackground(g1);

        //边框设置
        BorderStroke bos=new BorderStroke(Paint.valueOf("#8A2BE2"), BorderStrokeStyle.DASHED,new CornerRadii(10),new BorderWidths(1));
        Border b=new Border(bos);
        b1.setBorder(b);

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Group R2=new Group();
                Scene s1=new Scene(R2);
                stage.setScene(s1);
                Label l1=new Label("HI WELCOME");
                R2.getChildren().add(l1);

            }
        });




        stage.show();
    }
}
