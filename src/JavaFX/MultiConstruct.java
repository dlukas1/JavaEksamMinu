package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MultiConstruct extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene= new Scene(pane, 900,600);
        primaryStage.setScene(scene);
        primaryStage.show();

        MultiConstructObjects multiObjects = new MultiConstructObjects(pane);
        multiObjects.polyStar();
    }
}
