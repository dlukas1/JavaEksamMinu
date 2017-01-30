package Eksam;
/*
Kesklinn-Mustamäe-Tabasalu-Paldiski ringristmikule pisteti istuma liiklusmutt, kelle ülesandeks on lugeda kokku palju autosi mis suunas sõidavad.
Kuna liiklus on kiire, siis on tal vaja süsteemi, kus saab kiirelt sisestada märke nii kui auto on ringilt väljunud mingis suunas.
Programm peaks väljastama järgnevat infot:
- Mitu autot kokku on läbi sõitnud.
- Kui palju autosid igas suunasliikus.
- Milline oli kõige populaarsem suund.
 */
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.Arrays;


public class Ristmik {

    GridPane pane;
    int k  = 0;
    int p = 0;
    int m = 0;
    int t = 0;
    int sum = 0;


    public Ristmik (GridPane panes){
        pane = panes;
        joonista();
        statistika ();
    }

    private void joonista(){
        Button kesklinn = new Button("Kesklinn");
        Button musta = new Button("Mustamae");
        Button taba = new Button("Tabasalu");
        Button paldi = new Button("Paldiski");

        pane.add(taba,1,0);
        pane.add(paldi,0,1);
        pane.add(kesklinn,2,1);
        pane.add(musta,1,2);

        sum = k+m+t+p;
        final Label kokku = new Label("Kokku " + sum);
        pane.add(kokku, 1,1);
        kesklinn.setOnAction(event -> {
            k++;
            sum++;
            kokku.setText("Kokku " + sum);
        });
        musta.setOnAction(event -> {
            m++;
            sum++;
            kokku.setText("Kokku " +sum);
        });
        taba.setOnAction(event -> {
            t++;
            sum++;
            kokku.setText("Kokku " +sum);
        });
        paldi.setOnAction(event -> {
            p++;
            sum++;
            kokku.setText("Kokku " +sum);
        });

    }

    private void statistika(){
        Button stat = new Button("Ulevaade");
        pane.add(stat,0,4);
        stat.setOnAction(event -> {



            Label keskL = new Label("Kesklinna sõitnud " + k + " autod");
            Label mustL = new Label("Mustamaesse sõitnud " + m + " autod");
            Label tabL = new Label("Tabasalusse sõitnud " + t + " autod");
            Label paldL = new Label("Paldiskisse sõitnud " + p + " autod");

            pane.add(keskL,5,5);
            pane.add(mustL,5,6);
            pane.add(tabL,5,7);
            pane.add(paldL,5,8);
            popular();


        });
    }


    public void popular (){

        String popSund="";
        Label populaarsem = new Label();
        pane.add(populaarsem,5,9);
        int []autosid = new int [4];
        autosid [0] = k;
        autosid [1] = m;
        autosid [2] = p;
        autosid [3] = t;
        Arrays.sort(autosid);
        int  popi = autosid[3];
        System.out.println("pop= "+ popi);
        int pop2 = autosid[2];
        System.out.println( "pop2=" + pop2);
        if( popi == pop2){
            popSund = " ei ole, autod soidavad vordselt";
            System.out.println("p1= "+ popi + " p2= "+ pop2);
        }
        else if(popi == m)
        {
            popSund = " Mustamae ";
        }
        else if (popi ==p){
            popSund = " Paldiski ";
        }else if (popi == t){
            popSund = " Tabasalu ";
        }
        else if(popi == k){
            popSund = " Kesklinn ";
        }
        else {
            popSund = "Wtf???";
        }
        populaarsem.setText("Koige populaarsem suund on"+ popSund);


    }




}
