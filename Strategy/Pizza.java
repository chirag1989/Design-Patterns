package DesignPatterns.Strategy;

public class Pizza {

    private String name;
    private int cost;

    public Topping toppingType;

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getToppingIfAny() {
        return toppingType.getTopping();
    }

    public void setToppingType(Topping toppingType) {
        this.toppingType = toppingType;
    }
}