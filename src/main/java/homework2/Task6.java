package homework2;

public class Task6 {
    // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void massiv100(){
        int massiv [] = new int [100];
        for (int i=0; i< massiv.length; i++){
            massiv[i]= i+1;
        }
        for (int chislo : massiv){
            System.out.print( chislo +", ");
        }
    }

    public static void main(String[] args) {
        massiv100();
    }
}
