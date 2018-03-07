package DesignPatterns.Proxy.FileReaderExample;

public class ProxyTextFile implements TextFile {

    private RealTextFile realTextFile;
    private String fileName;

    public ProxyTextFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printContents() {
        if (realTextFile == null) {
            realTextFile = new RealTextFile(fileName);
        }
        realTextFile.printContents();
    }
}
