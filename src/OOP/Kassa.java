package OOP;

import java.util.ArrayList;

/**
 * Created by Dmitry on 25.01.2017.
 */
public class Kassa {

    String pidaja;
    ArrayList <String> kaubad = new ArrayList<>();
    public Kassa (String kassapidaja)
    {
        this. pidaja = kassapidaja;
    }

    public void lisaToode(String toode){
        kaubad.add(toode);
    }

    public  void eemaldaToode (String toode){
        kaubad.remove(toode);
    }

    public void prindiOstutsekk(){
        System.out.println(kaubad);
    }
    public void prindiKassapidajaNimi (){
        System.out.println("Kassapidaja nimi on " + pidaja);
    }



}
