package Matrix;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 *
 * Näide 5*5 laual:
 * 30 29 28 27 26
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsikrus {
    public static void main(String[] args) {

            int m = 10;
            int n = 10;
           String[][] matrix = new String[m][n];
            //taidame maatriksi
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = numbers(i,j);
                }
            }
            printMaatriks(matrix);
        }

    public static String numbers (int i, int j){
        int number;

        if(i%2 == 1){
            number = (90-10*i) + (j+1);
        }
        else {
            number = (90-10*i) + (10-j);
        }

        return String.format("%02d",number ); //format - 02 = двухзначное число
    }








    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(String[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
