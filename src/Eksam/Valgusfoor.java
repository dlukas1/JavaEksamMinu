package Eksam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Valgusfoor extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,700,600);
        primaryStage.setScene(scene);
        primaryStage.show();


        //Создаем новый обьект класса Фоор
        //Надо будет сделать фоора для перекресткаб аргкмент будут принимать расположение (верх, низ, право, лево) и пейн

        Foor foor = new Foor(pane);
        foor.looFoor(1);
        Foor foor2 = new Foor(pane);
        foor2.looFoor(2);
        Foor foor3 = new Foor(pane);
        foor3.looFoor(3);
        Foor foor4 = new Foor(pane);
        foor4.looFoor(4);

        Button night = new Button("Night mode");
        Button day = new Button(" Day mode ");
        pane.getChildren().addAll(day,night);
        day.setTranslateY(30);

        day.setOnAction(event -> {
            foor.kustuta();
            foor2.kustuta();
            foor3.kustuta();
            foor4.kustuta();

            foor.startFoor();
            foor3.startFoor();
            foor2.startFoorVastupidi();
            foor4.startFoorVastupidi();
        });

        night.setOnAction( event -> {
            foor.kollaneVilgub(true);
            foor2.kollaneVilgub(true);
            foor3.kollaneVilgub(true);
            foor4.kollaneVilgub(true);
        });












    }
}
