package homework2;

import java.util.Arrays;

public class Task5 {
    //  Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void massivChisel() {
        int[] massiv = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] >= 1) {
                massiv[i] = 0;
            } else if (massiv[i] <= 0) {
                massiv[i] = 1;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + ", ");
        }
    }

    public static void main(String[] args) {
        massivChisel();
    }
}