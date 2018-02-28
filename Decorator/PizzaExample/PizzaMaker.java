package DesignPatterns.Decorator.PizzaExample;

public class PizzaMaker {

    public static void main(String... args) {

        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients of my Pizza: " + pizza.getDescription());
        System.out.println("Price of my Pizza: " + pizza.getCost());
    }
}
