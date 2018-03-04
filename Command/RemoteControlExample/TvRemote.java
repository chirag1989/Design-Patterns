package DesignPatterns.Command.RemoteControlExample;

public class TvRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
