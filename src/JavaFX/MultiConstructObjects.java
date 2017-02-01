package JavaFX;

import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class MultiConstructObjects {

    Pane pane;
    Circle circle;
    Rectangle rectangle;
    Polygon poly;

    public MultiConstructObjects (Pane panes){
        pane = panes;
        nuppud ();

        polyStar();
    }

    public void nuppud (){
        ChoiceBox boxShape = new ChoiceBox(FXCollections.observableArrayList(
                "Circle", "Rectangle", "Polygon"));
        ChoiceBox quantity = new ChoiceBox(FXCollections.observableArrayList(
                1,2,3,4));
        pane.getChildren().addAll(boxShape,quantity);
        quantity.setTranslateY(30);
    }

    public void polyStar (){
        Polygon polystar = new Polygon();
        polystar.getPoints().addAll(new Double[]{
                200.0, 0.0,
                180.0, 120.0,
                220.0, 120.0
        });


        polystar.setRotate(90);
        pane.getChildren().add(polystar);


        };


    }

