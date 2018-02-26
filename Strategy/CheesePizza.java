package DesignPatterns.Strategy;

public class CheesePizza extends Pizza {

    public CheesePizza() {

        super();
        toppingType = new NoTopping();
    }

}
