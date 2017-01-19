package Algoritm;

/**
 * Created by Dmitry on 19.01.2017.
 */
public class Naidised {

    //factorial - рекурсивно вычисляет факториал числа n
    static int factorial (int n) {
        if (n==1) {
            return 1;
        } else if (n==2) {
            return 2;
        } else {
            return factorial(n-1) * n;
        }
    }
}
