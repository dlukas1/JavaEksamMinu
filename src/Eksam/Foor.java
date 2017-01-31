package Eksam;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Foor {

    //У класса Фоор есть след параметры:
    Pane pane;
    Circle pun = new Circle(50);
    Circle kol = new Circle(50);
    Circle roh = new Circle(50);

    //Надо добавить расположение на гридпайне
    public Foor(Pane panes)
    {
        pane = panes;
        looFoor();
    }

    private  void looFoor(){
        Rectangle korpus = new Rectangle(150,450);
        korpus.setTranslateX(150);
        korpus.setTranslateY(50);
        korpus.setFill(Color.DARKGRAY);
        pun.setTranslateX(220);
        pun.setTranslateY(120);
        kol.setTranslateX(220);
        kol.setTranslateY(270);
        roh.setTranslateX(220);
        roh.setTranslateY(420);
        pane.getChildren().addAll(korpus,pun,kol,roh);

        startFoor();
    }


    //Методы для смены цвета: KeyFrame указывает через сколько времени должно произойти след действие
     //flashRed.setCycleCount(1); - сколько циклов
    //flashRed.play();
    private void vahetaPunaseks (){
        pun.setFill(Color.RED);
        kol.setFill(Color.BLACK);
        roh.setFill(Color.BLACK);
        Timeline flashRed = new Timeline(

                new KeyFrame(Duration.seconds(5), e -> {
                    pun.setFill(Color.BLACK);
                }),
                new KeyFrame(Duration.seconds(5.5), e -> {
                    pun.setFill(Color.RED);
                }),
                new KeyFrame(Duration.seconds(6), e -> {
                    pun.setFill(Color.BLACK);}),
                 new KeyFrame(Duration.seconds(6.5), e -> {
                   pun.setFill(Color.RED);
                  }),
                new KeyFrame(Duration.seconds(7), e -> {
                    pun.setFill(Color.BLACK);})
        );
        flashRed.setCycleCount(1);
        flashRed.play();
    }

    private void vahetaKollaseks(){

            Timeline flashYellow = new Timeline(

                    new KeyFrame(Duration.seconds(0.5), e -> {
                        kol.setFill(Color.YELLOW);
                    }),
                    new KeyFrame(Duration.seconds(1.0), e -> {
                        kol.setFill(Color.BLACK);
                    })
            );
       flashYellow.setCycleCount(2);
            flashYellow.play();
        }

    private void vahetaRoheliseks (){
        pun.setFill(Color.BLACK);
        kol.setFill(Color.BLACK);
        roh.setFill(Color.GREEN);
        Timeline flashGreen = new Timeline(

                new KeyFrame(Duration.seconds(5), e -> {
                    roh.setFill(Color.BLACK);
                }),
                new KeyFrame(Duration.seconds(5.5), e -> {
                    roh.setFill(Color.GREEN);
                }),
                new KeyFrame(Duration.seconds(6), e -> {
                    roh.setFill(Color.BLACK);}),
                new KeyFrame(Duration.seconds(6.5), e -> {
                    roh.setFill(Color.GREEN);
                }),
                new KeyFrame(Duration.seconds(7), e -> {
                    roh.setFill(Color.BLACK);})
        );
        flashGreen.setCycleCount(1);
        flashGreen.play();
    }

    //startFoor - управляет циклами смены цветов
    private void startFoor (){
        Timeline foor = new Timeline(
                new KeyFrame(Duration.seconds(0), e-> {
                    vahetaPunaseks();
                }),
                new KeyFrame(Duration.seconds(7), e-> {
                    vahetaKollaseks();
                }),
                new KeyFrame(Duration.seconds(9), e-> {
                    vahetaRoheliseks();
                }),
                new KeyFrame(Duration.seconds(16), e-> {
                    vahetaKollaseks();

                }),
                new KeyFrame(Duration.seconds(18), e-> {
                    startFoor();

                })
        );foor.setCycleCount(1);
        foor.play();
    }
}
