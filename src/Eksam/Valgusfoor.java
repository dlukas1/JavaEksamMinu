package Eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Valgusfoor extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();

        //Создаем новый обьект класса Фоор
        //Надо будет сделать фоора для перекресткаб аргкмент будут принимать расположение (верх, низ, право, лево) и пейн
        Foor foor = new Foor(pane);
    }
}
