package JavaFX;

import com.sun.org.apache.xpath.internal.operations.Number;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;



import static sun.security.krb5.Confounder.intValue;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */

public class SlidingCircle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        SliCirOOP slidingcircle = new SliCirOOP(stack);
        }
    }

