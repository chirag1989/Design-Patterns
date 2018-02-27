package DesignPatterns.Observer.FileUpdateObserver;

public abstract class FileFormat {
    protected Source source;
    public abstract void updateFile() throws Exception;
}
