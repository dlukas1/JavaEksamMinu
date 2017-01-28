package JavaFX;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class EngineJoonOOP {
    double Xalg,Yalg,Xlopp,Ylopp;
    Pane pane;

    public EngineJoonOOP(Pane panes ){
        pane = panes;
        getKoordi ();

    }
    private void getKoordi (){

        pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Xalg = event.getX();
                Yalg = event.getY();
                System.out.println("Xalg = " + Xalg+ "Yalg"+ Yalg);

                pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        Xlopp = event.getX();
                        Ylopp = event.getY();


                        joonistaLine ();
                    }
                });



            }
        });

    }

    private void joonistaLine () {

        System.out.println("Xlopp = " + Xalg+ "Ylopp"+ Yalg);
        Line line = new Line(Xalg,Yalg,Xlopp,Ylopp);
        pane.getChildren().add(line);
    }

}
