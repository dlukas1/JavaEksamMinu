package Algoritm;

import java.util.ArrayDeque;
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
        int[] naide = {1,2,3,4,4,4,5};
        Arrays.sort(naide);
        for (int i = 0; i < naide.length; i++)
        {
            if (naide[i] !=3 )
            {
                int num = naide[i];
                int frq = 1;
                int max_frq = 1;
                if (naide[i] == naide [i+1]){
                    frq++;
                }
                if (frq >  max_frq) {
                    max_frq = frq;
                    num = naide[i];
                }
                System.out.println("Number " + num + " ilmub " + max_frq + " korda ");
            }

        }

    }

}



