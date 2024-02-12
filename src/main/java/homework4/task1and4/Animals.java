package homework4.task1and4;

public class Animals {
    public static int totalAnimals = 0;
    public String name;

    public Animals(String name) {
        this.name = name;
        totalAnimals++;
    }

    public void run(int runDistance) {
        System.out.println(name + " :" + " I ran " + runDistance + " meters");
    }

    public void swim(int swimDistance) {
        System.out.println(name + " :" + " I swam " + swimDistance);
    }
}
