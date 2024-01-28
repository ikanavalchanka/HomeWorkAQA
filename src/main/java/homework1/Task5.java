package homework1;

public class Task5
//5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
// и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
// то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
{
    public static void compareNumbers(){
        int a = 200;
        int b = 8;
        if (a>=b){
            System.out.println("a>=b");
        }
    else {
        System.out.println("a<b");
    }
    }

    public static void main(String[] args) {
        compareNumbers();
    }
}
