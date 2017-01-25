package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        double x;
        double y;

        Circle ring = new Circle(50);
        stack.getChildren().add(ring);
        primaryStage.show();




    ring.hoverProperty().addListener((ov, oldValue, newValue) -> {
                if (newValue)
                {


                    ring.setTranslateX((Math.random() * 500)-250);
                    ring.setTranslateY((Math.random() * 500)-250);
                }
}
    );







}}
