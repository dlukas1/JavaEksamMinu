package JavaFX;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
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

/*
TextField xa = new TextField("X alg");
        TextField ya = new TextField("Y alg");
        TextField xl = new TextField("X lopp");
        TextField yl = new TextField("Y lopp");

        xa.setTranslateY(40);
        xl.setTranslateY(00);
        ya.setTranslateY(20);
        yl.setTranslateY(-20);
        stack.getChildren().addAll(xa,ya,xl, yl);

        int Xalg = Integer.parseInt(xa.getText());
        int Yalg = Integer.parseInt(ya.getText());
        int Xlopp = Integer.parseInt(xl.getText());
        int Ylopp = Integer.parseInt(yl.getText());
 */



        Line line = new Line();

                line.setStartX(Xalg);
                line.setStartY(Yalg);
                line.setEndX(Xlopp);
                line.setEndY(Ylopp);

                stack.getChildren().add(line);

        primaryStage.show();
            }

        }
