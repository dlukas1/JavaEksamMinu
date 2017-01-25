package Algoritm;

import java.util.Random;
import java.util.Scanner;

/**
 * Игра в орел/решка на деньги
 */
public class MyndiMang {
    public static void main(String[] args) {

        int raha = 100;
        int win = 0;
        int ran;
        while (raha>0) {

            Scanner sc = new Scanner(System.in);
            System.out.println("1 ili 2 ?");
            int orre = sc.nextInt();
            if (orre!=1|| orre !=2){
                System.out.println("Incorrect number, enter again:");
                orre = sc.nextInt();
            }else
                {
            System.out.println("Stavka: ");
            int bet = sc.nextInt();


            if (Math.random() % 2 == 0) {
                ran = 2;
            } else {
                ran = 1;
            }
            System.out.println(ran);

            if (orre == ran) {
                System.out.println("You win!");
                win = bet * 2;
            } else {
                System.out.println("You lost");
                win = 0;
            }
            raha = raha - bet + win;
            System.out.println("On jaanud: " + raha);

        }}


    }


}
