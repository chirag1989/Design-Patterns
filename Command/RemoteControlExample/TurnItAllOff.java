package DesignPatterns.Command.RemoteControlExample;

import java.util.List;

public class TurnItAllOff implements Command {

    List<ElectronicDevice> devices;

    public TurnItAllOff(List<ElectronicDevice> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : devices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : devices) {
            device.on();
        }
    }
}
