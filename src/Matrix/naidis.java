package Matrix;

public class naidis {

    public static void main(String[] args) {
        int firstarray [][] = { {8,9,10,11}, {12,13,14,15} };
        int secondarray [] [] = { {30,31,32,33}, {34}, {35,36,37} };

        System.out.println("This is first array:");
        display(firstarray);
        System.out.println("This is second array");
        display(secondarray);
    }

    public static void display (int [][] x) {
        for (int row = 0; row <x.length ; row++) {
            for (int column = 0; column < x [row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }

    }
}
