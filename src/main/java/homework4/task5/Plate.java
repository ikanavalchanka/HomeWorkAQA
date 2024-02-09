package homework4.task5;

public class Plate {
    private int food;
    public Plate (int food){
        this.food=food;
    }
    public void decreaseFood(int n){
        if(n> food){
            System.out.println("I cant eat more than " +food);
        }else
        food -=n;
    }
    public void info(){
        System.out.println("Plate" + food);
    }
}