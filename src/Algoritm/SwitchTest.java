package Algoritm;

/**
 * Created by Dmitry on 25.01.2017.
 */
public class SwitchTest {
    public static void main(String[] args) {



        double nomerd = Math.random()*3;
        int nomer = (int)nomerd;
        System.out.println(nomer);


        switch (nomer) {
            case 0:
                System.out.println("Tuli 0");
                break;
            case 1:
                System.out.println("Tuli 1");
                break;

            case 2:
                System.out.println("Tuli 2");
                break;
            case 3:
                System.out.println("Tuli 2");
                break;

        }
    }
}
