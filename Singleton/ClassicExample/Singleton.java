package DesignPatterns.Singleton.ClassicExample;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("A singleton gets created");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    public void printMessage() {
        System.out.println("A Singleton Object");
    }
}
