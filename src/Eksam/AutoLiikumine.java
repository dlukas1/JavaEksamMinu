package Eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AutoLiikumine extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();
        Scene scene = new Scene(pane,550,200);
        primaryStage.setScene(scene);
        primaryStage.show();

        Ristmik ristmik = new Ristmik (pane);

    }
}
