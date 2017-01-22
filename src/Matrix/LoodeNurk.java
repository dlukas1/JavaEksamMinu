package Matrix;

import java.util.Arrays;

import static Matrix.KaguNurk.numbrid;

/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class LoodeNurk {

    public static void main(String[] args) {
        int m = 9;
        int n = 9;
        int[][] matrix = new int[m][n];
        //taidame maatriksi
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = numbrid(i,j);
            }
        }
        printMaatriks(matrix);
    }

    public static int numbrid (int i, int j){
        int cifra = 0;

        if(i ==0 ||j ==0){
            cifra = 1;
        }
        else if (i ==j){
            cifra = i+1;
        }
        else if (j>i){
            cifra = i+1;
        } else {
            cifra = j+1;
        }


        return cifra;
    }




    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }

}
