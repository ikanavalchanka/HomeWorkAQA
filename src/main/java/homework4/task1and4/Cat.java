package homework4.task1and4;

public class Cat extends Animals {
    public static int totalCats = 0;
    static int catMaxRunDistance = 200;
    static int catMaxSwimDistance = 0;

    Cat(String name) {
        super(name);
        totalCats++;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= catMaxRunDistance) {
            super.run(runDistance);
        } else if (runDistance > catMaxRunDistance) {
            System.out.println(name + " :" + "I cant run more than " + catMaxRunDistance);
        }
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println(name + ":" + " I cant swim");
    }
}

