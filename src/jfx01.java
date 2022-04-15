import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class jfx01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        var root=new StackPane();
        var scene=new Scene(root,1000,800);
        stage.setScene(scene);

        Rectangle r=new Rectangle(100,200);
        Rectangle r2=new Rectangle(300,300);

        root.getChildren().add(r);
        root.getChildren().add(r2);
        stage.show();


    }
}
