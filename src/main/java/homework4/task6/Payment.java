package homework4.task6;
import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> items;  // Список товаров в покупке

    public Payment() {
        items = new ArrayList<>();
    }
    public void addItem(String itemName, double price) {
        Item newItem = new Item(itemName, price);
        items.add(newItem);
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }
    public void printPaymentDetails() {
        System.out.println("Products list:");
        for (Item item : items) {
            System.out.println(item.getItemName() + ": " + item.getPrice());
        }
        System.out.println("Total purchase amount: " + getTotalAmount());
    }
}
