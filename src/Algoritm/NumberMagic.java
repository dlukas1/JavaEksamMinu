package Algoritm;

/**
 * Created by Dmitry on 26.01.2017.
 */
public class NumberMagic {

    public static void main(String[] args) {


        System.out.println(isTeen(10,8,16));

    }

    public static boolean isTeen (int a, int b, int c){
        //если из трех возрастов хоть 1 от 13 до 19 - true
        return (a >= 13 && a<= 19)||
                (b>=13 && b <=19)||
                (c>=13 && c <=19);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        /*
        Given 2 int values, return true if one is negative and one is positive.
        Except if the parameter "negative" is true, then return true only if both are negative.
        posNeg(1, -1, false) → true
        Интересный вариант записи, коротко и красиво
         */
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }







}
