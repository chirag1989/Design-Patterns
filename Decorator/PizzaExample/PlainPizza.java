package DesignPatterns.Decorator.PizzaExample;

public class PlainPizza implements Pizza {

    public PlainPizza() {
        System.out.println("Adding plain dough");
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
