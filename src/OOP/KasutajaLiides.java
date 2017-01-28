package OOP;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class KasutajaLiides {

    // у класса KasutajaLiides есть атрибуты pane,field, submit
    Pane pane;
    TextField field = new TextField();
    Button submit = new Button("Joonista");

    //Конструктор
    public KasutajaLiides (Pane paneSise){
        pane = paneSise;
        looKasutajaLiides();
        joonistaJoon();
    }

    private void looKasutajaLiides(){
        submit.setTranslateY(25);
    }

    private void joonistaJoon (){
        submit.setOnAction(event ->
        {
            String input = field.getText();
            String  [] k = input.split(",");
            int [ ] intK = new int [k.length];
            for (int i = 0; i < k.length; i++) {
                intK[i] = Integer.parseInt(k[i]);
            }

            Line line = new Line(intK [0],intK [1],intK [2],intK [3] );
            pane.getChildren().add(line);

        }); pane.getChildren().addAll(field, submit);
    }
}

