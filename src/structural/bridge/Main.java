package structural.bridge;

import structural.bridge.device.Device;
import structural.bridge.device.Radio;
import structural.bridge.device.Tv;
import structural.bridge.remote.AdvancedRemote;
import structural.bridge.remote.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.volumeDown();
        basicRemote.volumeUp();
        basicRemote.channelDown();
        basicRemote.channelUp();
        System.out.println(device);

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        System.out.println(device);
    }
}
