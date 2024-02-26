package homwork6;
//1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//
//3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
public class ArrayChecker {
    public static void arrayAndException(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int arrayColumns = 4;
        int arrayRows = 4;
        if (array.length != arrayColumns || array[0].length != arrayRows) {
            throw new MyArraySizeException(" Invalid array size, array should be 4x4! ");
        }
        int sumOfArrayElements = 0;
        for (int i = 0; i < arrayColumns; i++) {
            for (int j = 0; j < arrayRows; j++) {
                try {
                    sumOfArrayElements += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(" Invalid data in array cell [" + i + "] [" + j + "] . Cannot convert to integer.\"");
                }
            }
        }
        System.out.println("Summ of array elements = " + sumOfArrayElements);
    }

    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "oo", "12"},
                {"9", "10", "11", "12"}
        };
        try {
            arrayAndException(array1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            arrayAndException(array2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            arrayAndException(array3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}