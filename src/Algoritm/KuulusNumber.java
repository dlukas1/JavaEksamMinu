package Algoritm;
import java.util.Arrays;

public class KuulusNumber {
    /**
     * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
     * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.

     public class Algoritm.KuulusNumber {

     public static void main(String[] args) {

     int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
     }
     }
     */
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,4,5,6,7,7,7,7,9,8};

        //sorteerime massiivi suurenemise jargi
        Arrays.sort(mass);

        int frq = 1;
        int max_frq = 1;
        int frequentNum=0;

        for (int i = 0; i < mass.length-1; i++)

            {   //kogu loogika toimib kui i != 3, kui i == 3 ei lahe arvesse
            if (mass[i] !=3 )
            {

                //Kui praegune liige == jargmisele - lisame frq
                if (mass[i] == mass [i+1]){
                    frequentNum = mass[i];
                    frq++;
                }
                }
                if (frq >  max_frq) {
                max_frq = frq;
                frequentNum = mass[i];

            }
        }
        System.out.println("Number " + frequentNum + " ilmub " + max_frq + " korda ");

    }

}



