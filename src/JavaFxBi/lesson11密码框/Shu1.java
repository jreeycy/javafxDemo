package JavaFxBi.lesson11密码框;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Shu1 extends Application {
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

        //输入框
        TextField text=new TextField();
        //text.setText("这是输入框");
        text.setLayoutX(100);
        text.setLayoutY(100);
        //很多node方法都一样,边框参考button
        text.setFont(Font.font(14));

        Tooltip t=new Tooltip("请输入你的名字");//鼠标放上文本框跳出提示
        t.setFont(Font.font(8));
        t.setOpacity(0.5);
        text.setTooltip(t);
        text.setPromptText("Please enter you name!");
        text.setFocusTraversable(false);//将焦点取消
        root.getChildren().add(text);

        text.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldvalue, String t1) {
                System.out.println("你输入了："+t1);
                if (t1.length()>7){
                    text.setText(oldvalue);
                }
            }
        });

        text.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                System.out.println("选中的是"+t1);
            }
        });

        //

        stage.show();




    }
}
