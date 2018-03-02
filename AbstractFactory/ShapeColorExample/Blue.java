package DesignPatterns.AbstractFactory.ShapeColorExample;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Color::Blue");
    }
}
