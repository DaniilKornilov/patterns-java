package structural.adapter.socket;

import structural.adapter.connector.RussianPlugConnector;

public class RussianElectricalSocket implements ElectricalSocket {

    private final RussianPlugConnector russianPlugConnector;

    public RussianElectricalSocket(RussianPlugConnector russianPlugConnector) {
        this.russianPlugConnector = russianPlugConnector;
    }

    @Override
    public void plugIn() {
        russianPlugConnector.provideElectricity();
    }
}
