package Eksam;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Foor {

    //У класса Фоор есть след параметры:
    Pane pane;
    Circle pun = new Circle(30);
    Circle kol = new Circle(30);
    Circle roh = new Circle(30);
    int xPun, xRoh,xKol, laius,korgus, xAlg, yAlg;
    int yPun, yRoh,yKol;





    public Foor(Pane panes)
    {
        pane = panes;


    }







    public void looFoor(int pos){

        if (pos == 1){
            xAlg = 300;
            laius = 80;
            korgus = 200;
            xPun = 340;
            xKol = 340;
            xRoh = 340;
            yPun = 35;
            yKol = 100;
            yRoh = 165;
         //   startFoor();
        }
        else if (pos == 3){
            xAlg = 300;
            yAlg = 290;
            laius = 80;
            korgus = 200;
            xPun = 340;
            xKol = 340;
            xRoh = 340;
            yPun = 455;
            yKol = 390;
            yRoh = 325;
        //    startFoor();
        }
        else if (pos == 2){
            xAlg = 400;
            yAlg = 205;
            laius = 200;
            korgus = 80;
            xPun = 565;
            xKol = 500;
            xRoh = 435;
            yPun = 245;
            yKol = 245;
            yRoh = 245;
         //   startFoorVastupidi();
        }

        else if (pos == 4){
            xAlg = 80;
            yAlg = 205;
            laius = 200;
            korgus = 80;
            xPun = 115;
            xKol = 180;
            xRoh = 245;
            yPun = 245;
            yKol = 245;
            yRoh = 245;
       //     startFoorVastupidi();
        }


            Rectangle korpus = new Rectangle(laius,korgus);
            korpus.setTranslateX(xAlg);
        korpus.setTranslateY(yAlg);
            korpus.setFill(Color.DARKGRAY);
            pun.setTranslateX(xPun);
            kol.setTranslateX(xKol);
            roh.setTranslateX(xRoh);

            pun.setTranslateY(yPun);
            kol.setTranslateY(yKol);
            roh.setTranslateY(yRoh);

            pane.getChildren().addAll(korpus,pun,kol,roh);


               // kollaneVilgub();








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

    public void kollaneVilgub(boolean vilgu){
        Timeline flashYellow = new Timeline(

                new KeyFrame(Duration.seconds(0.5), e -> {
                    kol.setFill(Color.YELLOW);
                }),
                new KeyFrame(Duration.seconds(1.0), e -> {
                    kol.setFill(Color.BLACK);
                }),
                new KeyFrame(Duration.seconds(1.0), e -> {
                    kollaneVilgub(vilgu);
                })
        );
        flashYellow.setCycleCount(1);
        flashYellow.play();
       if(vilgu == false){
            flashYellow.stop();}



    }

    //startFoor - управляет циклами смены цветов
    public void startFoor (){
        Timeline foor = new Timeline(
                new KeyFrame(Duration.seconds(0), e-> {
                    vahetaPunaseks();
                }),
                new KeyFrame(Duration.seconds(7), e-> {
                    vahetaKollaseks();
                }),
                new KeyFrame(Duration.seconds(9.5), e-> {
                    vahetaRoheliseks();
                }),
                new KeyFrame(Duration.seconds(16.5), e-> {
                    vahetaKollaseks();

                }),
                new KeyFrame(Duration.seconds(19), e-> {
                    startFoor();

                })
        );foor.setCycleCount(1);
        foor.play();
    }

    public void startFoorVastupidi (){
        Timeline foor = new Timeline(
                new KeyFrame(Duration.seconds(0), e-> {
                    vahetaRoheliseks();
                }),
                new KeyFrame(Duration.seconds(7), e-> {
                    vahetaKollaseks();
                }),
                new KeyFrame(Duration.seconds(9.5), e-> {
                    vahetaPunaseks();
                }),
                new KeyFrame(Duration.seconds(16.5), e-> {
                    vahetaKollaseks();

                }),
                new KeyFrame(Duration.seconds(19), e-> {
                    startFoor();

                })
        );foor.setCycleCount(1);
        foor.play();
    }

    public void kustuta (){
        kollaneVilgub(true);
    }



}
