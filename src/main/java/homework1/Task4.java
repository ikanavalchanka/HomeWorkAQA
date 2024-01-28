package homework1;

public class Task4 {
    public static void printColor(){
        int value =101;
        if (value<=0){
            System.out.println("Красный");
        } else if (value>0 & value<=100 )  {
            System.out.println("Желтый");
        }
        if (value>100) {
            System.out.println("Зеленый");
        }
    }

    public static void main(String[] args) {
        printColor();
    }
}
