package DesignPatterns.AbstractFactory.ShapeColorExample;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Color::Red");
    }
}
