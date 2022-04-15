package JavaFxBi.lesson7_scene;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

public class sceneJfx01 extends Application {
    public static void main(String[] args) {
launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("scene");
        stage.setWidth(800);
        stage.setHeight(500);

        Button b1=new Button("annoi");
        b1.setCursor(Cursor.MOVE);//鼠标移到按钮上图标改变
        b1.setPrefHeight(100);
        b1.setPrefWidth(200);
        b1.setLayoutY(100);
        b1.setLayoutX(100);

        Button b2=new Button("2");
        URL u=getClass().getClassLoader().getResource("Sucai/n2.png");
       // String lujing=u.toExternalForm();

        b2.setCursor(Cursor.cursor(u.toString()));
        b2.setPrefHeight(100);
        b2.setPrefWidth(200);
        b2.setLayoutY(300);
        b2.setLayoutX(300);

        Group g=new Group();//layout类
        g.getChildren().add(b1);
        g.getChildren().add(b2);


        Scene s=new Scene(g);//scene 里面必须放一个根结点,一般放一个布局类：Group，Vbox....
        stage.setScene(s);//将stage和scene关联在一起
        s.setCursor(Cursor.HAND);//改变光标

        stage.show();
    }
}
