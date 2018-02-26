package DesignPatterns.Strategy.SaveFileExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsCsvFile implements SaveFileStrategy {

    public final String DIR_PATH = "/home/varunu28/Documents/JavaPrac/src/DesignPatterns/";

    @Override
    public void saveAsFile(int[] arr) {

        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(DIR_PATH + "file.csv"));

            for (int a : arr) {
                writer.write(a + ", ");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Successfully written as a CSV file");
    }
}
