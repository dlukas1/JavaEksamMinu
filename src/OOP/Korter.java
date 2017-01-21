package OOP;

import java.util.ArrayList;

/**
 * Created by Dmitry on 21.01.2017.
 */
public class Korter {
    int mahub;
    ArrayList kylalised = new ArrayList();

    public Korter(int mahutab){
        this.mahub= mahutab;
    }

    public void saabus (String nimi){


    if (kylalised.size() <10){
        kylalised .add(nimi) ;
    } else {
        System.out.println(nimi + " sa ei mahu, go to hell!");
    }




    }
    public void prindiKylalisteArv(){
        System.out.println("Korteris on: "+ kylalised.size());
    }
    public void prindiPaljuVeelMahub(){
        System.out.println("Veel mahub " + (mahub - kylalised.size()));
    }

    public void lahkus(String nimi) {
        kylalised.remove(nimi);

    }
}
