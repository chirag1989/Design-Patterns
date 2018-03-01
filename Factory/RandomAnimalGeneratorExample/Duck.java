package DesignPatterns.Factory.RandomAnimalGeneratorExample;

public class Duck implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Duck: Quack");
    }
}
