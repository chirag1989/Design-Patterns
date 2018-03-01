package DesignPatterns.Factory.ShapeExample;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }
        else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        else if("Square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        else {
            return null;
        }
    }
}
