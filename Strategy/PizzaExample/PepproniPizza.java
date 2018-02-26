package DesignPatterns.Strategy.PizzaExample;

public class PepproniPizza extends Pizza {

    public PepproniPizza() {
        super();
        toppingType = new PepproniTopping();
    }
}
