package JavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


        for (int i = 0; i < 5; i++) {
            Rectangle rectangle = new Rectangle();

            int h = 100;
            int w = 100;
            rectangle.setHeight(h);
            rectangle.setWidth(w);
            rectangle.setTranslateX(-200 + (i * 100));
            rectangle.setTranslateY(-200 + (i * 100));


            stack.getChildren().add(rectangle);

            //два EventHandler - при первом нажатии уменьшает в 2 разаб при втором - тсчезает
            rectangle.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    rectangle.setHeight(h/2);
                    rectangle.setWidth(w/2);
                    rectangle.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            rectangle.setVisible(false);
                        }
                    });
                }
            });
        }

    }
}
