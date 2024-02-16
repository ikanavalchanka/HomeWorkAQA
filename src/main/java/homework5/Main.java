package homework5;
//Задача:
//
//Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//
//Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//
//Для хранения фруктов внутри коробки можно использовать ArrayList;
//
//Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//
//Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//
//Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//
//Не забываем про метод добавления фрукта в коробку.
public class Main {
    public static void main(String[] args) {
        // Создание коробок и добавление фруктов
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruitTotheBox(new Apple());
        appleBox1.addFruitTotheBox(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruitTotheBox(new Orange());
        orangeBox1.addFruitTotheBox(new Orange());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruitTotheBox(new Apple());


        System.out.println("Box with apples nr1 weight: " + appleBox1.getWeightOfTheBox());
        System.out.println("Box with oranges nr1 weight: " + orangeBox1.getWeightOfTheBox());
        System.out.println("Box with apples nr2 weight: " + appleBox2.getWeightOfTheBox());

        System.out.println("Transfering apples from appleBox1 to appleBox2");
        appleBox1.fruitsTransfer(appleBox2);
        System.out.println("AppleBox1 weight after transfer: " + appleBox1.getWeightOfTheBox());
        System.out.println("AppleBox2 weight after transfer: " + appleBox2.getWeightOfTheBox());

        appleBox2.fruitsTransfer(appleBox2);
        System.out.println("Compare AppleBox1 vs OrangeBox1: " + appleBox1.compare(orangeBox1));
    }
}
