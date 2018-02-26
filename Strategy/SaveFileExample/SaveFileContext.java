package DesignPatterns.Strategy.SaveFileExample;

public class SaveFileContext {

    private SaveFileStrategy saveFileStrategy;

    // Set at runtime
    public void setSaveFileStrategy(SaveFileStrategy saveFileStrategy) {
        this.saveFileStrategy = saveFileStrategy;
    }

    // Using the strategy
    public void saveFile(int[] arr) {
        saveFileStrategy.saveAsFile(arr);
    }
}