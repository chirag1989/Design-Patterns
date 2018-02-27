package DesignPatterns.Observer.FileUpdateObserver;

public class FileUpdateDemo {

    public static void main(String... args) throws Exception {

        Source source = new Source();

        new TextFileFormat(source);
        new CsvFileFormat(source);
        new TsvFileFormat(source);

        source.updateData(1);
        source.updateData(2);
    }
}