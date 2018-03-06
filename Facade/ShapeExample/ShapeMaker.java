package DesignPatterns.Facade.ShapeExample;

public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSqaure() {
        square.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
}
