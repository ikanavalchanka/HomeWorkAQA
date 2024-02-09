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
public void eat(Plate p){
    p.decreaseFood(appetite);
    }

}
