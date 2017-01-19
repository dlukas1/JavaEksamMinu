package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class Joon extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);

        Scanner sc = new Scanner(System.in);
        System.out.println("X alg:");
        int Xalg = sc.nextInt();
        System.out.println("Yalg:");
        int Yalg = sc.nextInt();
        System.out.println("X lopp:");
        int Xlopp = sc.nextInt();
        System.out.println("Ylopp:");
        int Ylopp = sc.nextInt();

        Line line = new Line();


        line.setStartX(Xalg);
        line.setStartY(Yalg);
        line.setEndX(Xlopp);
        line.setEndY(Ylopp);

        stack.getChildren().add(line);





        primaryStage.show();

    }
}