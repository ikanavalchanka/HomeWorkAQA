package homework4.task5;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("plate: " + food);
    }
public int decreaseFood(int n){
        if ( n>food){
            System.out.println("I cant eat more than " + food);
            int eatenFood = food;
            food = 0;
            return food;
        }else {
            food -=n;
            return n;
        }
}
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
