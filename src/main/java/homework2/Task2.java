package homework2;

public class Task2 {
    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static int checkNumber(int a) {
        if (a >= 0) System.out.println("Передано положительное число");
        else System.out.println("Передано отрицательное число");
        return a;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(7));
        System.out.println(checkNumber(-8));
        System.out.println(checkNumber(0));
    }
}
