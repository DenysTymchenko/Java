import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);
        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println("");
        ArrayList<CanRun> runningAnimals = new ArrayList<>();
        runningAnimals.add(dog);
        runningAnimals.add(cat);
        runningAnimals.add(bird);
        for (CanRun animal : runningAnimals) {
            animal.run();
        }

        System.out.println("");
        bird.fly();
    }
}
