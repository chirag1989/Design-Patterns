package DesignPatterns.Decorator.PizzaExample;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Mozzarrella");
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 0.50;
    }
}
