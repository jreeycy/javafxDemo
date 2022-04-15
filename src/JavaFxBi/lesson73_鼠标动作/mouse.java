package JavaFxBi.lesson73_鼠标动作;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class mouse extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox hbox=new HBox(20);
        Button b1=new Button("button1");
        Button b2=new Button("button2");
        hbox.getChildren().addAll(b1,b2);

        AnchorPane an=new AnchorPane();
        an.getChildren().add(hbox);
        AnchorPane.setLeftAnchor(hbox,100.0);
        AnchorPane.setTopAnchor(hbox,100.0);
        Scene scene=new Scene(an);
        stage.setScene(scene);
        b1.setOnMouseClicked(new EventHandler<MouseEvent>() {//单击事件
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println( mouseEvent.getSceneX() );//窗口的 x 和 y
                System.out.println( mouseEvent.getSceneY() );
                System.out.println(mouseEvent.getClickCount());//点的次数
                if (mouseEvent.getClickCount()==2 && mouseEvent.getButton()== MouseButton.PRIMARY){
                    System.out.println("恭喜你鼠标右键双击两次");
                }
            }
        });
        b1.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println(mouseEvent.isSecondaryButtonDown());//是否右键被按下
            }
        });
        b1.setOnMouseEntered(new EventHandler<MouseEvent>() {//鼠标是否停在上面
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("鼠标进入");
            }
        });
        b1.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("鼠标推出");
            }
        });

        //拖拽
//        b2.setOnMouseDragged(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//               // System.out.println("鼠标在拖拽");
//            }
//        });
        b2.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                b2.startFullDrag();
                System.out.println("鼠标检测到拖拽");
            }
        });





        stage.show();

    }
}
