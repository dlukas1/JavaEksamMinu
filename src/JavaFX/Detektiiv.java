package JavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */



public class Detektiiv extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        for (int i = 0; i <3 ; i++) {
            double xAlg = Math.random();
            double yAlg = Math.random();
            double x = 0;
            double y = 0;
            if (xAlg < 0.5) {
                x = xAlg*(-500);
            }
            if (yAlg < 0.5) {
                y = yAlg*(-500);
            }
            Circle ring = new Circle(30);
            ring.setTranslateX(x);
            ring.setTranslateY(y);
            stack.getChildren().add(ring);
            ring.setFill(Color.WHITE);
            ring.hoverProperty().addListener((ov, oldValue, newValue) -> {
                        if (newValue) {
                            ring.setFill(Color.GREEN);
                        }

                    }
            );

            primaryStage.show();
        }


    }
}
