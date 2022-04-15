package JavaFxBi;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Stage5 extends Application {
    //窗口类型

    @Override
    public void start(Stage stage) throws Exception {
        //窗口几种显示样式

        Stage s1=new Stage();
        s1.setTitle("s1");
        s1.initStyle(StageStyle.DECORATED);
        s1.show();

        Stage s2=new Stage();
        s2.setTitle("s2");

        s2.initOwner(s1);
        s2.initModality(Modality.WINDOW_MODAL);//s1是s2的拥有者，s2关了才能操控s1

        s2.show();


        Stage s3=new Stage();
        s3.setTitle("s3");
        s3.initStyle(StageStyle.UTILITY);//只有关闭
        //s3.initModality(Modality.APPLICATION_MODAL);//只有s3关闭了才能用别的窗口
        s3.show();


    }
}
