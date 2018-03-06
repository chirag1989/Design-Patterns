package DesignPatterns.Facade.ShapeExample;

public class ShapeMakerDemo {

    public static void main(String... args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSqaure();
        shapeMaker.drawRectangle();
    }
}
