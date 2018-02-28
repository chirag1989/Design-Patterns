package DesignPatterns.Decorator.PizzaExample;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza decoratedPizza;

    public ToppingDecorator(Pizza newPizza) {
        decoratedPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
