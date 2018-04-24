package DesignPatterns.Observer.FileUpdateObserver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileFormat extends FileFormat {

    public final String DIR_PATH = "/home/varunu28/Documents/JavaPrac/src/DesignPatterns/";
    public File file = new File(DIR_PATH + "file.txt");

    public TextFileFormat(Source source) throws Exception {
        this.source = source;
        this.source.attachFileFormats(this);

        if (file.exists()) {
            file.delete();
        }
        else {
            file.createNewFile();
        }
    }

    @Override
    public void updateFile() throws Exception {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

            writer.write(source.getUpdatedData() + "\n");

            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Updated to Text file");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}