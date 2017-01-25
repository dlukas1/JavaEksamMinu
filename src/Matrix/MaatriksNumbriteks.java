package Matrix;

/**
 * Created by Dmitry on 25.01.2017.
 */public class MaatriksNumbriteks{

    /**
     *
     */
    public static void main(String[] args) {
        int pikkus = 13;
        int k = 0;

        for (int i = 0; i < pikkus; i++) {
            k = i;
            for (int j = 0; j < pikkus; j++) {
                if (k == pikkus) {
                    k = 0;
                }
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

}