package DesignPatterns.Strategy.PizzaExample;

public class PizzaMain {

    public static void main(String... args) {

        Pizza cheesePizza = new CheesePizza();
        System.out.println("Cheese Pizza: " + cheesePizza.getToppingIfAny());

        Pizza pepproniPizza = new PepproniPizza();
        System.out.println("Pepproni Pizza: " + pepproniPizza.getToppingIfAny());

        // Updating the topping type
        cheesePizza.setToppingType(new PepproniTopping());
        System.out.println("Cheese Pizza: " + cheesePizza.getToppingIfAny());
    }
}