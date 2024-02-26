package homework7;

import java.util.Arrays;

//1. Реализовать сохранение данных в csv файл;
//
//2. Реализовать загрузку данных из csv файла. Файл читается целиком.
//
//Структура csv файла:
//
//Строка заголовок с набором столбцов
//
//Набор строк с целочисленными значениями
//
//* Разделитель между столбцами - символ точка с запятой (;)
//
//Пример:
//
//Value 1;Value 2;Value 3
//
//100;200;123
//
//300;400;500
//
//Для хранения данных использовать класс вида:
//
//public class AppData {
//
//  private String[] header;
//
//  private int[][] data;
//
// // ...
//
//}
//
//Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};
        AppData appData = new AppData(header, data);

        appData.save("data.csv");

        AppData loadedData = AppData.load("data.csv");

        if (loadedData != null) {
            System.out.println("Loaded Header: " + String.join(", ", loadedData.header));
            for (int[] row : loadedData.data) {
                System.out.println(String.join(", ", Arrays.stream(row).mapToObj(String::valueOf).toArray(String[]::new)));
            }
        }
    }
}

