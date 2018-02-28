package DesignPatterns.Decorator.ArithmeticExample;

public class ArithmeticDemo {

    public static void main(String[] args) {

        // The basic version
        Number number1 = new OriginalValue();
        System.out.println(number1.getValue());

        // Few Possible Permutations
        Number number2 = new ValueMultipliedByTwo(new OriginalValue());
        System.out.println(number2.getValue());

        Number number3 = new ValuePlusOne(new OriginalValue());
        System.out.println(number3.getValue());

        Number number4 = new ValuePlusOne(new ValueMultipliedByTwo(new OriginalValue()));
        System.out.println(number4.getValue());
    }
}
