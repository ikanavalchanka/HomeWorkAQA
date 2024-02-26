package homework4.task1and4;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//
//4. * Добавить подсчет созданных котов, собак и животных.

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasilii");
        Cat cat2 = new Cat("Barsik");
        cat1.run(200);
        cat1.swim(111);
        cat2.run(350);

        Dog dog1 = new Dog("Reks");
        Dog dog2 = new Dog("Bobik");
        dog1.run(444);
        dog1.swim(8);
        dog2.run(550);
        dog2.swim(15);
        System.out.println("___________________________________________________ \n ANIMALS COUNTER");
        System.out.println("Animals created : " + Animals.totalAnimals);
        System.out.println("Cats created : " + Cat.totalCats);
        System.out.println("Dogs created : " + Dog.totalDogs);

    }
}
