package homework4.task5;

public class Main {
    public static void main(String[] args) {
        Cat cat= new Cat("JORIK",52 );
        Cat cat2 = new Cat( "VASIA", 14);
        Plate plate = new Plate(10);
        Plate plate2 = new Plate(25);

        plate.info();
        cat.eat(plate);
        plate.info();

        plate2.info();
        cat2.eat(plate2);
        plate2.info();
    }
}
