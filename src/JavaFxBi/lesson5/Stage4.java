package JavaFxBi;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Stage4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        //stage.setOpacity(0.5);设置透明度
        //stage.setAlwaysOnTop(false);//永远置顶
        stage.setScene(new Scene(new Group()));//桌布就会跟着窗口在动

        stage.setWidth(500);
        stage.setHeight(500);

        stage.setX(500);//设置出生坐标
        stage.setY(300);

        stage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if (t1.doubleValue()>1000){
                    stage.setHeight(1080);
                    stage.setWidth(900);

                }
            }
        });



       stage.show();
    }
}
