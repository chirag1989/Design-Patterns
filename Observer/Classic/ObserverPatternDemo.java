package DesignPatterns.Observer.Classic;

public class ObserverPatternDemo {

    public static final int STATE1 = 15;
    public static final int STATE2 = 20;

    public static void main(String... args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First change in state: " + STATE1);
        subject.setState(STATE1);

        System.out.println("Second change in state: " + STATE2);
        subject.setState(STATE2);
    }
}