package DesignPatterns.Decorator.ShapeExample;

public class DecoratorPatternDemo {

    public static void main(String... args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());

        System.out.println("A circle");
        circle.draw();

        System.out.println("A red Circle");
        redCircle.draw();

        System.out.println("A green Rectangle");
        greenRectangle.draw();
    }
}
