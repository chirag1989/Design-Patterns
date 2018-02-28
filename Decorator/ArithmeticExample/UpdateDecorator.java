package DesignPatterns.Decorator.ArithmeticExample;

public abstract class UpdateDecorator implements Number {

    protected Number updatedNumber;

    public UpdateDecorator(Number updatedNumber) {
        this.updatedNumber = updatedNumber;
    }

    @Override
    public int getValue() {
        return updatedNumber.getValue();
    }
}
