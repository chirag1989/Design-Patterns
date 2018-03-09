package DesignPatterns.Bridge.CircleExample;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void draw();
}
