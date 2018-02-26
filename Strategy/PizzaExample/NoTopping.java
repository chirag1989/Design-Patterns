package DesignPatterns.Strategy.PizzaExample;

public class NoTopping implements Topping {

    public String getTopping() {
        return "There is no topping";
    }
}