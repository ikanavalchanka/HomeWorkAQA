package homework2;

public class Task4 {
    // Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
static void stroka(String s,int n){
    for (int i=0; i<n;i++){
        System.out.println(s);
    }
}

    public static void main(String[] args) {
        stroka("Stroka",7);
    }
}
