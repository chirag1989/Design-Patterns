package DesignPatterns.AbstractFactory.ShapeColorExample;

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {

        if ("Circle".equalsIgnoreCase(shape)) {
            return new Circle();
        }
        else if ("Rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        }
        else if ("Square".equalsIgnoreCase(shape)) {
            return new Square();
        }

        return null;
    }

    @Override
    Color getColor(String color) {

        return null;
    }
}
