package DesignPatterns.Decorator.ArithmeticExample;

public class ValuePlusOne extends UpdateDecorator {

    public ValuePlusOne(Number updatedNumber) {
        super(updatedNumber);
    }

    @Override
    public int getValue() {
        return updatedNumber.getValue() + 1;
    }
}
