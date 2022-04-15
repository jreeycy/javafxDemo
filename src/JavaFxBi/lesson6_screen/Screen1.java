package JavaFxBi.lesson6_screen;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.ArrayList;

//获取屏幕信息
public class Screen1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Screen s1=Screen.getPrimary();

        Rectangle2D d=s1.getBounds();//全部屏幕
        Rectangle2D d1=s1.getVisualBounds();//可以看到的区域

        System.out.println("左上角x:"+d.getMinX()+" "+"左上角y："+d.getMinY()+"右下角x:"+d.getMaxX()+"  右下角y："+d.getMaxY());
        System.out.println("宽度："+d.getWidth()+"  高度："+d.getHeight());

        System.out.println("左上角x:"+d1.getMinX()+" "+"左上角y："+d1.getMinY()+"右下角x:"+d1.getMaxX()+"  右下角y："+d1.getMaxY());

        double dpi=s1.getDpi();
        System.out.println("dpi:"+dpi);
        Platform.exit();
    }
}
