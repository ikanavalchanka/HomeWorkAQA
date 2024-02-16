package homework5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    public Box(){
        fruits = new ArrayList<>();
    }
    public void addFruitTotheBox(T fruit){
        fruits.add(fruit);
    }
    public float getWeightOfTheBox(){
        float weightOfThebox = 0.0f;
        for (T fruit: fruits){
            weightOfThebox +=fruit.weight;
        }
        return weightOfThebox;
    }
    public boolean compare(Box<?> otherBox) {
        return this.getWeightOfTheBox() == otherBox.getWeightOfTheBox();
    }
public void fruitsTransfer(Box<T> otherBox){
        if (this ==otherBox){
            System.out.println("You cant transfer fruits to the same box ");
            return;
        }
    if (fruits.size() > 0 && otherBox.fruits.size() == 0
            || fruits.get(0).getClass() == otherBox.fruits.get(0).getClass()) {
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }else{
        System.out.println("You cant transfer the same fruit types");
    }

}
}
