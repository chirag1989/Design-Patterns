package DesignPatterns.Proxy.FileReaderExample;

public class ProxyTextFileDemo {

    public static final String FILE_PATH = "/home/varunu28/Documents/JavaPrac/src/test.txt";
    public static void main(String... args) {

        TextFile textFile = new ProxyTextFile(FILE_PATH);

        textFile.printContents();
        System.out.println();

        // Does not load the contents second time
        textFile.printContents();
    }
}
