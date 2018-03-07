package DesignPatterns.Proxy.ImageExample;

public class ProxyImageDemo {

    public static void main(String... args) {
        Image image = new ProxyImage("test.jpeg");

        image.display();
        System.out.println();

        image.display();
    }
}
