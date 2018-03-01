package DesignPatterns.Factory.RandomAnimalGeneratorExample;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat: Meow");
    }
}
