package Matrix;

import java.util.Arrays;

import static Matrix.KaguNurk.numbrid;


/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 */
public class Kikilips {

    public static void main(String[] args) {
        int m = 9;
        int n = 9;
        char[][] matrix = new char[m][n];
        //taidame maatriksi
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = numbrid(i,j);
            }
        }
        printMaatriks(matrix);
    }
    /*
    Можно поделить поле на 4 квадрата и для каждого рисовать по половине
     */
     public static char numbrid(int i, int j){
         char cifra ;



         if (i >= j && i + j <9 ){

          cifra = '0';
         }
         else if ( i<=j && i+j>=8){
             cifra = '0';
         }

         else {
             cifra = 0;
         }
         return cifra;
            }



         /*
          Алгоритм вроде понятен. i - номер текущей строки, начиная с нуля.
          Заполняешь элементы нулями, если их номер < i и >= n-1 , где n - количество столбцов.
          Остальные элементы единицами. Доходишь до середины, которую найти как количество
          строк разделить нацело на 2 и плюс 1. Дальше думаю логично пойти от последней строки до середины.
          Аналогично, но теперь заполняешь нулями элементы, если их номер < n-i и > i. Остальные единицами.
          for (i=0;i<arr.length/2+1;i++){
            for (j=0;j<arr[i].length;j++){
                if ((j<i) || (j>=(arr[i].length-i)))
                  arr[i][j]=0;
                else
                  arr[i][j]=1;

        }

        }
        for (i=arr.length-1; i>=arr.length/2+1(тут возможно надо убрать +"1"); i--){
              for (j=0; j<arr[i].length; j++){
                if ((j<(arr[i].length-1-i)) || (j>i))
                  arr[i][j]=0;
                else
                  arr[i][j]=1;}
        }
          */


    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(char[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("               ");
    }
}