package Algoritm;
import java.util.Random;
/*
Есть 3 массива - муж.имена, жен.имена и действия.
 Сост. программу, кот. будет их комбинировать
 */
public class RandomActions {

        static String[] mehenimi = {"Ago", "Olli", "Rasmus"};
        static String[] naisenimi = {"Kati", "Mia", "Nora"};
        static String[] tegevus = {"mängib", "loeb", "töötab"};

        public static void main(String[] args) {

            Random rand = new Random();

            System.out.println(mehenimi[rand.nextInt(3)] + " " +
                    tegevus[rand.nextInt(3)] + " " + naisenimi[rand.nextInt(3)] + "ga");

        }

    }
