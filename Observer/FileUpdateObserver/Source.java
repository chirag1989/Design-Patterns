package DesignPatterns.Observer.FileUpdateObserver;

import java.util.ArrayList;
import java.util.List;

public class Source {

    private final List<FileFormat> fileFormats = new ArrayList<>();
    private final List<Integer> dataState = new ArrayList<>();

    public int getUpdatedData() {
        return dataState.get(dataState.size()-1);
    }

    public void updateData(int data) throws Exception {
        this.dataState.add(data);
        notifyAllObservers();
    }

    public void attachFileFormats(FileFormat fileFormat) {
        fileFormats.add(fileFormat);
    }

    public void detachFileFormat(FileFormat fileFormat) {
        fileFormats.remove(fileFormat);
    }

    public void notifyAllObservers() throws Exception {
        for (FileFormat fileFormat : fileFormats) {
            fileFormat.updateFile();
        }
    }
}