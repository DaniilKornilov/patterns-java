package structural.bridge.remote;

import structural.bridge.device.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }

}
