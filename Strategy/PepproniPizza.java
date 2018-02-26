package DesignPatterns.Strategy;

public class PepproniPizza extends Pizza {

    public PepproniPizza() {
        super();
        toppingType = new PepproniTopping();
    }
}
