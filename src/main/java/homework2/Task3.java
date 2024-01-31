package homework2;

public class Task3 {
    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
    static boolean checkNumbers(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(checkNumbers(-1));
        System.out.println(checkNumbers(0));
        System.out.println(checkNumbers(12));
    }
}
