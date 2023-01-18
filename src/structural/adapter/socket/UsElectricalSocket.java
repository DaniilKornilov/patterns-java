package structural.adapter.socket;

import structural.adapter.connector.UsPlugConnector;

public class UsElectricalSocket implements ElectricalSocket {

    private final UsPlugConnector usPlugConnector;

    public UsElectricalSocket(UsPlugConnector usPlugConnector) {
        this.usPlugConnector = usPlugConnector;
    }

    @Override
    public void plugIn() {
        usPlugConnector.supplyElectricity();
    }
}
