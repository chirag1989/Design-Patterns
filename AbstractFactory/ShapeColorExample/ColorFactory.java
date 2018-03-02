package DesignPatterns.AbstractFactory.ShapeColorExample;

public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }
        else if ("Red".equalsIgnoreCase(color)) {
            return new Red();
        }
        else if ("Green".equalsIgnoreCase(color)) {
            return new Green();
        }
        else if ("Blue".equalsIgnoreCase(color)) {
            return new Blue();
        }

        return null;
    }
}
