package JavaFxBi.lesson10_事件;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Sshijian1 extends Application {
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
        b1.setFont(Font.font(10));

        Button b2=new Button("b2");
        root.getChildren().add(b2);
        b2.setLayoutY(200);
        b2.setLayoutX(300);
        b2.setPrefHeight(100);
        b2.setPrefWidth(100);

        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("左键，中键，右键："+mouseEvent.getButton().name());
                System.out.println("鼠标单击");
                if (mouseEvent.getClickCount()==2){
                    System.out.println("双击事件");
                }
                if (mouseEvent.getClickCount()==3){
                    System.out.println("三击事件");
                }
            }
        });

       b2.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mouseEvent) {
               b2.setPrefHeight(200);
               b2.setPrefWidth(200);
           }
       });
       b2.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mouseEvent) {
               b2.setPrefWidth(100);
               b2.setPrefHeight(100);
           }
       });

      s.setOnKeyPressed(new EventHandler<KeyEvent>() {
          @Override
          public void handle(KeyEvent keyEvent) {
              System.out.println(keyEvent.getCode().name());
              if (keyEvent.getCode().name()=="ESCAPE b")//得到按键的名字
                  Platform.exit();
              {
          }
      }});

        stage.show();
    }
}
