package homework2;

import java.util.Arrays;

public class Task7 {
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void massivChisla() {
        int[] massiv = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 6) {
                massiv[i] *= 2;

            }
        }
        for (int number : massiv) {
            System.out.print(number + ", ");
        }
    }
    public static void main(String[] args) {
        massivChisla();
    }
}
