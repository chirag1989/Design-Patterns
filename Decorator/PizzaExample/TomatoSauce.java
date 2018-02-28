package DesignPatterns.Decorator.PizzaExample;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding tomato sauce");
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 0.35;
    }
}
