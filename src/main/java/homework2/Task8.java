package homework2;

public class Task8 {
//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
public static void kvadrtniMassiv (){
    int size=4;
    int [][] massiv = new int [size][size];
    for (int i=0; i<size;i++){
        massiv[i][i]=1;
    }
    for (int i=0;i<size;i++){
        for (int j=0;j<size;j++){
            System.out.print(massiv[i][j] + " ");
        }
        System.out.println();
    }

}

    public static void main(String[] args) {
        kvadrtniMassiv();
    }
}
