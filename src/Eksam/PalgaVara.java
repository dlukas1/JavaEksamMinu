package Eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PalgaVara extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500,500);
        primaryStage.setScene(scene);
        primaryStage.show();

        PalgaEngine palgaEngine = new PalgaEngine(pane);
    }
}
