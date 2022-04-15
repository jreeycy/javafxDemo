package JavaFxBi.lesson8_group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class group01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("group使用");
        stage.setHeight(800);
        stage.setWidth(800);
        Group g=new Group();
        Scene s1=new Scene(g);
        stage.setScene(s1);

        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        b1.setPrefWidth(30);
        b1.setPrefHeight(50);
        b1.setLayoutX(0);
        b1.setLayoutY(0);
        b2.setLayoutX(100);
        b2.setLayoutY(100);
        b3.setLayoutX(200);
        b3.setLayoutY(200);

        g.getChildren().addAll(b1,b3,b2);
        g.getChildren().remove(b3);//移除一个节点

        //***批量赋值
        Object[] obj=g.getChildren().toArray();
        for (Object o:obj){
            Button bu=(Button) o;
            bu.setPrefHeight(100);
            bu.setPrefWidth(100);
        }
        g.setOpacity(0.5);//对group设置他的孩子也会改变
        System.out.println(g.contains(0,10));//检测这个位置有没有节点




        stage.show();

    }
}
