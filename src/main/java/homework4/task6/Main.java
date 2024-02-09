package homework4.task6;
import java.util.ArrayList;
import java.util.List;
//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Product 1", 20.0);
        payment.addItem("Product 2", 30.0);
        payment.addItem("Product 3", 15.0);

        payment.printPaymentDetails();
    }
}
