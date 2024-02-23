package homework4.task5;

public class Cat {
    private String name;
    private int appetite;
boolean stomachFull;

public Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
    this.stomachFull=false;
}

    public int eat(Plate p) {
        int eatenFood = p.decreaseFood(appetite);
        if (eatenFood > 0) {
            System.out.println("Cat " + name + " has eaten the food");
            stomachFull = true;
            System.out.println(name + " (cat's satiety) " + stomachFull);
        } else if (eatenFood == 0) {
            System.out.println("Cat " + name + " hasn't eaten the food");
            stomachFull = false;
            System.out.println(name + " (cat's satiety) " + stomachFull);
        }
        return eatenFood;
    }

}
