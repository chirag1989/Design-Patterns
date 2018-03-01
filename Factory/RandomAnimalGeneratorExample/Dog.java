package DesignPatterns.Factory.RandomAnimalGeneratorExample;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog: Bow-Bow");
    }
}
