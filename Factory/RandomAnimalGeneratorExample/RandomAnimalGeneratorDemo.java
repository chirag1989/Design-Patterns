package DesignPatterns.Factory.RandomAnimalGeneratorExample;

public class RandomAnimalGeneratorDemo {

    public static void main(String... args) {

        AnimalGenerator animalGenerator = new AnimalGenerator();

        Animal animal1 = animalGenerator.getRandomAnimal();
        animal1.makeSound();

        Animal animal2 = animalGenerator.getRandomAnimal();
        animal2.makeSound();
    }
}
