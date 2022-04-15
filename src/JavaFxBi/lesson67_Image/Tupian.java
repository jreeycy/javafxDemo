package JavaFxBi.lesson67_Image;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class Tupian extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("加载图片");
        stage.setHeight(600);
        stage.setWidth(800);
        AnchorPane an=new AnchorPane();
        Scene s1=new Scene(an);
        stage.setScene(s1);

        FileInputStream fis=new FileInputStream(new File("C:/Users/Yu/Desktop/demo/src/Sucai/01.jpg"));//图片类
        Image im1=new Image(fis);
       // ImageView iv=new ImageView(im1);//将图片显示出来的类
        //iv.setLayoutX(200);
        //iv.setFitHeight(100);
        //iv.setFitWidth(300);


        FileInputStream fis2=new FileInputStream(new File("C:/Users/Yu/Desktop/demo/src/Sucai/01.jpg"));//图片类
        //路径+大小+是否保持宽高比，是否高质量
        Image im2=new Image(fis2,300,0,true,true);
        ImageView iv2=new ImageView(im2);//将图片显示出来的类
       // an.getChildren().add(iv);
        an.getChildren().add(iv2);


        /*  通过url导入图片 */
        Image im3=new Image("file:C:/Users/Yu/Desktop/demo/src/Sucai/2.jpg",100,0,true,true);
        ImageView iv3=new ImageView(im3);
        an.getChildren().add(iv3);

        /*  相对路径导入图片 */
        Image im4=new Image("Sucai/card/a6.png",800,0,true,true);
        ImageView iv4=new ImageView(im4);

        an.getChildren().add(iv4);

        stage.show();

    }
}
