package homework4.task1and4;

public class Dog extends Animals {
    public static int totalDogs = 0;
    static int dogMaxRunDistance = 500;
    static int dogMaxSwimDistance = 10;

    Dog(String name) {
        super(name);
        totalDogs++;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= dogMaxRunDistance) {
            System.out.println(name + " :" + " I ran " + runDistance + " meters");
        } else if (runDistance > dogMaxRunDistance) {
            System.out.println(name + " :" + " I cant run more than " + dogMaxRunDistance + " meters");
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= dogMaxSwimDistance) {
            System.out.println(name + " :" + " I swam " + swimDistance + " meters");
        } else if (swimDistance > dogMaxSwimDistance) {
            System.out.println(name + " :" + " I cant swim more than " + dogMaxSwimDistance + " meters");
        }
    }
}

