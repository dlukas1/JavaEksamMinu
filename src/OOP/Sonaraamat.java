package OOP;
import java.util.ArrayList;

public class Sonaraamat {

    String raamatuKeel;
    ArrayList <String> sonastik = new ArrayList<String>();

    public Sonaraamat(String keel)
    {
        this.raamatuKeel = keel;
    }

    public  void sisestaSona(String sona)
    {
            sonastik.add(sona);
    }

    public String[] otsiEsimeseTaheJargi (String taht){
        char esimeneTaht = taht.charAt(0);
        ArrayList <String> sobivAlgus = new ArrayList<String>();

        for (int i = 0; i < sonastik.size(); i++) {
            if(sonastik.get(i).charAt(0) == esimeneTaht){
                String tahegaSone = sonastik.get(i);
                sobivAlgus.add(tahegaSone);
            }
        }
        String [] sobivaAlgusegaString = new String[sobivAlgus.size()];
        for (int i = 0; i <sobivAlgus.size() ; i++) {
            sobivaAlgusegaString[i] = sobivAlgus.get(i);
        }






        return  sobivaAlgusegaString;
    }

    public void eemaldaSona (String str)
    {
        sonastik.remove(str);
    }


    public void misKeelesRaamatOn(){
        System.out.println("Raamat on " + raamatuKeel +" keeles");
    }


public void misOnRaamatus(){
    System.out.println(sonastik);
}
}