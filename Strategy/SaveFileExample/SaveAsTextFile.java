package DesignPatterns.Strategy.SaveFileExample;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveAsTextFile implements SaveFileStrategy {

    public final String DIR_PATH = "/home/varunu28/Documents/JavaPrac/src/DesignPatterns/";

    @Override
    public void saveAsFile(int[] arr) {

        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(DIR_PATH + "file.txt"));

            for (int a : arr) {
                writer.write(a + "\n");
            }

            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Successfully written as a text file");
    }
}