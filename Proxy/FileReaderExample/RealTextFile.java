package DesignPatterns.Proxy.FileReaderExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class RealTextFile implements TextFile {

    private List<String> list = new ArrayList<>();
    private String fileName;

    public RealTextFile(String fileName) {
        this.fileName = fileName;
        loadTheFile(fileName);
    }

    @Override
    public void printContents() {
        System.out.println("Printing the contents...");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private void loadTheFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Loading the contents...");
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
