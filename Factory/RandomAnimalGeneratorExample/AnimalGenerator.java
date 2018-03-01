package DesignPatterns.Factory.RandomAnimalGeneratorExample;

import java.util.Random;

public class AnimalGenerator {

    public Animal getRandomAnimal() {

        Random random = new Random();
        int num = random.nextInt(3) + 1;

        if (num == 1) {
            return new Cat();
        }
        else if (num == 2) {
            return new Dog();
        }
        else {
            return new Duck();
        }
    }
}
