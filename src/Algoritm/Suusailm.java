package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.  Вычисли на сколько положит чисел больше чем отрицат.
 */
public class Suusailm {

    public static void main(String[] args) {

        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        arvutaPaevu(kraadid1);
        arvutaPaevu(kraadid2);
    }


    public static void arvutaPaevu(int[] kraadid) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < kraadid.length; i++) {
            if (kraadid[i] >= 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println("posit = " + a);
        System.out.println("negat = " + b);
        if (a > b) {
            System.out.println("Soojad paevu oli " + (a - b) + " rohkem");
        } else {
            System.out.println("Kylma paevu oli " + (b - a) + " rohkem");
        }
    }
}