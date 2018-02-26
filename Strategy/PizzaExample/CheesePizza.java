package DesignPatterns.Strategy.PizzaExample;

public class CheesePizza extends Pizza {

    public CheesePizza() {

        super();
        toppingType = new NoTopping();
    }

}
