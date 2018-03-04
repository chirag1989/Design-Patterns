package DesignPatterns.Command.RemoteControlExample;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args) {

        ElectronicDevice electronicDevice = TvRemote.getDevice();

        // Turning TV On

        TurnTvOn onCommand = new TurnTvOn(electronicDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        // Turning TV Off

        TurnTvOff offCommand = new TurnTvOff(electronicDevice);

        DeviceButton offPressed = new DeviceButton(offCommand);

        offPressed.press();

        // Turning Volume Up

        TurnTvUp volUpCommand = new TurnTvUp(electronicDevice);

        onPressed = new DeviceButton(volUpCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();

        // Making a new television and a radio

        Television tv = new Television();

        Radio radio = new Radio();

        // Adding all devices

        List<ElectronicDevice> allDevices = new ArrayList<>();
        allDevices.add(tv);
        allDevices.add(radio);

        // Turning off all devices

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();

        // Playing with Undo

        turnThemOff.pressUndo();
    }
}
