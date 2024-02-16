package homework4.task5;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int decreaseFood(int n) {
        if (n > food) {
            System.out.println("I cant eat more than " + food);
            return 0;
        } else {
            food -= n;
            return n;
        }
    }

    public void info() {
        System.out.println("Plate contains " + food + " pieces of food");
    }

    public void addFood(int addSomeFood) {
        if (addSomeFood <= 0) {
            System.out.println("You can't add negative or zero amount of food ");
        } else {
            food += addSomeFood;
            System.out.println("You have successfully added " + addSomeFood + " to the plate");
        }
    }
}