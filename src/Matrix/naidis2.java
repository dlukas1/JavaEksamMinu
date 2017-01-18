package Matrix;

import java.util.Random;

/*
Программа создает матрицу 5 х 7, заполняет случайными числами и находит наименьший элемент в каждом ряду
 */
public class naidis2 {
    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        int[][] matrix = new int[m][n];
//заполняем матрицу случайными элементами
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomNumbers();
            }
        }
// выводим
        showMatrix(matrix);
//сортируем элементы в строках
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        swap(matrix, i, j, k);
                    }
                }

            }
// выводим минимальный елемент
            System.out.println("minimal element row-" + (i + 1) + " = " + matrix[i][0]);
        }
    }

    //метод генерирует и возвращает случайное число от 0 до 99
    public static int randomNumbers() {
        Random r = new Random();
        return r.nextInt(100);
    }

    // метод перестановки елементов
    public static void swap(int[][] matrix, int i, int j, int k) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][k];
        matrix[i][k] = tmp;
    }

    //метод рисует матрицу(без сдвигов)
    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (String.valueOf(matrix[i][j]).length() < 2) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
