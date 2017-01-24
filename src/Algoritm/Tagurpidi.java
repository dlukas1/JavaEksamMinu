package Algoritm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Вводим в консоль соово и получаем его задом наперед
 */
public class Tagurpidi {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta sõna :");
        String sona = sc.nextLine();
        char[] mas = sona.toCharArray();
        char [] tagur = new char[mas.length];

        for (int i = 0; i <mas.length; i++) {
            tagur [i] = mas [mas.length -1- i];
        }
        System.out.println(String.valueOf(tagur));






    }

}
