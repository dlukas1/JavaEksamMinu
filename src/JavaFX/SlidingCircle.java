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

    final Slider sliderX = new Slider(0, 250, 50);
    final Slider sliderY = new Slider(0, 250, 50);

    int x = 50;
    int y = 50;
    final Ellipse ellipse = new Ellipse(x, y);

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


        sliderX.setOrientation(Orientation.HORIZONTAL);
        sliderY.setOrientation(Orientation.VERTICAL);
        sliderX.setTranslateY(-230);
        sliderY.setTranslateX(230);
        /*
        int x;int y;
         */

        sliderX.valueProperty().addListener((observable, vanaVaartus, uusVaartusX) -> {
            x = uusVaartusX.intValue();
            System.out.println(uusVaartusX.intValue());

            ellipse.setRadiusX(x);

            if (x>200){
                ellipse.setFill(Color.GREEN);
            }else {
                ellipse.setFill(Color.RED);
            }
        });

        sliderY.valueProperty().addListener((observable, vanaVaartus, uusVaartusY) -> {
            y = uusVaartusY.intValue();
            System.out.println(uusVaartusY.intValue());
            ellipse.setRadiusY(y);
            if (y>100){
                ellipse.setFill(Color.YELLOW);
            }else {
                ellipse.setFill(Color.RED);
            }
        });
        stack.getChildren().addAll(sliderX, sliderY, ellipse);
        }
    }

