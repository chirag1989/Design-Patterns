package DesignPatterns.Decorator.ArithmeticExample;

public class ValueMultipliedByTwo extends UpdateDecorator {

    public ValueMultipliedByTwo(Number updatedNumber) {
        super(updatedNumber);
    }

    @Override
    public int getValue() {
        return updatedNumber.getValue() << 1;
    }
}
