package JavaFxBi;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Stage3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("窗口");

    // tage.getIcons().add(new Image("https://scpic.chinaz.net/Files/pic/icons128/8411/n1.png"));
        stage.getIcons().add(new Image("/Sucai/n2.png"));//添加图标

      //  stage.setMaximized(true);//设置最大化

        stage.setWidth(500);
        stage.setHeight(600);
        //stage.setResizable(false);//设置窗口不可以拉伸改变大小

        //System.out.println("宽度："+stage.getWidth());

        stage.heightProperty().addListener(new ChangeListener<Number>() {//监听高度变化
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("当前高度："+t1);
            }
        });
        stage.widthProperty().addListener(new ChangeListener<Number>() {//监听宽度变化
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println("当前宽度："+t1);
            }
        });
        stage.setFullScreen(true);
        stage.setScene(new Scene(new Group()));//桌布就会跟着窗口在动



        stage.show();

    }
}
