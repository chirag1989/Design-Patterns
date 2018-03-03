package DesignPatterns.Singleton.ClassicExample;

public class SingletonPatternDemo {

    public static void main(String... args) {
        Singleton singleton1 = Singleton.getSingleton();
        singleton1.printMessage();

        Singleton singleton2 = Singleton.getSingleton();
        singleton2.printMessage();
    }
}
