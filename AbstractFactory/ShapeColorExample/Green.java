package DesignPatterns.AbstractFactory.ShapeColorExample;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Color::Green");
    }
}
