package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        for (int i = 0; i <1000 ; i++) {
            double xAlg = Math.round(Math.random() * 10);
            double yAlg = Math.round(Math.random() * 10);
            System.out.println("x alg = " + xAlg);
            System.out.println("y alg = " + yAlg);
            double x = 0;
            double y = 0;
            if (xAlg%2 == 0) {
                x = xAlg*(-25);
            }else  {
                x = xAlg * 25;
            }

            if (yAlg%2 == 0) {
                y = yAlg*(-25);
            }
            else {
                y = yAlg * 25;
            }

            Circle ring = new Circle(50);
            ring.setTranslateX(x);
            ring.setTranslateY(y);
            ring.setFill(Color.RED);
            stack.getChildren().add(ring);
            ring.hoverProperty().addListener((ov, oldValue, newValue) -> {
                if (newValue) {
                    ring.setFill(Color.GREEN);
                }

            });
        }


        primaryStage.show();

    }

}
