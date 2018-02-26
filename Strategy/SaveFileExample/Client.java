package DesignPatterns.Strategy.SaveFileExample;

public class Client {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        SaveFileContext saveFileContext = new SaveFileContext();

        // Saving as a Text File
        saveFileContext.setSaveFileStrategy(new SaveAsTextFile());
        saveFileContext.saveFile(arr);

        // Saving as a Text File
        saveFileContext.setSaveFileStrategy(new SaveAsCsvFile());
        saveFileContext.saveFile(arr);

        // Saving as a Text File
        saveFileContext.setSaveFileStrategy(new SaveAsTsvFile());
        saveFileContext.saveFile(arr);
    }
}
